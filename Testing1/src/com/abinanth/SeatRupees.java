package com.abinanth;
import java.util.*;
public class SeatRupees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the type seat you need");
		int seat=scan.nextInt();
		System.out.println("Enter the number of seats u need");
		int numberOfSeats=scan.nextInt();
		seatCalculation(seat, numberOfSeats);
	}

	public static void seatCalculation(int seat, int numberOfSeats) {
		if(seat!=0) {
			if(seat==1) {
				int amount=50*numberOfSeats;
				double gst=amount+(amount*12.5/100);
				System.out.println(gst);
			} else if(seat==2) {
				int amount=100*numberOfSeats;
				double gst=amount+(amount*12.5/100);
				System.out.println(gst);
			} else {
				int amount=100*numberOfSeats;
				double gst=amount+(amount*12.5/100);
				System.out.println(gst);
			}
		}
	}

}
