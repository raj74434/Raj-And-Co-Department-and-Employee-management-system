package com.rajandco.models;

public class Employee {

	private int eid; //auto increase,unique,not null,
	private String name;  //not null
	private String email; //not null
	private String address; //not null
	private String username; //unique ,not null
	private String password;  //not null,unique
	private int depid;  //foreign key refer department(depid),Not null
	
	
	
	public Employee() {
		
	}
	
	public Employee(String name, String email,  String address, String username, String password,
			int depid) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.username = username;
		this.password = password;
		this.depid = depid;
	}
	
	
	
	
	@Override
	public String toString() {
		return "EmployeeId= "+ eid +" name=" + name + ", email=" + email  + ", address=" + address
				+ ", username=" + username + ", password=" + password + ", depid=" + depid ;
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
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}
		
}
