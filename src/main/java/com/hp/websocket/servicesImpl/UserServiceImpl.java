package com.hp.websocket.servicesImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hp.websocket.services.UserService;

import andy.dao.UserMapper;
import andy.model.User;
import andy.model.UserExample;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	public UserMapper userMapper;
	public boolean checkLogin(User user) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());
		List<User> users = userMapper.selectByExample(example);
		if(users != null && users.size()>0) {
			return true;
		}
		else {
			return false;
		}
	}
	public List<User> findByUserName(String userName) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(userName);
		List<User> users = userMapper.selectByExample(example);
		return users;
	}
	public void updateByUser(User user) {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKey(user);
	}
	public List<User> findByName(String name) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		example.createCriteria().andNameEqualTo(name);
		List<User> users = userMapper.selectByExample(example);
		return users;
	}

}
