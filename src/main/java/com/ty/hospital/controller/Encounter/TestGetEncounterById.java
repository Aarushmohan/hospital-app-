package com.ty.hospital.controller.Encounter;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Hospital;
import com.ty.hospital.dto.Person;
import com.ty.hospital.service.implementation.EncounterServiceImp;

public class TestGetEncounterById {
	public static void main(String[] args) {
		EncounterServiceImp encounterServiceImp = new EncounterServiceImp();
		Encounter encounter = encounterServiceImp.getEncounterById(1);
		if(encounter != null)
		{
			Person person = encounter.getPerson();
			Branch branch = encounter.getBranch();
			Hospital hospital = branch.getHospital();
			System.out.println("Hospital  id        :"+hospital.getId());
			System.out.println("Hospital  Name      :"+hospital.getName());
			System.out.println("Branch    id        :"+branch.getId());
			System.out.println("Branch    Name      :"+branch.getName());
			System.out.println("Person    Id        :"+person.getId());
			System.out.println("Person    Name      :"+person.getName());
			System.out.println("Person    Gender    :"+person.getGender());
			System.out.println("Encounter Id        :" + encounter.getId());
			System.out.println("Encounter Reason    :" + encounter.getReason());
			System.out.println("Encounter status    :" + encounter.getStatus());
			System.out.println("Encounter admit_date:" + encounter.getAdmit_date_time());
			System.out.println("Encounter discharge_date:" + encounter.getDischarge_date_time());
		}
	}
}
