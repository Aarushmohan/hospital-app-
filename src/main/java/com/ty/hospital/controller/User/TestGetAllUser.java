package com.ty.hospital.controller.User;

import java.util.List;

import com.ty.hospital.dto.User;
import com.ty.hospital.service.implementation.UserServiceImp;

public class TestGetAllUser {
	public static void main(String[] args) {
		UserServiceImp userServiceImp = new UserServiceImp();
		List<User> list = userServiceImp.getAllUser();
		if (list.size() > 0) {
			for (User user : list) {
				System.out.println("User Id        :" + user.getId());
				System.out.println("User Name      :" + user.getName());
				System.out.println("User Email     :" + user.getEmail());
				System.out.println("User phone     :" + user.getPhone());
				System.out.println("User Role      :" + user.getRole());
				System.out.println("-----------------------------------------");
			}
		} else {
			System.out.println("No data is Available");
		}
	}
}
