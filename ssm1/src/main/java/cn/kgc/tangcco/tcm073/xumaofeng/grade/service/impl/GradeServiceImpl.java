package cn.kgc.tangcco.tcm073.xumaofeng.grade.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import cn.kgc.tangcco.tcm073.xumaofeng.entity.Grade;
import cn.kgc.tangcco.tcm073.xumaofeng.grade.mapper.GradeMapper;
import cn.kgc.tangcco.tcm073.xumaofeng.grade.service.GradeService;
import cn.kgc.tangcco.tcm073.xumaofeng.score.mapper.ScoreMapper;
import cn.kgc.tangcco.tcm073.xumaofeng.student.mapper.StudentMapper;

@Service
public class GradeServiceImpl implements GradeService {

	@Resource
	private GradeMapper gMap;
	
	@Resource
	private ScoreMapper scoreMapper;
	@Resource
	private StudentMapper studentMapper;
	@Override
	public int addGrade(Grade grade) {
		System.out.println("-------------->"+grade);
		return gMap.addGrade(grade);
	}

	@Override
	public int updateGrade(Grade grade) {
		return gMap.updateGrade(grade);
	}
	@Transactional
	@Override
	public int deleteGrade(Integer gradeid) {
		scoreMapper.deleteStudentByGradeId(gradeid);
		studentMapper.deleteStudentByGradeId(gradeid);
		int rows = gMap.deleteGrade(gradeid);
		return rows;
	}

	@Override
	public List<Grade> queryAllGrade() {
		return gMap.queryAllGrade();
	}

	@Override
	public List<Grade> queryGradeAndStudent() {
		return gMap.queryGradeAndStudent();
	}

	@Override
	public Grade queryGradeById(Integer gradeid) {
		return gMap.queryGradeById(gradeid);
	}

}
