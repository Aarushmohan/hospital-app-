package com.ty.hospital.service.implementation;

import java.util.List;

import com.ty.hospital.dao.implematation.UserDaoImp;
import com.ty.hospital.dto.User;
import com.ty.hospital.service.UserService;

public class UserServiceImp implements UserService {
	UserDaoImp userDaoImp = new UserDaoImp();

	public User saveUser(User user) {
		return userDaoImp.saveUser(user);
	}

	public List<User> validateUser(String email, String password) {
		return userDaoImp.validateUser(email, password);
	}

	public List<User> getAllUser() {
		return userDaoImp.getAllUser();
	}

	public User getUserById(int id) {
		return userDaoImp.getUserById(id);
	}

	public User updateUser(User user, int id) {
		return userDaoImp.updateUser(user, id);
	}

	public User deleteUserById(int id) {
		return userDaoImp.deleteUserById(id);
	}
}
