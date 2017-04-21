package com.spring.action;

import java.util.List;

import com.spring.model.User;
import com.spring.service.IUserService;

// action 表示的是控制层
public class UserAction {
	
	private int id;
	private User userModel;
	private IUserService userService;
	private List<String> strList;
	
	public List<String> getStrList() {
		return strList;
	}

	public void setStrList(List<String> strList) {
		this.strList = strList;
	}

	public UserAction(int id, IUserService userService) {
		this.id = id;
		this.userService = userService;
	}

	public UserAction() {
	}

	public UserAction(IUserService userService) {
		this.userService = userService;
	}

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
