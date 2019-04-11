package com.quikr.product.model;

import java.util.Date;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="productlist")
public class Product {
	
	@Id
	Long id;
	String name;
	String location;
	String description;
	String Contact;
	Date updatedDate;
	double price;
	String Category;
	String image;
	
public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}

	public Product(Long id, String name, String location, String description, String contact, Date updatedDate,
			double price, String category, String image) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.description = description;
		Contact = contact;
		this.updatedDate = updatedDate;
		this.price = price;
		Category = category;
		this.image = image;
	}
	public Product() {

	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", location=" + location + ", description=" + description
				+ ", Contact=" + Contact + ", updatedDate=" + updatedDate + ", price=" + price + ", Category="
				+ Category + ", image=" + image + "]";
	}
	
	
	

}
