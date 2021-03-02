package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dto.Items;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
