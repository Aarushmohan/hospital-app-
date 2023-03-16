package com.ty.hospital.controller.Branch;

import java.util.List;

import com.ty.hospital.dto.Address;
import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Hospital;
import com.ty.hospital.service.implementation.BranchServiceImp;

public class TestGetAllBranch {
	public static void main(String[] args) {
		BranchServiceImp branchServiceImp = new BranchServiceImp();
		List<Branch> list = branchServiceImp.getAllBranch();
		if (list.size() > 0) {
			for (Branch branch : list) {
				Hospital hospital = branch.getHospital();
				if(hospital != null)
				{
					Address address = branch.getAddress();
					System.out.println("Hospital   Name       :" + hospital.getName());
					System.out.println("Branch Id :" + branch.getId());
					System.out.println("Branch Name :" + branch.getName());
					System.out.println("Branch Email :" + branch.getEmail());
					System.out.println("Branch Phone :" + branch.getPhone());
					System.out.println("---------------------------------------");
					if (address != null) {
						System.out.println("Address Id :"+address.getId());
						System.out.println("Address Streat :"+address.getStreet());
						System.out.println("Address city :"+address.getCity());
						System.out.println("Address State :"+address.getState());
						System.out.println("Address Country :"+address.getCountry());
						System.out.println("Address Pincode :"+address.getPincode());
					}
					else {
						System.out.println("Branch do not have a address");
					}
				}
			}
		} else {
			System.out.println("No data is found");
		}
	}
}
