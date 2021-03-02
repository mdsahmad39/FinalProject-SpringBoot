package com.finalproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProductDao;
import com.dao.StoreDao;
import com.dto.Product;
import com.dto.Store;

@RestController
public class ProductController //implements ErrorController
	{

	/*
	private static final String PATH = "/error";

    @RequestMapping(value = "/pageNotFound", method = { RequestMethod.GET, RequestMethod.POST })
    public String pageNotFound() {
        return "pageNotFound";
    }

    @RequestMapping(value = "/accessDenied", method = { RequestMethod.GET, RequestMethod.POST })
    public String accessDenied() {
        return "accessDenied";
    }

    @RequestMapping(value = PATH)
    public String error() {
        return "error";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
	*/
	@Autowired
	ProductDao productDao;
	
	@Autowired
	StoreDao storeDao;
	
	@GetMapping("register_item")
	public void register() {
		List<Store> storeList = storeDao.getAllStores();
		Product item1 = null;
		try {
			item1 = new Product("Flour",78.83,"Food", new SimpleDateFormat("dd/MM/yyyy").parse("25/01/2021"), storeList.get(0));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Product item2 = null;
		try {
			item2 = new Product("Rice", 888.83,"Food", new SimpleDateFormat("dd/MM/yyyy").parse("21/09/2021"), storeList.get(1));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Product item3 = null;
		try {
			item3 = new Product("Oil", 7118.83,"Food", new SimpleDateFormat("dd/MM/yyyy").parse("15/10/2021"), storeList.get(0));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		productDao.register(item1);
		productDao.register(item2);
		productDao.register(item3);
	}
	
	@GetMapping("get_all_items")
	public List<Product> getAllItems(){
		return productDao.getAllItems();
	}
}
