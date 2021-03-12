package com.finalproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping("registerStoreHardCoding")
	public void register() {
		Address address1 = new Address("3-38", "Gachibowli", "HYD", 342423, "TG", "India");
		addressDao.register(address1);
		Store store1 = new Store("Super Market", "Akilesh", address1, 9898989898l, "hello@gmail.com", "akilesh12",
				"password");
		storeDao.register(store1);

		Address address2 = new Address("3-38", "Vynchipet", "VJD", 342423, "AP", "India");
		addressDao.register(address2);
		Store store2 = new Store("Mart", "Hritesh", address2, 234234432l, "welcome@gmail.com", "hritesh12", "password");
		storeDao.register(store2);

		Address address3 = new Address("734/4", "Uppal", "HYD", 543123, "TG", "India");
		addressDao.register(address3);
		Store store3 = new Store("reliance fresh", "Rmbani", address3, 562321787, "rmbani@gmail.com", "Rmbani",
				"password");
		storeDao.register(store3);

//		Address address4 = new Address("650/23", "lb nagar", "HYD", 456123, "TG", "India");
//		addressDao.register(address4);
//		Store store4 = new Store("Easy day market", "varunsai", address4, 789456256, "easyday@gmail.com", "easyday",
//				"password");
//		storeDao.register(store4);
//
//		Address address5 = new Address("12/1/23", "hasthinapuram", "HYD", 441091, "TG", "India");
//		addressDao.register(address5);
//		Store store5 = new Store("peoples mart", "mahendar", address5, 564523231, "mahender@gmail.com", "Mahender12",
//				"password");
//		storeDao.register(store5);
//
//		Address address6 = new Address("71-3", "Nagole", "HYD", 32345, "TG", "India");
//		addressDao.register(address6);
//		Store store6 = new Store("kisan market", "raythu", address6, 412589635, "kisan@gmail.com", "kisan131",
//				"password");
//		storeDao.register(store6);
//
//		Address address7 = new Address("12/45", "attapur", "HYD", 456987, "TG", "India");
//		addressDao.register(address7);
//		Store store7 = new Store("Star market", "srinivas", address7, 458961235, "srinivas@gmail.com", "srinivas0",
//				"password");
//		storeDao.register(store7);
//
//		Address address8 = new Address("34-34-5", "mehidhipatnam", "HYD", 500070, "TG", "India");
//		addressDao.register(address8);
//		Store store8 = new Store("Mahila super market", "sri vidya", address8, 589632147, "srividya@gmail.com",
//				"srividaya123", "password");
//		storeDao.register(store8);
//
//		Address address9 = new Address("12/45/2", "Hayathnagar", "HYD", 500071, "TG", "India");
//		addressDao.register(address9);
//		Store store9 = new Store("subayah super market", "sneha ", address9, 45250323, "shena@gmail.com", "sneha123",
//				"password");
//		storeDao.register(store9);
//
//		Address address10 = new Address("12-14", "Tadepalli", "VJD", 522501, "AP", "India");
//		addressDao.register(address10);
//		Store store10 = new Store("f5 super market", "charan", address10, 869452122, "charan@gmail.com", "charan123",
//				"password");
//		storeDao.register(store10);
//
//		Address address11 = new Address("45/12", "Benz circle", "VJD", 520010, "AP", "India");
//		addressDao.register(address11);
//		Store store11 = new Store("Adithya super market", "adithya", address11, 789456122, "adithya@gmail.com",
//				"adithya154", "passward");
//		storeDao.register(store11);
//
//		Address address12 = new Address("12/45", "mangalagiri", "VJD", 522503, "AP", "India");
//		addressDao.register(address12);
//		Store store12 = new Store("Amaravathi", "srujan", address12, 931313114, "srujan143@gmail.com", "srujan45",
//				"password");
//		storeDao.register(store12);
//
//		Address address13 = new Address("89/1", "enikepadu", "VJD", 521108, "AP", "India");
//		addressDao.register(address13);
//		Store store13 = new Store("sastha Grocery store", "sastha", address13, 100228289, "sasatha@gmail.com", "sastha",
//				"password");
//		storeDao.register(store13);
//
//		Address address14 = new Address("14/7", "patamata", "VJD", 520010, "AP", "India");
//		addressDao.register(address14);
//		Store store14 = new Store("Aryanam Super Market", "sharath", address14, 4100078, "ariysan@gmail.com", "Aryanam",
//				"password");
//		storeDao.register(store14);
//
//		Address address15 = new Address("7/8", "Benz circle", "VJD", 520010, "AP", "India");
//		addressDao.register(address15);
//		Store store15 = new Store("Mana super market", "murali", address15, 45789623, "murali@gmail.com", "murali123",
//				"password");
//		storeDao.register(store15);
//
//		Address address16 = new Address("45/1", "arka circle", "VJD", 520010, "AP", "India");
//		addressDao.register(address16);
//		Store store16 = new Store("adithi super market", "likitha", address16, 45862133, "likitha@gmail.com",
//				"bakki133", "password");
//		storeDao.register(store16);
//
//		Address address17 = new Address("5/2", "signal circle ", "VJD", 520010, "AP", "India");
//		addressDao.register(address17);
//		Store store17 = new Store("Giri  super Market", "giridher", address17, 856974, "giridher@gmail.com", "giri123",
//				"password");
//		storeDao.register(store17);
//
//		Address address18 = new Address("74-7-4", "rk circle", "VIG", 589025, "AP", "India");
//		addressDao.register(address18);
//		Store store18 = new Store("konda super market", "naresh", address18, 456789, "naresh@gmailcom", "nari123",
//				"password");
//		storeDao.register(store18);
//
//		Address address19 = new Address("45", "rishi circle", "VIG", 598216, "AP", "India");
//		addressDao.register(address19);
//		Store store19 = new Store("yogi mart", "vamshi", address19, 4512345, "vamshi@gmail.com", "vamshi123",
//				"password");
//		storeDao.register(store19);
//
//		Address address20 = new Address("13/7", "jagadhaba centre", "VIG", 547123, "AP", "India");
//		addressDao.register(address20);
//		Store store20 = new Store("vishal mart", "rama", address20, 45612398, "ramas@gmail.com", "ram123", "password");
//		storeDao.register(store20);
	}

	@GetMapping("getAllStores")
	public List<Store> getAllStores() {
		return storeDao.getAllStores();
	}
	
	@PostMapping("registerStore")
	public void registerStore(@RequestBody Store store) {
		storeDao.register(store);
	}

	@RequestMapping("/loginSeller/{loginId}/{password}")
	public Store loginStore(@PathVariable("loginId") String loginId, @PathVariable("password") String password) {
		return storeDao.verfiyStore(loginId, password);
	}
	
	@GetMapping("/getStoresCount")
	public long countStores() {
		return storeDao.countStores();
	}
	
	@PostMapping("storeStatusUpdate")
	public void updateStoreStatus(@RequestBody Store store) {
		storeDao.updateStoreStatus(store);
	}
	
	@GetMapping("/getWorkingStores")
	public List<Store> getWorkingStores(){
		return storeDao.getWorkingStores();
	}
	
	@GetMapping("/getNotWorkingStores")
	public List<Store> getNotWorkingStores(){
		return storeDao.getNotWorkingStores();
	}
}
