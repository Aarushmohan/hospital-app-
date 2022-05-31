package com.ty.hospital.controller.Item;

import com.ty.hospital.dto.Item;
import com.ty.hospital.service.implementation.ItemServiceImp;

public class TestUpdateItem {
	public static void main(String[] args) {
		Item item = new Item();
		item.setName("Dolo650");
		item.setCost(40);
		item.setQuantity(2);
		item.setType("Tablet");
		
		ItemServiceImp itemServiceImp = new ItemServiceImp();
		Item item1 = itemServiceImp.updateItem(item, 6);
		if (item1 != null) {
			System.out.println("Data is updated");
		} else {
			System.out.println("No data is founded");
		}
	}
}
