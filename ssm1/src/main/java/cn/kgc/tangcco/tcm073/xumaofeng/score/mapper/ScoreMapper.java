package cn.kgc.tangcco.tcm073.xumaofeng.score.mapper;

import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {

	int deleteScoreByGradeId(@Param("cid")Integer pk);

	int deleteStudentByGradeId(Integer pk);

	int deleteGradeByGradeId(Integer pk);

}
