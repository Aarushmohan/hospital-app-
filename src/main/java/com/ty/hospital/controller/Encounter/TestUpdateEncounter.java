package com.ty.hospital.controller.Encounter;

import java.time.LocalDateTime;

import com.ty.hospital.dto.Encounter;
import com.ty.hospital.service.implementation.EncounterServiceImp;

public class TestUpdateEncounter {
	public static void main(String[] args) {
		Encounter encounter = new Encounter();
		encounter.setAdmit_date_time(LocalDateTime.of(2022, 05, 12, 12, 23));
		encounter.setDischarge_date_time(LocalDateTime.now());
		encounter.setReason("Dengu");
		encounter.setStatus("well");

		EncounterServiceImp encounterServiceImp = new EncounterServiceImp();
		Encounter encounter1 = encounterServiceImp.updateEncounter(encounter, 1);
		if (encounter1 != null) {
			System.out.println("Data is updated");
		} else {
			System.out.println("Data is not found");
		}
	}
}
