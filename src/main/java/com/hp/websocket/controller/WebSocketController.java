package com.hp.websocket.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

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
	public Map<String,Object> login(User user, Model model) {
		boolean flag = userService.checkLogin(user);
		 Map map = new HashMap();
		 if(flag) {
			map.put("code","0");
			return map;
		}
		else {
			map.put("code", "1");
			return map;
			
		}
		
	}
	
	
	
	
}
