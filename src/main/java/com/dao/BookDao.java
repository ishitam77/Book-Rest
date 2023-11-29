package com.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.BookEntity;

public interface BookDao extends JpaRepository<BookEntity, Integer>{

	BookEntity findByBid(int bid);

	void deleteByBid(int bid);

	
}