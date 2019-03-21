package cn.kgc.tangcco.tcm073.xumaofeng.student.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kgc.tangcco.tcm073.xumaofeng.entity.Student;
import cn.kgc.tangcco.tcm073.xumaofeng.student.service.StudentService;

@Controller
public class StudentController {

	
	@Resource
	private StudentService studentService;
	
	private static final String REDIRECT = "redirect:doListStudent.controller";
	
	@RequestMapping("doListStudent")
	public String doListStudent(Student student,Model model) {
		int pageNumber = 1, pageSize = 5;
		
		model.addAttribute("liststudent", studentService.queryAllStudent(student, pageNumber, pageSize));
		return "student/liststudent";
	}
	
	@RequestMapping("toAddStudent")
	public String toAddStudent(Model model) {
		model.addAttribute("grade", studentService.queryGradeAndStudent());
		return "student/addstudent";
	}
	@RequestMapping("doAddStudent")
	public String doAddStudent(Student student,Model model) {
		System.out.println("================"+student);
		studentService.addStudent(student);
		return REDIRECT;
	}
	
	@RequestMapping("toUpdateStudent")
	public String toUpdateStudent(Integer stuid,Model model) {
		System.err.println(studentService.detailStudent(stuid));
		model.addAttribute("student", studentService.detailStudent(stuid));
		model.addAttribute("grade", studentService.queryGradeAndStudent());
		return "student/updatestudent";
	}
	
	@RequestMapping("doUpdateStudent")
	public String doUpdateStudent(Student student,Model model) {
		studentService.updateStudent(student);
		return REDIRECT;
	}
	
	
	@RequestMapping("doDeleteStudent")
	public String doDeleteStudent(Integer stuid,Model model) {
		studentService.deleteStudent(stuid);
		return REDIRECT;
	}
	
	@RequestMapping("doDetailStudent")
	public String doDetailStudent(Integer stuid,Model model) {
		System.out.println("----------stuid"+stuid);
		model.addAttribute("student", studentService.detailStudent(stuid));
		return "student/detailstudent";
	}
	
	
	
}
