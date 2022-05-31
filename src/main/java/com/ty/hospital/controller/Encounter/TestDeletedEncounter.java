package com.ty.hospital.controller.Encounter;

import com.ty.hospital.service.implementation.EncounterServiceImp;

public class TestDeletedEncounter {
	public static void main(String[] args) {
		EncounterServiceImp encounterServiceImp = new EncounterServiceImp();
		boolean res = encounterServiceImp.deleteEncounterById(2);
		if (res != false) {
			System.out.println("Data is deleted");
		} else {
			System.out.println("Data is not found");
		}
	}
}
