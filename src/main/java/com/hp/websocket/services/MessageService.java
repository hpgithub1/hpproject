package com.hp.websocket.services;

import com.alibaba.druid.sql.visitor.functions.Insert;
import com.hp.websocket.model.Message;

public interface MessageService {
	void insert(Message message); 
}
