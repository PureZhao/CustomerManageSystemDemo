package com.pure.study;

public class MainProgram {
	public static void main(String[] args) {
		CustomerList customerList = new CustomerList();
		customerList.addCustomer("Pure", true, 22, "18781723892", "923564115@qq.com");
		customerList.addCustomer("Zhao", false, 24, "13112294330", "zhao@qq.com");
		customerList.addCustomer("Guiping", true, 11, "13446685799", "guiping@qq.com");
		boolean flag = true;
		
		while(flag){
			SystemUI.printMenu();
			int opCode = Input.ReadInt();
			if(opCode <= 0 || opCode > 5){
				System.out.println("操作代码输入错误");
				continue;
			}
			switch(opCode){
				case 1: customerList.addCustomer(); break;
				case 2: 
					switch(SystemUI.printDeleteChoice()){
						case 1 :System.out.print("输出删除用户的姓名: "); customerList.deleteCustomer(Input.ReadString()); break;
						case 2 :System.out.print("输出删除用户的比编号: "); customerList.deleteCustomer(Input.ReadInt()); break;
					};
					break;
				case 3: customerList.modifyCustomer(SystemUI.printModifyIndex()); break;
				case 4: customerList.showList(); break;
				case 5: flag = SystemUI.exitSystem(); System.out.println(flag); break;
			}
		}
		
		System.out.println("系统退出");
	
	}
}
