package com.ty.hospital.controller.Hospitla;

import java.util.List;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Hospital;
import com.ty.hospital.service.implementation.HospitalServiceImp;

public class TestGetHospitalById {
	public static void main(String[] args) {
		HospitalServiceImp hospitalServiceImp = new HospitalServiceImp();
		Hospital hospital = hospitalServiceImp.getHospitalById(1);
		if (hospital != null) {
			List<Branch> list = hospital.getBranch();
			System.out.println("Hospital   Id         :" + hospital.getId());
			System.out.println("Hospital   Name       :" + hospital.getName());
			System.out.println("Hospital   GSTNumber  :" + hospital.getGstNumber());
			System.out.println("-------------------------------------------------");

			for (Branch branch : list) {
				System.out.println("Branch id          :" + branch.getId());
				System.out.println("Branch Name         :" + branch.getName());
				System.out.println("Branch Email         :" + branch.getEmail());
				System.out.println("Branch Phone        :" + branch.getPhone());
				System.out.println("-------------------------------------------------");
			}
		} else {
			System.out.println("No data is found");
		}
	}
}
