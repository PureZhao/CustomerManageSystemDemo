package com.pure.study;

public class Customer {
	protected String name;
	protected boolean gender;
	protected int age;
	protected String phoneNum;
	protected String email;
	
	public Customer(){
		name = "N/A";
		gender = false;
		age = 0;
		phoneNum = "N/A";
		email = "N/A";
	}

	public Customer(String name,boolean gender,int age,String phoneNum, String email){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public void setCustomer(Customer c){
		name = c.name;
		gender = c.gender;
		age = c.age;
		phoneNum = c.phoneNum;
		email = c.email;
	}
	
	public void setCustomer(String name,boolean gender,int age,String phoneNum, String email){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String showInfo(){
		return name + "\t" + (gender == true ? "男" : "女") + "\t" + age + "\t" + phoneNum + "\t" + email;
	}
	

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getGender(){
		return gender == true ? "男" : "女";
	}
	public void setGender(boolean gender){
		this.gender = gender;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getPhoneNum(){
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum){
		this.phoneNum = phoneNum;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
}
