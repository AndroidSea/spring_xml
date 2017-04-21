package com.spring.service;

import com.spring.dao.IUserDao;
import com.spring.model.User;
// 采用java的 代理的模式
public class UserService implements IUserService {
	
	private IUserDao userdao;
	
	public IUserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(IUserDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public void add(User eu) {
		userdao.add(eu);
	}

	@Override
	public void delete(int id) {
		userdao.delete(id);

	}

	@Override
	public void load(int id) {
		userdao.load(id);

	}

	@Override
	public void addUser() {
		userdao.addUser();
	}

}
