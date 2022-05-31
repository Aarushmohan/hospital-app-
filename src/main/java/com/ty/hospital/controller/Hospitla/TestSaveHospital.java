package com.ty.hospital.controller.Hospitla;

import java.util.ArrayList;
import java.util.List;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Hospital;
import com.ty.hospital.service.implementation.HospitalServiceImp;

public class TestSaveHospital {
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.setName("Nirmala");
		hospital.setGstNumber("APPIn323");

		Branch branch = new Branch();
		branch.setName("BTR");
		branch.setEmail("btrapp@mail.com");
		branch.setPhone(873456789);
		branch.setHospital(hospital);

		Branch branch2 = new Branch();
		branch2.setName("BTM");
		branch2.setEmail("btmapp@mail.com");
		branch2.setPhone(983456789);
		branch2.setHospital(hospital);

		List<Branch> list = new ArrayList<Branch>();
		list.add(branch);
		list.add(branch2);

		hospital.setBranch(list);

		HospitalServiceImp hospitalServiceImp = new HospitalServiceImp();
		Hospital hospital2 = hospitalServiceImp.saveHospital(hospital);
		if (hospital2 != null) {
			System.out.println("Data is inserted");
		} else {
			System.out.println("Data is not found");
		}
	}
}
