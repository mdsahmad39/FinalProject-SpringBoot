package com.finalproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.StoreDao;
import com.dto.Store;

@RestController
public class StoreController {

	@Autowired
	StoreDao storeDao;
	
	@GetMapping("register_store")
	public void register() {
		Store store1 = new Store("Super Market", "Akilesh", "India", "AP", "HYD", "3-2-34, Bantumilli", 345323, 9898989898l, "hello@gmail.com", "akilesh12", "password");
		storeDao.register(store1);
		Store store2 = new Store("Mart", "Hritesh", "India", "AP", "HYD", "3-2-34, Bantumilli", 676569, 234234432l, "welcome@gmail.com", "hritesh12", "password");
		storeDao.register(store2);
	}
	
	@GetMapping("get_all_stores")
	public List<Store> getAllStores(){
		return storeDao.getAllStores();
	}
}
