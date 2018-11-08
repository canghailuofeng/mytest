package cn.travelsky.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.travelsky.ssm.pojo.pojo;
import cn.travelsky.ssm.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("insert.action")
	public String insert(pojo pojo) {
		userService.insert(pojo);
		return "success";
	}
}
