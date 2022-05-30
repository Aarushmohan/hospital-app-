package com.ty.hospital.controller.User;

import com.ty.hospital.dto.User;
import com.ty.hospital.service.implementation.UserServiceImp;

public class TestDeleteById {
	public static void main(String[] args) {
		UserServiceImp userServiceImp = new UserServiceImp();
		User user = userServiceImp.deleteUserById(2);
		if (user != null) {
			System.out.println("Deleted succesfully");
		} else {
			System.out.println("No data is found");
		}
	}
}
