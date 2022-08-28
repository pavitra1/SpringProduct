package com.example1.demo1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example1.demo1.model.Item;
import com.example1.demo1.repo.ItemRepo;

@RestController
@RequestMapping("/Items")
public class ItemController {
	
	@Autowired
	private ItemRepo itemrepo;
	
	@PostMapping("/saveItems")
	public String saveItem(@RequestBody Item item)
	{
		itemrepo.save(item);
		return "Item saved with id as"+ item.getId();
	}
	
	@GetMapping("/getAllItems")
	public List<Item> getItems()
	{
		return itemrepo.findAll();
	}
	
	@GetMapping("/getItemById/{id}")
	public Optional<Item> getItem(@PathVariable int id)
	{
		return itemrepo.findById(id);
	}
	
	@DeleteMapping("/Delete/{id}")
	public String deleteItem(@PathVariable int id)
	{
		itemrepo.deleteById(id);
		return "Item deleted with id"+id;
	}
	
	}
	
	

