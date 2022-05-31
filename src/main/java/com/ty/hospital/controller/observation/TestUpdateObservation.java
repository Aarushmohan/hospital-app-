package com.ty.hospital.controller.observation;

import java.time.LocalDateTime;

import com.ty.hospital.dto.Observation;
import com.ty.hospital.service.implementation.ObservationServiceImp;

public class TestUpdateObservation {
	public static void main(String[] args) {
		Observation observation = new Observation();
		observation.setDiscription("is not good");
		observation.setDate_time(LocalDateTime.of(2022, 12, 15, 8, 20));

		ObservationServiceImp observationServiceImp = new ObservationServiceImp();
		Observation observation1 = observationServiceImp.updateObservation(observation, 2);
		if (observation1 != null) {
			System.out.println("Data is Updated");
		} else {
			System.out.println("No data is found");
		}
	}
}
