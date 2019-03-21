package cn.kgc.tangcco.tcm073.xumaofeng.grade.service;

import java.util.List;


import cn.kgc.tangcco.tcm073.xumaofeng.entity.Grade;

public interface GradeService {
	int addGrade(Grade grade);

	int updateGrade(Grade grade);

	int deleteGrade(Integer gradeid);

	List<Grade> queryAllGrade();

	List<Grade> queryGradeAndStudent();

	Grade queryGradeById(Integer gradeid);
}
