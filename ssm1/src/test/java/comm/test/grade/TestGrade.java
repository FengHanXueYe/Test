package comm.test.grade;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.kgc.tangcco.tcm073.xumaofeng.entity.Grade;
import cn.kgc.tangcco.tcm073.xumaofeng.entity.Student;
import cn.kgc.tangcco.tcm073.xumaofeng.grade.service.GradeService;
import comm.test.base.BaseTest;

public class TestGrade extends BaseTest {

	@Resource
	private GradeService gradeservice;

	List<Student> students = new ArrayList<>();

	@Test
	public void testAddGrade() {
		System.out.println(gradeservice.addGrade(new Grade(null, "神仙班", students)));
	}

	@Test
	public void testQueryGradeAll() {
		System.out.println(gradeservice.queryAllGrade());
		List<Grade> listgrade = gradeservice.queryAllGrade();
		PageHelper.startPage(1, 5);
		PageInfo<Grade> pageinfo = new PageInfo<>(listgrade);
		for (Grade g : pageinfo.getList()) {
			System.err.println(g);
		}
		System.out.println(pageinfo.getTotal());
	}

	@Test
	public void testS() {

		for (int a = 1; a <= 9; a++) {
			for (int q = 9; q >= a; q--) {
				System.out.print(" ");
			}
			for (int q = 1; q < a; q++) {
				System.out.print("*");
			}
			for (int x = 1; x <= a; x++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int a = 1; a <= 8; a++) {

			for (int x = 0; x <= a; x++) {
				System.out.print(" ");
			}
			for (int q = 8; q >= a; q--) {
				System.out.print("*");
			}
			for (int q = 8; q > a; q--) {
				System.out.print("*");
			}

			System.out.println();

		}

	}

	@Test
	public void testUUid() {
		System.out.println(UUID.randomUUID());
		
		
	}

}
