package com.springboot.starter.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.starter.inti.pojo.Item;
import com.springboot.starter.inti.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(method=RequestMethod.POST,value="/add")
	public void addItem(@RequestBody Item item) {
		itemService.addNewItem(item);
	}
	
	@RequestMapping("/getAll")
	public void test() {
		itemService.getItem();
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/update/{id}")
	public void updateItem(@RequestBody Item item,@PathVariable int id) {
		itemService.updateItem(item, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/delete")
	public void deleteItem(@RequestHeader int id) {
		itemService.deleteItem(id);
	}
	
	@RequestMapping("/get/{id}")
	public void getItemById(@PathVariable int id) {
		itemService.getItemById(id);
	}
}
