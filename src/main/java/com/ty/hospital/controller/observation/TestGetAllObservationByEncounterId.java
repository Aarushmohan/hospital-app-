package com.ty.hospital.controller.observation;

import java.util.List;

import com.ty.hospital.dto.Observation;
import com.ty.hospital.service.implementation.ObservationServiceImp;

public class TestGetAllObservationByEncounterId {
	public static void main(String[] args) {
		ObservationServiceImp observationServiceImp = new ObservationServiceImp();
		List<Observation> list = observationServiceImp.getAllObservationByEncounterId(1);
		for(Observation observation : list) {
			System.out.println("Observation  Id         :"+observation.getId());
			System.out.println("Observation Description :"+observation.getDiscription());
			System.out.println("Observation  DateAndTime :"+observation.getDate_time());
			System.out.println("--------------------------------------------");
		}
	}
}
