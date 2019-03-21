package cn.kgc.tangcco.tcm073.xumaofeng.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grade {
	private Integer gradeid;
	private String gradename;
	List<Student> students;
	
}
