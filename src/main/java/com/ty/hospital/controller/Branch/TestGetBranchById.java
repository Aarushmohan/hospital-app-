package com.ty.hospital.controller.Branch;

import com.ty.hospital.dto.Address;
import com.ty.hospital.dto.Branch;
import com.ty.hospital.service.implementation.BranchServiceImp;

public class TestGetBranchById {
	public static void main(String[] args) {
		BranchServiceImp branchServiceImp = new BranchServiceImp();
		Branch branch = branchServiceImp.getBranchById(1);
		if (branch != null) {
			Address address = branch.getAddress();
			System.out.println("Branch Id :" + branch.getId());
			System.out.println("Branch Name :" + branch.getName());
			System.out.println("Branch Email :" + branch.getEmail());
			System.out.println("Branch Phone :" + branch.getPhone());
			if (address != null) {
				System.out.println("Address Id :" + address.getId());
				System.out.println("Address Streat :" + address.getStreet());
				System.out.println("Address city :" + address.getCity());
				System.out.println("Address State :" + address.getState());
				System.out.println("Address Country :" + address.getCountry());
				System.out.println("Address Pincode :" + address.getPincode());
			} else {
				System.out.println("Branch do not have a address");
			}
		} else {
			System.out.println("No data is found");
		}
	}
}
