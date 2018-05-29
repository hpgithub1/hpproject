package com.hp.websocket.servicesImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hp.websocket.mapping.UserMapper;
import com.hp.websocket.model.User;
import com.hp.websocket.model.UserExample;
import com.hp.websocket.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	public UserMapper userMapper;
	public boolean checkLogin(User user) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		example.createCriteria().andIdEqualTo(user.getId()).andNameEqualTo(user.getName());
		List<User> users = userMapper.selectByExample(example);
		if(users != null && users.size()>0) {
			return true;
		}
		else {
			return false;
		}
	}

}
