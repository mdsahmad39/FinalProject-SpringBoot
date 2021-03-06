package com.finalproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CustomerDao;
import com.dao.OrderDetailsDao;
import com.dao.OrdersDao;
import com.dao.ProductDao;
import com.dao.StoreDao;
import com.dto.Orders;

@RestController
public class OrdersController {

	@Autowired
	OrdersDao orderDao;
	
	@Autowired
	OrderDetailsDao  orderDetailsDao;
	
	@Autowired
	StoreDao storeDao;
	
	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	ProductDao productDao;
	
	@PostMapping("registerOrder")
	public void register(@RequestBody Orders orders) {
//		List<Store> storeList = storeDao.getAllStores();
//		List<Customer> customerList =  customerDao.getAllCustomers();
//		List<Product> productList = productDao.getAllProducts();
//		Orders order = new Orders("will be reached never", "12/2/2021", storeList.get(0), customerList.get(0));
//		orderDao.register(order);
//		OrderDetails orderDetails = new OrderDetails(40, 20, 8000, order, productList.get(0));
//		orderDetailsDao.register(orderDetails);
		System.out.println("data received from angular");
		orderDao.register(orders);
	}
	
	@RequestMapping("getAllOrders")
	public List<Orders> getAllOrders() {
		return orderDao.getAllOrders();
	}
}
