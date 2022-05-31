package com.ty.hospital.controller.Person;

import com.ty.hospital.dto.Person;
import com.ty.hospital.service.implementation.PersonServiceImp;

public class TestUpdatePerson {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Ramu");
		person.setGender("Male");
		person.setAge(24);
		person.setEmail("ramu@mail.com");
		person.setPhone(97654321);

		PersonServiceImp personServiceIcmp = new PersonServiceImp();
		Person person1 = personServiceIcmp.updatePerson(person, 1);
		if (person1 != null) {
			System.out.println("Data is Updated");
		} else {
			System.out.println("No data is found");
		}
	}
}
