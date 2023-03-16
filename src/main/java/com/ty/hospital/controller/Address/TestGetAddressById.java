package com.ty.hospital.controller.Address;

import com.ty.hospital.dto.Address;
import com.ty.hospital.dto.Branch;
import com.ty.hospital.service.implementation.AddressServiceImp;

public class TestGetAddressById {
	public static void main(String[] args) {
		AddressServiceImp addressServiceImp = new AddressServiceImp();
		Address address = addressServiceImp.getBracnchAddressById(2);
		if (address != null) {
			Branch branch = address.getBranch();
			if (branch != null) {
				System.out.println("Branch Name :" + branch.getName());
				System.out.println("Branch Email :" + branch.getEmail());
				System.out.println("Branch Phone :" + branch.getPhone());
				System.out.println("----------------------------------------");
				
			} else {
				System.out.println("Branch is no there");
			}
			System.out.println("Address Id :" + address.getId());
			System.out.println("Address Streat :" + address.getStreet());
			System.out.println("Address city :" + address.getCity());
			System.out.println("Address State :" + address.getState());
			System.out.println("Address Country :" + address.getCountry());
			System.out.println("Address Pincode :" + address.getPincode());
			System.out.println();
			} else {
			System.out.println("No data is found");
		}
	}
}
