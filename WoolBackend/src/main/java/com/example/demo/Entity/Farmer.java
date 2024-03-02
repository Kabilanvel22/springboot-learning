package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "farmer")
public class Farmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Farm_Id;
	private String Name;
	private String Country_code;
    private int Contact_number;
	private String Address;
	private int Pin_Code;
	private int Gov_Id; 
	private int Production_Quantity;
	private String types;
	private String Password;
	
	public int getFarm_Id() {
		return Farm_Id;
	}
	public void setFarm_Id(int farm_Id) {
		Farm_Id = farm_Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCountry_code() {
		return Country_code;
	}
	public void setCountry_code(String country_code) {
		Country_code = country_code;
	}
	public int getContact_number() {
		return Contact_number;
	}
	public void setContact_number(int contact_number) {
		Contact_number = contact_number;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getPin_Code() {
		return Pin_Code;
	}
	public void setPin_Code(int pin_Code) {
		Pin_Code = pin_Code;
	}
	public int getGov_Id() {
		return Gov_Id;
	}
	public void setGov_Id(int gov_Id) {
		Gov_Id = gov_Id;
	}
	public int getProduction_Quantity() {
		return Production_Quantity;
	}
	public void setProduction_Quantity(int production_Quantity) {
		Production_Quantity = production_Quantity;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Farmer(int farm_Id, String name, String country_code, int contact_number, String address, int pin_Code,
			int gov_Id, int production_Quantity, String types, String password) {
		super();
		Farm_Id = farm_Id;
		Name = name;
		Country_code = country_code;
		Contact_number = contact_number;
		Address = address;
		Pin_Code = pin_Code;
		Gov_Id = gov_Id;
		Production_Quantity = production_Quantity;
		this.types = types;
		Password = password;
	}
    
}
