package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="watchdata")
public class Watch {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String type;
	private double price;
	private String color;
	private String specs;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price = price;
	}
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public String getspecs() {
		return specs;
	}
	public void setspecs(String specs) {
		this.specs = specs;
	}
	public Watch(int id, String name, String type, double price, String color,String specs) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.color = color;
		this.specs = specs;
	}
	public Watch() {}
	
}
