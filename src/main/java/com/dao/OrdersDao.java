package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.Orders;

@Service
public class OrdersDao {

	@Autowired
	OrdersRepository ordersRepository;
	
	public void register(Orders order) {
		ordersRepository.save(order);
	}
	
	public List<Orders> findAllOrder(){
		return ordersRepository.findAll();
	}
}