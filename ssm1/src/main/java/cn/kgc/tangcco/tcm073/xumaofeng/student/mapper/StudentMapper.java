package cn.kgc.tangcco.tcm073.xumaofeng.student.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import cn.kgc.tangcco.tcm073.xumaofeng.entity.Student;

public interface StudentMapper {
	@Insert(value = "insert into student value(null,#{grade.gradeid},#{stuname},#{gender},#{stunum},#{age})")
	int addStudent(Student student);

	@Update(value = "update student set gradeid=#{grade.gradeid},stuname=#{stuname},gender=#{gender},stunum=#{stunum},age=#{age} where stuid=#{stuid}")
	int updateStudent(Student student);

	@Delete(value = "delete from student where stuid=#{stuid} ")
	int deleteStudent(Integer pk);

	@Delete(value="delete from student where gradeid=#{gradeid}")
	int deleteStudentByGradeId(Integer pk);
	
	Student detailStudent(Integer pk);

	List<Student> queryAllStudent(Student student);
}
