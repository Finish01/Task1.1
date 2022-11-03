package models;

import java.util.List;

public class Root {

	private int id; 
	private String name; 
	private String city;
	private String street; 
	private int building;
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getStreet() {
		return street;
	}
	
	public int getBuilding() {
		return building;
	}
	
	public Root(int id, String name) {
		this.id = id; 
		this.name = name;
	}
	
	public Root(int id, String name, String city, String street, int building) {
		this.id = id; 
		this.name = name; 
		this.city = city; 
		this.street = street; 
		this.building = building; 
	}
	
//	private List<People> people;
//
//	public List<People> getPeople() {
//		return people;
//	}
//
//	public void setPeople(List<People> people) {
//		this.people = people;
//	} 
	
}
