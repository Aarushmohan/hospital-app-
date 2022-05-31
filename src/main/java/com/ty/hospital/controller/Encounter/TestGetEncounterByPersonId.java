package com.ty.hospital.controller.Encounter;

import java.util.List;

import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Person;
import com.ty.hospital.service.implementation.EncounterServiceImp;

public class TestGetEncounterByPersonId {
	public static void main(String[] args) {
		EncounterServiceImp encounterServiceImp = new EncounterServiceImp();
		List<Encounter> list = encounterServiceImp.getEncounterByPersonId(1);
		for(Encounter encounter : list)
		{
			Person person = encounter.getPerson();
			System.out.println("Person    Id        :"+person.getId());
			System.out.println("Person    Name      :"+person.getName());
			System.out.println("Encounter Id        :" + encounter.getId());
			System.out.println("Encounter Reason    :" + encounter.getReason());
			System.out.println("Encounter status    :" + encounter.getStatus());
			System.out.println("Encounter admit_date:" + encounter.getAdmit_date_time());
			System.out.println("Encounter discharge_date:" + encounter.getDischarge_date_time());
			System.out.println("-------------------------------------------------------------------");
		}
	}
}
