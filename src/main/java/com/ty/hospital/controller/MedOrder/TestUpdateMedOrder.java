package com.ty.hospital.controller.MedOrder;

import java.util.ArrayList;
import java.util.List;

import com.ty.hospital.dto.Item;
import com.ty.hospital.dto.MedOrder;
import com.ty.hospital.service.implementation.MedOrderServiceImp;

public class TestUpdateMedOrder {
	public static void main(String[] args) {
		MedOrder medOrder = new MedOrder();
		
		Item item = new Item();
		item.setName("Paracitamal");
		item.setCost(40);
		item.setQuantity(2);
		item.setType("Tablet");
		item.setMedOrder(medOrder);

		Item item2 = new Item();
		item2.setName("Karkola");
		item2.setCost(1340);
		item2.setQuantity(1);
		item2.setType("Shirap");
		item2.setMedOrder(medOrder);

		List<Item> list = new ArrayList<Item>();
		list.add(item);
		list.add(item2);

		medOrder.setItem(list);
		medOrder.setId(2);
		
		MedOrderServiceImp medOrderServiceImp = new MedOrderServiceImp();
		MedOrder medOrder2 = medOrderServiceImp.updateMedOrder(medOrder,1);
		if (medOrder2 != null) {
			System.out.println("Data is updated");
		} else {
			System.out.println("No data is found");
		}
	}
}
