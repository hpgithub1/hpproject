package com.hp.websocket.services;



import java.util.List;

import andy.model.User;
import andy.model.UserExample;

public interface UserService {
	boolean checkLogin(User user);
	List<User> findByUserName(String userName);
	List<User> findByName(String name); 
	void updateByUser(User user);
}
