package cn.kgc.tangcco.tcm073.xumaofeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {
	
	private Integer scoreid;
	private Integer stuid;
	private Integer courseid;
	private double score;
	
}
