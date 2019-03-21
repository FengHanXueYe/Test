package cn.kgc.tangcco.tcm073.xumaofeng.course.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import cn.kgc.tangcco.tcm073.xumaofeng.course.mapper.CourseMapper;
import cn.kgc.tangcco.tcm073.xumaofeng.course.service.CourseService;
import cn.kgc.tangcco.tcm073.xumaofeng.entity.Course;
import cn.kgc.tangcco.tcm073.xumaofeng.score.mapper.ScoreMapper;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Resource
	private CourseMapper coursem;
	
	@Resource
	private ScoreMapper scoreMapper;
	
	@Override
	public int addCourse(Course course) {
		return coursem.addCourse(course);
	}

	@Override
	public int updateCourse(Course course) {
		return coursem.updateCourse(course);
	}
	@Transactional
	@Override
	public int deleteCourse(Integer courseid) {
		scoreMapper.deleteScoreByGradeId(courseid);
		int rows = coursem.deleteCourse(courseid);
		return rows;
	}

	@Override
	public Course queryCourse(Integer courseid) {
		return coursem.queryCourse(courseid);
	}

	@Override
	public List<Course> queryAll() {
		return coursem.queryAll();
	}

}
