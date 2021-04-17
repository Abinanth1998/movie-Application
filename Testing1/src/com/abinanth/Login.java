package com.abinanth;
import java.util.*;
public class Login {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the mobile number");
		Long mobile=scan.nextLong();
		String cellno=String.valueOf(mobile);
		//checking the number is valid or not
		if(phoneCheck(cellno)==true) {
			System.out.println("Nice");
		} else {
			System.out.println("error");
		}
		System.out.println("Enter the password number");
		String password=scan.next();
		//regex function to check password
		passwordCheck(password);
	}

	public static boolean passwordCheck(String password) {
		String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!#$%^&+=])(?=\\S+$).{8,20}";
		if(password.matches(pattern)) {
			//System.out.println("correct");
			return true;
		} else {
			//System.out.println("error");
			return false;
		}
	}

	public static boolean phoneCheck(String cellno) {
		if(cellno.length()==10) {
			return true;
		} else {
			return false;
		}
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			System.out.println("*****************************");
//			
//			//getting the password from the user
//			System.out.println("Enter the password number");
//			String password=scan.next();
//			//regex function to check password
//			String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!#$%^&+=])(?=\\S+$).{8,20}";
//			//checking password matching or not
//			if(password.matches(pattern)) {
//					System.out.println("valid");
//	} else {
//		System.out.println("error");
//	}
//
//}
//}
//}