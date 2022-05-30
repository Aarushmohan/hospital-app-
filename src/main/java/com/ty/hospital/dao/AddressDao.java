package com.ty.hospital.dao;

import com.ty.hospital.dto.Address;
import com.ty.hospital.dto.Hospital;

public interface AddressDao {
	public Address saveAddress(Address address,int id);
	public Address getBracnchAddressById(int id);
	public Address updateAddress(Address address,int id);
	public boolean deleteAddress(int id);
}
