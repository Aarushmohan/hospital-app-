package com.ty.hospital.controller.observation;

import com.ty.hospital.service.implementation.ObservationServiceImp;

public class TestDeletedObservation {
	public static void main(String[] args) {
		ObservationServiceImp observationServiceImp = new ObservationServiceImp();
		boolean res = observationServiceImp.deleteObservation(2);
		if(res != false) {
			System.out.println("Data is deleted");
		}
		else
		{
			System.out.println("No data is found");
		}
	}
}
