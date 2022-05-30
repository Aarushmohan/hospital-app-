package com.ty.hospital.controller.User;

import com.ty.hospital.dto.User;
import com.ty.hospital.service.implementation.UserServiceImp;

public class TestSaveUser {
	public static void main(String[] args) {
		User user = new User();
		user.setName("Ramu");
		user.setEmail("ramu@mail.com");
		user.setPassword("ramu@123");
		user.setPhone(987654322);
		user.setRole("Admin");

		UserServiceImp userServiceImp = new UserServiceImp();
		User user1 = userServiceImp.saveUser(user);
		if (user1 != null) {
			System.out.println("Data is inserted");
		} else {
			System.out.println("No data is Available");
		}
	}
}
