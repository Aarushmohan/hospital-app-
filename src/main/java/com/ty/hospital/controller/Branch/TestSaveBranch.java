package com.ty.hospital.controller.Branch;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.service.implementation.BranchServiceImp;

public class TestSaveBranch {
	public static void main(String[] args) {
		Branch branch = new Branch();
		branch.setName("RR Nagar");
		branch.setEmail("rrtff@mail.com");
		branch.setPhone(987654321);
		

		BranchServiceImp branchServiceImp = new BranchServiceImp();
		Branch branch1 = branchServiceImp.saveBranch(branch, 1);
		if (branch1 != null) {
			System.out.println("Data inserted");
		}
		else {
			System.out.println("No data is found");
		}
	}
}
