package cn.kgc.tangcco.tcm073.xumaofeng.grade.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.kgc.tangcco.tcm073.xumaofeng.entity.Grade;

public interface GradeMapper {
	@Insert(value = "insert into grade value(null,#{gradename})")
	int addGrade(Grade grade);

	@Update(value = "update grade set gradename=#{gradename} where gradeid=#{gradeid}")
	int updateGrade(Grade grade);

	@Delete(value = "delete from grade where gradeid=#{gradeid}")
	int deleteGrade(Integer gradeid);

	List<Grade> queryAllGrade();

	List<Grade> queryGradeAndStudent();

	@Select(value = "select * from grade where gradeid=#{gradeid}")
	Grade queryGradeById(Integer gradeid);

}
