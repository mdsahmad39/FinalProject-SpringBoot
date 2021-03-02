package com.finalproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ItemsDao;
import com.dao.StoreDao;
import com.dto.Items;
import com.dto.Store;

@RestController
public class ItemsController {

	@Autowired
	ItemsDao itemsDao;
	
	@Autowired
	StoreDao storeDao;
	
	@GetMapping("register_item")
	public void register() {
		List<Store> storeList = storeDao.getAllStores();
		Items item1 = new Items("Floor", 2, 10, 78.83, storeList.get(0));
		Items item2 = new Items("Rice", 5, 40, 888.83, storeList.get(1));
		Items item3 = new Items("Oil", 11, 90, 7118.83, storeList.get(0));
		itemsDao.register(item1);
		itemsDao.register(item2);
		itemsDao.register(item3);
	}
	
	@GetMapping("get_all_items")
	public List<Items> getAllItems(){
		return itemsDao.getAllItems();
	}
}
