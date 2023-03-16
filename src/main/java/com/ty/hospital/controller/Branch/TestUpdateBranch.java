package com.ty.hospital.controller.Branch;

import java.util.List;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.service.implementation.BranchServiceImp;

public class TestUpdateBranch {
	public static void main(String[] args) {
		Branch branch = new Branch();
		branch.setName("RTR Nagar");
		branch.setEmail("rrtff@mail.com");
		branch.setPhone(987654321);

		BranchServiceImp branchServiceImp = new BranchServiceImp();
		Branch branch1 = branchServiceImp.updateBranch(branch, 5);
		if (branch1 != null) {
			System.out.println("Data is updated");
		}
		else {
			System.out.println("No data is found");
		}
	}
}
