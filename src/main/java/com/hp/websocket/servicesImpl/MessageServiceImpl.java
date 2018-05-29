package com.hp.websocket.servicesImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hp.websocket.mapping.MessageMapper;
import com.hp.websocket.model.Message;
import com.hp.websocket.services.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	@Resource
	private MessageMapper messageMapper;
	
	public void insert(Message message) {
		// TODO Auto-generated method stub
		messageMapper.insert(message);
	}

}
