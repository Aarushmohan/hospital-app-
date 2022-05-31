package com.ty.hospital.controller.MedOrder;

import java.util.List;

import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Item;
import com.ty.hospital.dto.MedOrder;
import com.ty.hospital.service.implementation.MedOrderServiceImp;

public class TestGetMedOrderByPersonId {
	public static void main(String[] args) {
		MedOrderServiceImp medOrderServiceImp = new MedOrderServiceImp();
		List<MedOrder> list = medOrderServiceImp.getMedOrderByPersonId(1);
		for(MedOrder medOrder:list)
		{
			List<Item> list1 = medOrder.getItem();
			Encounter encounter= medOrder.getEncounter();
			System.out.println("Encountre Id     :"+encounter.getId());
			System.out.println("MedOrder  Id     :"+medOrder.getId());
			System.out.println("MedOrder  total  :"+medOrder.getTotal());
			System.out.println("=======================================");
			for(Item item : list1)
			{
				System.out.println("Item   Id     :"+item.getId());
				System.out.println("Item   Name   :"+item.getName());
				System.out.println("Item   Cost   :"+item.getCost());
				System.out.println("Item Quantity :"+item.getQuantity());
				System.out.println("Item Type     :"+item.getType());
				System.out.println("------------------------------------");
			}
		}
	}
}
