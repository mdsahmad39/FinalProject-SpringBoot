package com.finalproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.StoreDao;
import com.dto.Address;
import com.dto.Store;

@RestController
public class StoreController {

	@Autowired
	StoreDao storeDao;
	
	@GetMapping("register_store")
	public void register() {
		Address address1 = new Address("3-38", "Gachibowli", "HYD", 342423, "TG", "India");
		Store store1 = new Store("Super Market", "Akilesh", address1, 9898989898l, "hello@gmail.com", "akilesh12", "password");
		storeDao.register(store1);
		Address address2 = new Address("3-38", "Vynchipet", "VJD", 342423, "AP", "India");
		Store store2 = new Store("Mart", "Hritesh", address2, 234234432l, "welcome@gmail.com", "hritesh12", "password");
		storeDao.register(store2);
	}
	
	@GetMapping("get_all_stores")
	public List<Store> getAllStores(){
		return storeDao.getAllStores();
	}
}
