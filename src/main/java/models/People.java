package models;

import java.util.List;

public class People {
	
	private int id; 
	private String name; 
//	private List<Address> address;
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public People(int id, String name) {
		this.id = id; 
		this.name = name;
	}
	
//	public People(int id, String name, List<Address> address) {
//		this.id = id; 
//		this.name = name;
//		this.address = address;
//	}
	

//	public List<Address> getAddress() {
//		return address;
//	}
}
