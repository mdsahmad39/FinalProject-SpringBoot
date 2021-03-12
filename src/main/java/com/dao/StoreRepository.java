package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dto.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {

	Store findByLoginIdAndPassword(String loginId, String password);

	@Query(value = "UPDATE STORE SET STATUS=TRUE WHERE STORE_ID=?1;", nativeQuery = true)
	void updateStoreStatus(Store storeId);

	@Query(value = "SELECT * FROM STORE WHERE STATUS=TRUE;", nativeQuery = true)
	List<Store> getWorkingStores();
	
	@Query(value = "SELECT * FROM STORE WHERE STATUS=FALSE;", nativeQuery = true)
	List<Store> getNotWorkingStores();

}
