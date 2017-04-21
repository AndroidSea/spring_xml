package com.spring.dao;

import com.spring.model.User;

public class UserDao implements IUserDao {

	@Override
	public void add(User u) {
		System.out.println("添加了用户"+u);
	}

	@Override
	public void delete(int id) {
		System.out.println("删除了用户"+id);

	}

	@Override
	public void load(int id) {
		System.out.println("load 了用户"+id);
	}

	@Override
	public void addUser() {
		
	}

}
