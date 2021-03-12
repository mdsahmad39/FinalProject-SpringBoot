package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.Store;

@Service
public class StoreDao {
	
	@Autowired
	StoreRepository storeRepository;
	
	public void register(Store store) {
		storeRepository.save(store);
	}
	
	public List<Store> getAllStores(){
		return storeRepository.findAll();
	}

	public Store verfiyStore(String loginId, String password) {
		return storeRepository.findByLoginIdAndPassword(loginId, password);
	}

	public long countStores() {
		return storeRepository.count();
	}

	public void updateStoreStatus(Store store) {
		storeRepository.updateStoreStatus(store);
	}

	public List<Store> getWorkingStores() {
		return storeRepository.getWorkingStores();
	}
	
	public List<Store> getNotWorkingStores() {
		return storeRepository.getNotWorkingStores();
	}
}
