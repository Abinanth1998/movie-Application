package com.abinanth;

public class TestSeatRupees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int typeOfSeat=0;
		int numberOfSeat=0;
		//rupees calculation with gst
		if(typeOfSeat==0 && numberOfSeat==0) {
			System.out.println("Invalid");
		} else {
		SeatRupees.seatCalculation(typeOfSeat, numberOfSeat);
	}
	}
}
