package com.ty.hospital.controller.Person;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Person;
import com.ty.hospital.service.implementation.PersonServiceImp;

public class TestSavePerson {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Raju");
		person.setGender("Male");
		person.setAge(21);
		person.setEmail("raju@mail.com");
		person.setPhone(97654321);

		
		Encounter encounter = new Encounter();
		encounter.setAdmit_date_time(LocalDateTime.of(2022, 05, 12, 12, 23));
		encounter.setDischarge_date_time(LocalDateTime.now());
		encounter.setReason("fever");
		encounter.setStatus("well");
		encounter.setPerson(person);
		
		List<Encounter> list = new ArrayList<Encounter>();
		list.add(encounter);
		person.setEncounter(list);
		

		PersonServiceImp personServiceImp = new PersonServiceImp();
		Person person1 = personServiceImp.savePerson(person);
		if (person1 != null) {
			System.out.println("Data is inserted");
		} else {
			System.out.println("No data is found");
		}
	}
}
