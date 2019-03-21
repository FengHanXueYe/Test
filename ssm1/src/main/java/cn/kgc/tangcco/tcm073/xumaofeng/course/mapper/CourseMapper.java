package cn.kgc.tangcco.tcm073.xumaofeng.course.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.kgc.tangcco.tcm073.xumaofeng.entity.Course;

public interface CourseMapper {
	
	@Insert(value="insert into course value(null,#{coursename})")
	int addCourse(Course course);
	@Update(value="update course set coursename=#{coursename} where courseid=#{courseid}")
	int updateCourse(Course course);
	@Delete(value="delete from course where courseid=#{courseid}")
	int deleteCourse(Integer courseid);
	@Select(value="select * from course where courseid=#{courseid}")
	Course queryCourse(Integer courseid);
	@Select(value="select * from course")
	List<Course> queryAll();
	
}
