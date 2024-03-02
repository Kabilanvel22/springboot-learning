package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producer")
public class producer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Unique_Id;
	private String Processor_Name;
	private int Country_code;
	private String Contact_number;
	private String Address;
	private int Pin_Code;
	private int Gov_Id;
	private String Email;
	public producer() {
		super();
	}
	public int getUnique_Id() {
		return Unique_Id;
	}
	public void setUnique_Id(int unique_Id) {
		Unique_Id = unique_Id;
	}
	public String getProcessor_Name() {
		return Processor_Name;
	}
	public void setProcessor_Name(String processor_Name) {
		Processor_Name = processor_Name;
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
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getProduction_Quantity() {
		return Production_Quantity;
	}
	public void setProduction_Quantity(int production_Quantity) {
		Production_Quantity = production_Quantity;
	}
	public int getService_Princing() {
		return Service_Princing;
	}
	public void setService_Princing(int service_Princing) {
		Service_Princing = service_Princing;
	}
	public int getOperating_hours() {
		return Operating_hours;
	}
	public void setOperating_hours(int operating_hours) {
		Operating_hours = operating_hours;
	}
	public String getService_Description() {
		return Service_Description;
	}
	public void setService_Description(String service_Description) {
		Service_Description = service_Description;
	}
	public String getCompany_Name() {
		return Company_Name;
	}
	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}
	private String Password;
	private int Production_Quantity; 
	private int Service_Princing;  
	private int Operating_hours;
	private String Service_Description;
	private String Company_Name;
}
