package com.springboot.starter.inti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.starter.inti.pojo.Item;
import com.springboot.starter.inti.repo.ItemRepository;

@Service
public class ItemService {

	@Autowired(required = true)
	private ItemRepository itemRepository;

	public void addNewItem(Item item) {
		itemRepository.save(item);
	}

	public void getItem() {
		itemRepository.findAll();
	}

	public void getItemById(int id) {
		itemRepository.findById(id);
	}

	public void updateItem(Item itemUpdated, int id) {
		Item item = itemRepository.findById(id).get();
		System.out.println(item.getName());
		item.setName(itemUpdated.getName());
		item.setPrice(itemUpdated.getPrice());
		itemRepository.save(item);

	}

	public void deleteItem(int id) {
		itemRepository.deleteById(id);
	}

}
