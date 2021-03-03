package com.finalproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.AddressDao;
import com.dao.StoreDao;
import com.dto.Address;
import com.dto.Store;

@RestController
public class StoreController {

	@Autowired
	StoreDao storeDao;
	
	@Autowired
	AddressDao addressDao;
	
	@GetMapping("register_store")
	public void register() {
		Address address1 = new Address("3-38", "Gachibowli", "HYD", 342423, "TG", "India");
		addressDao.register(address1);
		Store store1 = new Store("Super Market", "Akilesh", address1, 9898989898l, "hello@gmail.com", "akilesh12", "password");
		storeDao.register(store1);
		Address address2 = new Address("3-38", "Vynchipet", "VJD", 342423, "AP", "India");
		addressDao.register(address2);
		Store store2 = new Store("Mart", "Hritesh", address2, 234234432l, "welcome@gmail.com", "hritesh12", "password");
		storeDao.register(store2);
	}
	
	@GetMapping("get_all_stores")
	public List<Store> getAllStores(){
		return storeDao.getAllStores();
	}
	
	@RequestMapping("/login_seller/{loginId}/{password}")
	public Store loginStore(@PathVariable("loginId") String loginId, @PathVariable("password") String password) {
		return storeDao.verfiyStore(loginId, password);
	}
}
