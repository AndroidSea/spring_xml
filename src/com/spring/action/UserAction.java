package com.spring.action;

import com.spring.model.User;
import com.spring.service.IUserService;

// action 表示的是控制层
public class UserAction {
	
	private int id;
	private User userModel;
	private IUserService userService;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUserModel() {
		return userModel;
	}

	public void setUserModel(User userModel) {
		this.userModel = userModel;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public void addUser(){
		userService.add(userModel);
	}
	
	public void delete(){
		userService.delete(id);
	}
	
	public void load(){
		userService.load(id);
	}
	

}
