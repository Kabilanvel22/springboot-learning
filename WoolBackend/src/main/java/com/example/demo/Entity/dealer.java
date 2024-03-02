package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dealer")
public class dealer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Unique_Id;
	private String Name;
	private int Country_code;
	private String Contact_number;
	private String Address; 
	private int Pin_Code;
	private int Gov_Id; 
	private String email;
	private String company_name;
	private int reg_number;
	private String Types;
	private String Password;
	public int getUnique_Id() {
		return Unique_Id;
	}
	public void setUnique_Id(int unique_Id) {
		Unique_Id = unique_Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getCountry_code() {
		return Country_code;
	}
	public void setCountry_code(int country_code) {
		Country_code = country_code;
	}
	public String getContact_number() {
		return Contact_number;
	}
	public void setContact_number(String contact_number) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public int getReg_number() {
		return reg_number;
	}
	public void setReg_number(int reg_number) {
		this.reg_number = reg_number;
	}
	public String getTypes() {
		return Types;
	}
	public void setTypes(String types) {
		Types = types;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public dealer() {
		super();
		
	}
}
