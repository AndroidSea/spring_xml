package com.spring.dao;

import com.spring.model.User;


public interface IUserDao {
	public void add(User eu);
	public void delete(int id);
	public void load(int id);
	public void addUser();
}
