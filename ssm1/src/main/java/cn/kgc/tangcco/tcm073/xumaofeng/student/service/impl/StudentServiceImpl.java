package cn.kgc.tangcco.tcm073.xumaofeng.student.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.kgc.tangcco.tcm073.xumaofeng.entity.Grade;
import cn.kgc.tangcco.tcm073.xumaofeng.entity.Student;
import cn.kgc.tangcco.tcm073.xumaofeng.grade.mapper.GradeMapper;
import cn.kgc.tangcco.tcm073.xumaofeng.score.mapper.ScoreMapper;
import cn.kgc.tangcco.tcm073.xumaofeng.student.mapper.StudentMapper;
import cn.kgc.tangcco.tcm073.xumaofeng.student.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentMapper studentMapper;
	@Resource
	private GradeMapper gradeMapper;
	
	@Resource
	private ScoreMapper scoreMapper;
	@Override
	public int addStudent(Student student) {
		return studentMapper.addStudent(student);
	}

	@Override
	public int updateStudent(Student student) {
		return studentMapper.updateStudent(student);
	}
	@Transactional
	@Override
	public int deleteStudent(Integer pk) {
		scoreMapper.deleteGradeByGradeId(pk);
		int rows = studentMapper.deleteStudent(pk);
		return rows;
	}

	@Override
	public Student detailStudent(Integer pk) {
		return studentMapper.detailStudent(pk);
	}


	@Override
	public PageInfo<Student> queryAllStudent(Student student, int pageNumber, int pageSize) {
		System.out.println("-----------------------==="+studentMapper.queryAllStudent(student));
		PageHelper.startPage(pageNumber, pageSize);
		List<Student> list = studentMapper.queryAllStudent(student);
		PageInfo<Student> liststudent = new PageInfo<>(list);
		return liststudent;
	}

	@Override
	public List<Grade> queryGradeAndStudent() {
		return gradeMapper.queryGradeAndStudent();
	}

}
