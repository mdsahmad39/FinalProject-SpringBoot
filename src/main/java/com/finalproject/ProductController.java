package com.finalproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
		Product item1 = new Product("Rice", "Kitchen","Priya","Fine quality of rice, with refined machinery", 10, 20, 200, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item2 = new Product("Wheat", "Kitchen","Symbol","Fine quality of wheat, with refined machinery", 10, 20, 200, "12/2/2021", "12/2/2025", storeList.get(1));
		Product item3 = new Product("Eggs", "Kitchen","Amul","Freshly dispatched eggs from hybrid chickens", 10, 20, 200, "12/2/2021", "12/2/2025", storeList.get(0));
		
		productDao.register(item1);
		productDao.register(item2);
		productDao.register(item3);
	}
	
	@GetMapping("get_all_items")
	public List<Product> getAllProducts(){
		return productDao.getAllProducts();
	}
	
	@RequestMapping("get_products_by_store/{storeId}")
	public List<Product> getProductsByStore(@PathVariable("storeId") String storeId){
		return productDao.getProductsByStoreId(storeId);
	}
	
	@PostMapping("updateProduct")
	public void updateProduct(@RequestBody Product product) {
		productDao.updateProduct(product);
	}
	
	@PostMapping("addProduct")
	public void addProduct(@RequestBody Product product) {
		productDao.register(product);
	}
	
	@PostMapping("deleteProduct")
	public void deleteProduct(@RequestBody Product product) {
		productDao.deleteProduct(product);
	}
	
	@GetMapping("getProductByName/{productName}")
	public Product finProductByName(@PathVariable("productName") String productName) {
		return productDao.findProductByName(productName);
	}
}
