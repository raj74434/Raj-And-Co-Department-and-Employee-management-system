package com.rajandco.models;

public class Department {

	private int depid;   //It should unique,auto-increase,not null
	private String name;    //not null,unique
	private String address;  //not null
	
	
	public Department() {
		
	}
	
	
	@Override
	public String toString() {
		return "Department [depid=" + depid + ", name=" + name + ", address=" + address + "]";
	}


	public Department(int depid, String name, String address) {
		super();
		this.depid = depid;
		this.name = name;
		this.address = address;
	}
	
	
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
