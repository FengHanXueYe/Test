package cn.kgc.tangcco.tcm073.xumaofeng.grade.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kgc.tangcco.tcm073.xumaofeng.entity.Grade;
import cn.kgc.tangcco.tcm073.xumaofeng.grade.service.GradeService;

@Controller
public class GradeController {

	@Resource
	private GradeService gradeservice;
	
	private static final String REDIRECT = "redirect:doListGrade.controller";
	
	@RequestMapping("doListGrade")
	public String doListGrade(Model model) {
		model.addAttribute("listgrade",gradeservice.queryAllGrade());
		return "grade/listgrade";
	}
	
	
	@RequestMapping("toAddGrade")
	public String toAddGrade(Model model) {

		return "grade/addgrade";
	}
	
	@RequestMapping("doAddGrade")
	public String doAddGrade(Grade grade,Model model) {
		gradeservice.addGrade(grade);
		return REDIRECT;
	}
	
	@RequestMapping("toUpdateGrade")
	public String toUpdateGrade(Integer gradeid,Model model) {
		model.addAttribute("grade", gradeservice.queryGradeById(gradeid));
		return "grade/updategrade";
	}
	
	
	@RequestMapping("doUpdateGrade")
	public String doUpdateGrade(Grade grade,Model model) {
		gradeservice.updateGrade(grade);
		return REDIRECT;
	}
	
	@RequestMapping("doDeleteGrade")
	public String doDeleteGrade(Integer gradeid,Model model) {
		gradeservice.deleteGrade(gradeid);
		return REDIRECT;
	}
	
	
}
