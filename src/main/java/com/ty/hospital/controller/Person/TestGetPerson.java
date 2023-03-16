package com.ty.hospital.controller.Person;

import java.util.List;

import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Person;
import com.ty.hospital.service.implementation.PersonServiceImp;

public class TestGetPerson {
	public static void main(String[] args) {
		PersonServiceImp personServiceImp = new PersonServiceImp();
		Person person = personServiceImp.getPersonById(1);
		if(person!= null)
		{
			List<Encounter> list = person.getEncounter();
			System.out.println("Person Id :"+person.getId());
			System.out.println("Person Name:"+person.getName());
			System.out.println("Person Email :"+person.getEmail());
			System.out.println("Person Phone:"+person.getPhone());
			System.out.println("Person Age :"+person.getAge());
			System.out.println("Person Gender:"+person.getGender());
			System.out.println("-----------------------------------------");
			for(Encounter encounter : list)
			{
				System.out.println("Encounter Id        :"+encounter.getId());
				System.out.println("Encounter Reason    :"+encounter.getReason());
				System.out.println("Encounter status    :"+encounter.getStatus());
				System.out.println("Encounter admit_date:"+encounter.getAdmit_date_time());
				System.out.println("Encounter discharge_date:"+encounter.getDischarge_date_time());
				System.out.println("---------------------------------------------------------------");
			}
		}
	}
}
