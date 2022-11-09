package com.rajandco.models;

public class Employee {

	private String name;
	private String email;
	private String phone;
	private String address;
	private String username;
	private String password;
	private String depid;
	
	
	public Employee() {
		
	}
	
	public Employee(String name, String email, String phone, String address, String username, String password,
			String depid) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.username = username;
		this.password = password;
		this.depid = depid;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address
				+ ", username=" + username + ", password=" + password + ", depid=" + depid + "]";
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public String getDepid() {
		return depid;
	}
	public void setDepid(String depid) {
		this.depid = depid;
	}
		
}
