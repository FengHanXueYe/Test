package cn.kgc.tangcco.tcm073.xumaofeng.student.service;

import java.util.List;


import com.github.pagehelper.PageInfo;

import cn.kgc.tangcco.tcm073.xumaofeng.entity.Grade;
import cn.kgc.tangcco.tcm073.xumaofeng.entity.Student;

public interface StudentService {
	int addStudent(Student student);

	int updateStudent(Student student);

	int deleteStudent(Integer pk);

	Student detailStudent(Integer pk);
	
	List<Grade> queryGradeAndStudent();
	
	PageInfo<Student> queryAllStudent(Student student,int pageNumber,int pageSize) ;
}
