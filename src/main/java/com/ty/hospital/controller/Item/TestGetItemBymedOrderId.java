package com.ty.hospital.controller.Item;

import java.util.List;

import com.ty.hospital.dto.Item;
import com.ty.hospital.dto.MedOrder;
import com.ty.hospital.service.implementation.ItemServiceImp;
import com.ty.hospital.service.implementation.MedOrderServiceImp;

public class TestGetItemBymedOrderId {
	public static void main(String[] args) {
		ItemServiceImp itemServiceImp = new ItemServiceImp();
		List<Item> list = itemServiceImp.getItemByMedOrderId(6);
		if(list.size()>0)
		{
			for(Item item : list) {
				MedOrder medOrder = item.getMedOrder();
				System.out.println("MedOrder  Id     :"+medOrder.getId());
				System.out.println("-------------------------------------");
				System.out.println("Item   Id     :"+item.getId());
				System.out.println("Item   Name   :"+item.getName());
				System.out.println("Item   Cost   :"+item.getCost());
				System.out.println("Item Quantity :"+item.getQuantity());
				System.out.println("Item Type     :"+item.getType());
				System.out.println("-----------------------------------");
			}
		}
	}
}
