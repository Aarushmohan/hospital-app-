package com.ty.hospital.controller.User;

import java.util.List;

import com.ty.hospital.dto.User;
import com.ty.hospital.service.implementation.UserServiceImp;

public class TestValidateUser {
	public static void main(String[] args) {
		UserServiceImp userServiceImp = new UserServiceImp();
		List<User> list = userServiceImp.validateUser("raju@mail.com", "raju@123");
		if (list.size() > 0) {
			System.out.println("User is available");
		} else {
			System.out.println("No data is Available");
		}
	}
}
