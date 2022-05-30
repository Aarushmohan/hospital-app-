package com.ty.hospital.controller.Hospitla;

import com.ty.hospital.service.implementation.HospitalServiceImp;

public class TestDeleteHospitalById {
	public static void main(String[] args) {
		HospitalServiceImp hospitalServiceImp = new HospitalServiceImp();
		boolean deleteHospital = hospitalServiceImp.delteHospitalById(2);
		if (deleteHospital != false) {
			System.out.println("Deleted sucessfully...!");
		} else {
			System.out.println("No data is found");
		}
	}
}
