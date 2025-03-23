package com.pwc.Entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class StudentEntity {

	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	int id ;
	String name;
	String email;
	int marks;
	
	
	public StudentEntity(int id, String name, String email, int marks, AddressEntity add) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.add = add;
	}

	
	public StudentEntity(String name, String email, int marks, AddressEntity add)
	{
		this.name=name;
		this.email=email;
		this.marks=marks;
		this.add=add;
		
	}

	@JoinColumn(name="address")
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	private AddressEntity add;


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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public AddressEntity getAdd() {
		return add;
	}


	public void setAdd(AddressEntity add) {
		this.add = add;
	}
	
	
	public StudentEntity()
	{
	
	}
	
}
