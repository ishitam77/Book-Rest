package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookEntity {	
	
	private int bid;
	private String title;
	private String author;
	private int price;

	
	public BookEntity() {
		super();
	}
	
	
	
	public BookEntity(int bid, String title, String author, int price) {
		super();
		this.bid = bid;
		this.title = title;
		this.author = author;
		this.price = price;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getBid() {
		return bid;
	}



	public void setBid(int bid) {
		this.bid = bid;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
