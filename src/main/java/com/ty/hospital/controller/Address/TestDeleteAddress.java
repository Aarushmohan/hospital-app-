package com.ty.hospital.controller.Address;

import com.ty.hospital.service.implementation.AddressServiceImp;

public class TestDeleteAddress {
	public static void main(String[] args) {
		AddressServiceImp addressServiceImp = new AddressServiceImp();

		boolean res = addressServiceImp.deleteAddress(2);
		if (res != false) {
			System.out.println("Data is deleted");
		} else {
			System.out.println("No data is found");
		}
	}
}
