package com.ty.hospital.controller.Address;

import com.ty.hospital.dto.Address;
import com.ty.hospital.service.implementation.AddressServiceImp;

public class TestSaveAddress {
	public static void main(String[] args) {
		Address address = new Address();
		address.setStreet("near bull templ");
		address.setCity("Bengalauru");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setPincode(577123);

		AddressServiceImp addressServiceImp = new AddressServiceImp();
		Address address2 = addressServiceImp.saveAddress(address, 2);
		if (address2 != null) {
			System.out.println("Data is added");
		} else {
			System.out.println("No data is found");
		}
	}
}
