package cn.kgc.tangcco.tcm073.xumaofeng.course.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kgc.tangcco.tcm073.xumaofeng.course.service.CourseService;
import cn.kgc.tangcco.tcm073.xumaofeng.entity.Course;

@Controller
public class CourseController {
	
	private static final String REDIRECT = "redirect:doListCourse.controller";
	
	@Resource
	private CourseService courseservice;
	
	@RequestMapping("doListCourse")
	public String doListCourse(Model model) {
		model.addAttribute("courselist", courseservice.queryAll());
		return "course/listcourse";
	}
	
	@RequestMapping("toAddCourse")
	public String toAddCoure(Model model) {

		return "course/addcourse";
	}
	
	
	@RequestMapping("doAddCourse")
	public String doAddCourse(Course course,Model model) {
		courseservice.addCourse(course);
		return REDIRECT;
	}
	
	
	@RequestMapping("toUpdateCourse")
	public String toUpdateCourse(Integer courseid,Model model) {
		model.addAttribute("course", courseservice.queryCourse(courseid));

		return "course/updatecourse";
	}
	
	
	@RequestMapping("doUpdateCourse")
	public String doUpdateCourse(Course course,Model model) {
		courseservice.updateCourse(course);
		return REDIRECT;
	}

	
	@RequestMapping("doDeleteCourse")
	public String doDeleteCourse(Integer courseid,Model model) {
		courseservice.deleteCourse(courseid);
		return REDIRECT;
	}
	
}
