package com.ty.hospital.controller.User;

import com.ty.hospital.dto.User;
import com.ty.hospital.service.implementation.UserServiceImp;

public class TestUpdateUser {
	public static void main(String[] args) {
		User user = new User();
		user.setName("Raki");
		user.setEmail("raki@mail.com");
		user.setPassword("raki@123");

		UserServiceImp userServiceImp = new UserServiceImp();
		User user1 = userServiceImp.updateUser(user, 2);
		if (user1 != null) {
			System.out.println("Data is updated");
		} else {
			System.out.println("No data is Available");
		}
	}
}
