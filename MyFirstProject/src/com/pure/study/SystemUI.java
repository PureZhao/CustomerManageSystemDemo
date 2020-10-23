package com.pure.study;

public class SystemUI {
	public static void printMenu(){
		System.out.println("----------------------------客户管理系统----------------------------");
		System.out.println("                    1: 添加用户");
		System.out.println("                    2: 删除用户");
		System.out.println("                    3: 修改信息");
		System.out.println("                    4: 查看全部信息");
		System.out.println("                    5: 退        出");
		System.out.print("请输入操作代码进行操作：");
	}
	public static int printDeleteChoice(){
		System.out.println("                    1: 按姓名删除");
		System.out.println("                    2: 按编号删除");
		System.out.print("请输入操作代码进行操作：");
		return Input.ReadInt();
	}
	public static int printModifyIndex(){
		System.out.print("请输入修改用户编号：");
		return Input.ReadInt();
	}
	public static boolean exitSystem(){
		System.out.print("是否退出系统(Y/N): ");
		return !Input.ReadBoolean();
		
			
	}
}
