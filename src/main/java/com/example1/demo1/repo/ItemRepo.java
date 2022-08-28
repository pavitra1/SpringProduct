package com.example1.demo1.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example1.demo1.model.Item;

public interface ItemRepo extends MongoRepository<Item, Integer> {
	
	public Item getItemById(int id);

}
