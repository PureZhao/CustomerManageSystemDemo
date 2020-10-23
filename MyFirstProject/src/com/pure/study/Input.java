package com.pure.study;
import java.util.Scanner;
public class Input {
	
	public static int ReadInt(){
		Scanner scanner = new Scanner(System.in);
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			return 0;
		}		
	}
	/**
	 * Get a float
	 * @return
	 */
	public static float ReadFloat(){
		Scanner scanner = new Scanner(System.in);
		try {
			return scanner.nextFloat();
		} catch (Exception e) {
			return 0;
		}		
	}
	
	public static double ReadDouble() {
		Scanner scanner = new Scanner(System.in);
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			return 0;
		}	
	}
	
	public static String ReadString() {
		Scanner scanner = new Scanner(System.in);
		try {
			return scanner.next();
		} catch (Exception e) {
			return null;
		}
	}
	public static boolean ReadBoolean() {
		Scanner scanner = new Scanner(System.in);
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			return false;
		}
	}
}
