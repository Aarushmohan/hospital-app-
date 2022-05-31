package com.ty.hospital.controller.Person;

import com.ty.hospital.service.implementation.PersonServiceImp;

public class TestDeletePerson {
	public static void main(String[] args) {
		PersonServiceImp personServiceIcmp = new PersonServiceImp();
		boolean res = personServiceIcmp.deletePersonById(2);
		if (res != false) {
			System.out.println("Data is deleted");
		} else {
			System.out.println("No data is found");
		}
	}
}
