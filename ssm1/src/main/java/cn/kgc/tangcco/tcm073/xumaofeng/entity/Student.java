package cn.kgc.tangcco.tcm073.xumaofeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private Integer stuid;
	private Grade grade;
	private String stuname,gender,stunum;
	private Integer age;
}
