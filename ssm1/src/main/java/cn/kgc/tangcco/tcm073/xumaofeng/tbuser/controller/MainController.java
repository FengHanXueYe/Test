package cn.kgc.tangcco.tcm073.xumaofeng.tbuser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value="top")
	public String top() {
		return "main/top";
	}
	@RequestMapping(value="left")
	public String left() {
		return "main/left";
	}
	@RequestMapping(value="right")
	public String right() {
		return "main/right";
	}
}
