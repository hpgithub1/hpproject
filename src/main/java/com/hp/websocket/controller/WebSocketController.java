package com.hp.websocket.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hp.websocket.services.UserService;

import andy.model.User;

@Controller
@RequestMapping(value = "/web")
public class WebSocketController {

	@Resource
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value = "/login")
	public Map<String,Object> login(User user,HttpServletRequest request) {
		 Map<String,Object> map = new HashMap<String, Object>();
		 HttpSession session = request.getSession();
		 boolean flag = userService.checkLogin(user);
		 List<User> users = userService.findByUserName(user.getUsername());
		 session.setAttribute("user", users.get(0));
		 if(flag) {
			map.put("code","0");
			return map;
		}
		else {
			map.put("code", "1");
			return map;
		}
		 
	}
	
	@ResponseBody
	@RequestMapping(value="/updataPassWord")
	public Map<String, Object> updataPassWord(String password,String newpassword,String newpassword2,HttpServletRequest request){
		Map<String,Object> map = new HashMap<String, Object>();
		User user = (User) request.getSession().getAttribute("user");
		User user2 = userService.findByName(user.getName()).get(0);
		if(password.equals(user2.getPassword())) {
			if(newpassword.equals(newpassword2)) {
				user.setPassword(newpassword2);
				userService.updateByUser(user);
				map.put("code", "0");//原密码符合，2次输入的密码相等
			}
			else 
				map.put("code", "1");//原密码符合，2次输入的密码不相等
			
		}
		else
			map.put("code", "2");//原密码不等
		return map;
		
	}
	
	
	
	
}
