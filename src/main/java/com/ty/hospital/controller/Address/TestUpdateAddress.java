package com.ty.hospital.controller.Address;

import com.ty.hospital.dto.Address;
import com.ty.hospital.service.implementation.AddressServiceImp;

public class TestUpdateAddress {
	public static void main(String[] args) {
		Address address = new Address();
		address.setStreet("near Victoriya");
		address.setCity("Mysuru");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setPincode(577124);

		AddressServiceImp addressServiceImp = new AddressServiceImp();
		Address address2 = addressServiceImp.updateAddress(address, 2);
		if (address2 != null) {
			System.out.println("Data is updated");
		} else {
			System.out.println("No data is found");
		}
	}
}
