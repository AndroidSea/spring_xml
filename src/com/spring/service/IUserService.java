package com.spring.service;

import com.spring.model.User;

public interface IUserService {
	public void add(User eu);
	public void delete(int id);
	public void load(int id);
	public void addUser();
}
