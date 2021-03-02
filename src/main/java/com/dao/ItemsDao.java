package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.Items;

@Service
public class ItemsDao {
	
	@Autowired
	ItemsRepository itemsRepository;

	public void register(Items items) {
		itemsRepository.save(items);
	}
	
	public List<Items> getAllItems(){
		return itemsRepository.findAll();
	}
}
