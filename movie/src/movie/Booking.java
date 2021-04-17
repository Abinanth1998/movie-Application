package movie;

import java.util.*;

import com.abinanth.Login;
import com.abinanth.SeatRupees;
import com.abinanth.SeatsAvailable;
//import com.abinanth.SeatsGst;

public class Booking {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter Correct Phone Number");
		Long mobile=scan.nextLong();
		String cellno=String.valueOf(mobile);
		System.out.println("Enter Correct Password");

		String password=scan.next();
		if(Login.phoneCheck(cellno)==true && Login.passwordCheck(password)) {
			//System.out.println(" Phone number correct");
			System.out.println("Login Sucessfull!!!!!!!");
		} else {
			System.out.println("error");
		}
		SeatsAvailable.seats();;
		System.out.println("Enter the type of seat you need");
		int seatAvailable=scan.nextInt();
		System.out.println("Enter number of seat you need");
		int tickets=scan.nextInt();
		SeatRupees.seatCalculation(seatAvailable, tickets);
}
}