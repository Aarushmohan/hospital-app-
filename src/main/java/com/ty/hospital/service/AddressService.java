package com.ty.hospital.service;

import com.ty.hospital.dto.Address;

public interface AddressService {
	public Address saveAddress(Address address, int bid);

	public Address getBracnchAddressById(int id);

	public Address updateAddress(Address address, int id);

	public boolean deleteAddress(int id);
}
