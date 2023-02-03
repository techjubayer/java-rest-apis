package models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mongoCollection")
public class User {

	private String fname, lname, phone, email;
	private int age;
	
	
	public User() {
		
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", phone=" + phone + ", email=" + email + ", age=" + age
				+ "]";
	}
	
	
	
	
	

}
