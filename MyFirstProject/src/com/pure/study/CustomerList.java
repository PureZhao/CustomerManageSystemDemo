package com.pure.study;

public class CustomerList {
	public Customer[] customers;
	public int total;
	
	public CustomerList(){
		customers = new Customer[10];
		for(int i = 0; i < customers.length; i++)
			customers[i] = new Customer();
		total = 0;
	}
	
	public void addCustomer(){
		//姓名
		System.out.print("姓名: ");
		customers[total].setName(Input.ReadString());
		//性别
		System.out.print("性别 ture(男) false(女): ");
		customers[total].setGender(Input.ReadBoolean());
		//年龄
		System.out.print("年龄: ");
		customers[total].setAge(Input.ReadInt());
		//修改电话号码
		System.out.print("电话号码: ");
		customers[total].setPhoneNum(Input.ReadString());
		//电子邮箱
		System.out.print("当前电子邮件: ");
		customers[total].setEmail(Input.ReadString());
		total++;
		System.out.println("----------------------------添加完成----------------------------");
	}
	public void addCustomer(Customer c){
		customers[total].setCustomer(c);
		total++;
	}
	public void addCustomer(String name,boolean gender,int age,String phoneNum, String email){
		customers[total].setCustomer(name, gender, age, phoneNum, email);
		total++;
	}
	
	public void deleteCustomer(int deleteIndex){
		if(deleteIndex >= total || deleteIndex <= 0){
			System.out.println("库中查无此索引");
			return;
		}
		if(deleteIndex == total){
			total--;
			System.out.println("删除成功");
			return;
		}
		for(int i = deleteIndex - 1;i < total -1;i++ ){
			customers[i] = customers[i + 1];
		}
		total--;
		System.out.println("删除成功");
	}
	public void deleteCustomer(String deleteName){
		for(int i = 0;i < total; i++){
			System.out.println(deleteName);
			if(customers[i].getName().compareTo(deleteName) == 0){
				for(;i < total -1;i++ ){
					customers[i] = customers[i + 1];
				}
				total--;
				return;
			}
		}
		System.out.println("库中查无此人");
	}
	
	public void replaceCustomer(int replaceIndex, Customer tempCust){
		if(replaceIndex >= total || replaceIndex <= 0){
			System.out.println("库中查无此索引");
			return;
		}
		customers[replaceIndex - 1].setCustomer(tempCust);
		System.out.println("替换完成");
	}
	public void replaceCustomer(String replaceName, Customer tempCust){
		for(int i = 0;i < total; i++){
			if(customers[i].getName() == replaceName.trim()){
				customers[i].setCustomer(tempCust);
				System.out.println("替换完成");
				return;
			}
		}
		System.out.println("库中查无此人");
	}
	
	public void modifyCustomer(int modifyIndex){
		if(modifyIndex >= total || modifyIndex <= 0){
			System.out.println("库中查无此索引");
			return;
		}
		int i = modifyIndex - 1;
		String tempString = "";
		//修改名字
		System.out.print("(当前姓名：" + customers[i].getName()+ "): ");
		tempString = Input.ReadString();
		if(tempString != null)
			customers[i].setName(tempString);
		tempString = "";
		//修改性别
		System.out.print("(当前性别：" + customers[i].getGender()+ ")ture(男) false(女): ");
		tempString = Input.ReadString();
		
		boolean temp = Boolean.parseBoolean(tempString);
		if(tempString != null)
			customers[i].setGender(temp);
		tempString = "";
		//修改年龄
		System.out.print("(当前年龄：" + customers[i].getAge() + "): ");
		tempString = Input.ReadString();
		int tempInt = Integer.parseInt(tempString);
		if(tempString != null)
			customers[i].setAge(tempInt);
		tempString = "";
		//修改电话号码
		System.out.print("(当前电话号码：" + customers[i].getPhoneNum() + "): ");
		tempString = Input.ReadString();
		if(tempString != null)
			customers[i].setPhoneNum(tempString);
		tempString = "";
		//修改电子邮箱
		System.out.print("(当前电子邮件：" + customers[i].getEmail() + "): ");
		tempString = Input.ReadString();
		if(tempString != null)
			customers[i].setEmail(tempString);
		
		System.out.println("修改完成");
	}
	
	
	public void showList(){
		if (total == 0) {
			System.out.println("库中无用户");
			return;
		}											
		System.out.println("编号\t姓名\t性别\t年龄\t      电话号码\t         电子邮箱");
		for (int i = 0;i < total;i++) {
			System.out.println((i + 1) + "\t" + customers[i].showInfo());
		}
	}
	
}
