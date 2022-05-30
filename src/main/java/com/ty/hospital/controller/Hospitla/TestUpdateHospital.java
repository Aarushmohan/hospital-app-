package com.ty.hospital.controller.Hospitla;

import com.ty.hospital.dto.Hospital;
import com.ty.hospital.service.implementation.HospitalServiceImp;

public class TestUpdateHospital {
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.setName("TFFH");
		hospital.setGstNumber("TFFIN123");

		HospitalServiceImp hospitalServiceImp = new HospitalServiceImp();
		Hospital hospital1 = hospitalServiceImp.updateHospital(hospital, 1);
		if (hospital1 != null) {
			System.out.println("Data update successfully");
		} else {
			System.out.println("No data is found");
		}
	}
}
