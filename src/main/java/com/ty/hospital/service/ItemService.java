package com.ty.hospital.service;

import java.util.List;

import com.ty.hospital.dto.Item;

public interface ItemService {
	public Item saveItem(Item item, int mid);

	public Item getItemById(int id);

	public List<Item> getItemByMedOrderId(int mid);

	public Item updateItem(Item item, int id);

	public boolean deleteItemById(int id);
}

