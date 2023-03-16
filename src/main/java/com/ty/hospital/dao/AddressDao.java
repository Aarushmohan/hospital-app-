package com.ty.hospital.dao;

import com.ty.hospital.dto.Address;

public interface AddressDao {
	public Address saveAddress(Address address, int bid);

	public Address getBracnchAddressById(int id);

	public Address updateAddress(Address address, int id);

	public boolean deleteAddress(int id);
}
