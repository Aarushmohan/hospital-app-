package com.ty.hospital.controller.Item;

import java.awt.ItemSelectable;

import com.ty.hospital.dto.Item;
import com.ty.hospital.service.implementation.ItemServiceImp;

public class TestSaveItem {
	public static void main(String[] args) {
		Item item = new Item();
		item.setName("Dolo");
		item.setCost(40);
		item.setQuantity(2);
		item.setType("Tablet");

		ItemServiceImp itemServiceImp = new ItemServiceImp();
		Item item1 = itemServiceImp.saveItem(item, 1);
		if (item1 != null) {
			System.out.println("Data is inserted");
		} else {
			System.out.println("No data is founded");
		}
	}
}
