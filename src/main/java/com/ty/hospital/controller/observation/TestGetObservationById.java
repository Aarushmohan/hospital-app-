package com.ty.hospital.controller.observation;

import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Observation;
import com.ty.hospital.service.implementation.ObservationServiceImp;

public class TestGetObservationById {
	public static void main(String[] args) {
		ObservationServiceImp observationServiceImp = new ObservationServiceImp();
		Observation observation = observationServiceImp.getObservationById(2);
		if(observation != null)
		{
			Encounter encounter = observation.getEncounter();
			System.out.println("Encouter     Id         :"+encounter.getId());
			System.out.println("Encouter     Reason     :"+encounter.getReason());
			System.out.println("Encouter     status      :"+encounter.getStatus());
			System.out.println("------------------------------------------------");
			System.out.println("Observation  Id         :"+observation.getId());
			System.out.println("Observation Description :"+observation.getDiscription());
			System.out.println("Observation  DateAndTime :"+observation.getDate_time());
		}
	}
}
