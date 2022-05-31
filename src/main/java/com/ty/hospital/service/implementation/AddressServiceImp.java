package com.ty.hospital.service.implementation;

import com.ty.hospital.dao.implematation.AddressDaoImp;
import com.ty.hospital.dto.Address;
import com.ty.hospital.service.AddressService;

public class AddressServiceImp implements AddressService{
	AddressDaoImp addressDaoImp = new AddressDaoImp();
	@Override
	public Address saveAddress(Address address, int bid) {
		return addressDaoImp.saveAddress(address, bid);
	}

	@Override
	public Address getBracnchAddressById(int id) {
		return addressDaoImp.getBracnchAddressById(id);
	}

	@Override
	public Address updateAddress(Address address, int id) {
		return addressDaoImp.updateAddress(address, id);
	}

	@Override
	public boolean deleteAddress(int id) {
		return addressDaoImp.deleteAddress(id);
	}

}
