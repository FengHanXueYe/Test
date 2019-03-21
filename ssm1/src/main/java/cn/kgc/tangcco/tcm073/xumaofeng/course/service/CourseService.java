package cn.kgc.tangcco.tcm073.xumaofeng.course.service;

import java.util.List;


import cn.kgc.tangcco.tcm073.xumaofeng.entity.Course;

public interface CourseService {

	int addCourse(Course course);

	int updateCourse(Course course);

	int deleteCourse(Integer courseid);

	Course queryCourse(Integer courseid);

	List<Course> queryAll();
}
