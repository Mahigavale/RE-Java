package com.pwc.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Address")
public class AddressEntity {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int addid;
	String city;
	String pincode;
	public AddressEntity(int addid, String city, String pincode, String state) {
		super();
		this.addid = addid;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		
	}
	String state;
	
	
	public AddressEntity(String city,String pincode,String state)
	{
		
		this.city=city;
		this.pincode=pincode;
		this.state=state;
	}
	
	
	@OneToMany(mappedBy = "add", fetch = FetchType.EAGER)
	@JsonManagedReference
	private List<StudentEntity> entity;
	
	
	public List<StudentEntity> getEntity() {
		return entity;
	}
	public void setEntity(List<StudentEntity> entity) {
		this.entity = entity;
	}
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	
	public AddressEntity()
	{
		
	}
}
