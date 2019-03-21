package comm.test.score;

import javax.annotation.Resource;

import org.junit.Test;

import cn.kgc.tangcco.tcm073.xumaofeng.course.service.CourseService;
import cn.kgc.tangcco.tcm073.xumaofeng.grade.service.GradeService;
import cn.kgc.tangcco.tcm073.xumaofeng.student.service.StudentService;
import comm.test.base.BaseTest;

public class score extends BaseTest{
	
	@Resource
	private CourseService courseService;
	
	@Resource
	private StudentService studentService;
	
	@Resource
	private GradeService gradeService;
	
	@Test
	public void testDeleteCourse() {
		System.out.println(courseService.deleteCourse(10));
		
	}
	
	
	@Test
	public void testDeleteStudent() {
		System.out.println(studentService.deleteStudent(36));
	}
	
	
	@Test
	public void testDeleteGrade() {
		System.out.println(gradeService.deleteGrade(21));
	}
	
}
