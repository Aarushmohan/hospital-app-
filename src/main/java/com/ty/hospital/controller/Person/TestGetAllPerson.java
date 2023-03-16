package com.ty.hospital.controller.Person;

import java.util.List;

import com.ty.hospital.dto.Person;
import com.ty.hospital.service.implementation.PersonServiceImp;

public class TestGetAllPerson {
	public static void main(String[] args) {
		PersonServiceImp personServiceIcmp = new PersonServiceImp();
		List<Person> list = personServiceIcmp.getPerson();
		if(list.size()>0)
		{
			for(Person person:list)
			{
				System.out.println("Person Id :"+person.getId());
				System.out.println("Person Name:"+person.getName());
				System.out.println("Person Email :"+person.getEmail());
				System.out.println("Person Phone:"+person.getPhone());
				System.out.println("Person Age :"+person.getAge());
				System.out.println("Person Gender:"+person.getGender());
				System.out.println("-------------------------------------------");
			}
		}else {
			System.out.println("No data is found");
		}
	}
}
