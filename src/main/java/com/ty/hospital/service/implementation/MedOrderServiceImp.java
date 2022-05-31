package com.ty.hospital.service.implementation;

import java.util.List;

import com.ty.hospital.dao.implematation.MedOrderDaoImp;
import com.ty.hospital.dto.Item;
import com.ty.hospital.dto.MedOrder;
import com.ty.hospital.service.MedOrderService;

public class MedOrderServiceImp implements MedOrderService{
	MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();

	@Override
	public MedOrder saveMedOrder(MedOrder medOrder, int eid) {
		List<Item> list = medOrder.getItem();
		double sum=0;
		for(Item item:list)
		{
			int qun= item.getQuantity();
			double price= item.getCost();
			double price2= qun*price;
			sum+=price2;
		}
		medOrder.setTotal(sum);
		return medOrderDaoImp.saveMedOrder(medOrder, eid);
	}

	@Override
	public MedOrder getMedOrderById(int id) {
		return medOrderDaoImp.getMedOrderById(id);
	}

	@Override
	public List<MedOrder> getMedOrderByEncounterId(int eid) {
		return medOrderDaoImp.getMedOrderByEncounterId(eid);
	}

	@Override
	public List<MedOrder> getMedOrderByPersonId(int pid) {
		return medOrderDaoImp.getMedOrderByPersonId(pid);
	}

	@Override
	public MedOrder updateMedOrder(MedOrder medOrder,int id) {
		List<Item> list = medOrder.getItem();
		double sum=0;
		for(Item item:list)
		{
			int qun= item.getQuantity();
			double price= item.getCost();
			double price2= qun*price;
			sum+=price2;
		}
		medOrder.setTotal(sum);
		return medOrderDaoImp.updateMedOrder(medOrder,id);
	}

	@Override
	public MedOrder deleteMedOrderById(int id) {
		return medOrderDaoImp.deleteMedOrderById(id);
	}
	
}
