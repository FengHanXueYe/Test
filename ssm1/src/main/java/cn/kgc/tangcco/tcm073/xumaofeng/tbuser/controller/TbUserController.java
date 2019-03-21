package cn.kgc.tangcco.tcm073.xumaofeng.tbuser.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kgc.tangcco.tcm073.xumaofeng.entity.TbUser;
import cn.kgc.tangcco.tcm073.xumaofeng.tbuser.service.TbUserService;

@Controller
public class TbUserController {

	@Resource
	private TbUserService tbs;
	
	private static final String REDIRECT = "redirect:doListUser.controller";
	
	@RequestMapping("doLoginUser")
	public String doLoginUser(TbUser user,HttpSession session) {
		if(user != null) {
			session.setAttribute("login",tbs.login(user));
		}
		return "main/main";
	}
	
	@RequestMapping("doListUser")
	public String doListUser(TbUser user,Model model) {
		System.err.println(user);
		model.addAttribute("users", tbs.listTbUsers(user));
		model.addAttribute("user", user);
		return "user/listuser";
	}
	
	
	@RequestMapping("toAddUser")
	public String toAddUser(Model model) {
		return "user/adduser";
	}
	
	
	@RequestMapping("doAddUser")
	public String doAddUser(TbUser user,Model model) {
		tbs.addUser(user);
		return REDIRECT;
	}
	
	@RequestMapping("doDetailUser")
	public String doDetailUser(Integer userid,Model model) {
		model.addAttribute("user", tbs.detailUser(userid));
		return "user/detailuser";
	}
	
	
	@RequestMapping("toUpdateUser")
	public String toUpdateUser(Integer userid,Model model) {
		model.addAttribute("user", tbs.detailUser(userid));
		return "user/updateuser";
	}
	
	@RequestMapping("doUpdateUser")
	public String doUpdateUser(TbUser user,Model model) {
		tbs.updateUser(user);
		return REDIRECT;
	}
	
	@RequestMapping("doDeleteUser")
	public String doDeleteUser(Integer userid,Model model) {
		tbs.deleteUser(userid);
		return REDIRECT;
	}
	
	
	
}
