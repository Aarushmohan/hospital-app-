package com.ty.hospital.service;

import java.util.List;

import com.ty.hospital.dto.MedOrder;



public interface MedOrderService {
	public MedOrder saveMedOrder(MedOrder medOrder, int eid);

	public MedOrder getMedOrderById(int id);

	public List<MedOrder> getMedOrderByEncounterId(int eid);

	public List<MedOrder> getMedOrderByPersonId(int pid);

	public MedOrder updateMedOrder(MedOrder medOrder,int id);

	public MedOrder deleteMedOrderById(int id);
}
