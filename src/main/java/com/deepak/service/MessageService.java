package com.deepak.service;

import java.util.List;

import com.deepak.exception.ChatException;
import com.deepak.exception.MessageException;
import com.deepak.exception.UserException;
import com.deepak.model.Message;
import com.deepak.request.SendMessageRequest;

public interface MessageService  {
	
	public Message sendMessage(SendMessageRequest req) throws UserException, ChatException;
	
	public List<Message> getChatsMessages(Integer chatId) throws ChatException;
	
	public Message findMessageById(Integer messageId) throws MessageException;
	
	public String deleteMessage(Integer messageId) throws MessageException;

}
