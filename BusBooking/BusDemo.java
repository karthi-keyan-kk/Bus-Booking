package BusBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Bus> buses = new ArrayList <Bus>();
		
		ArrayList <Booking> bookings = new ArrayList <Booking>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));
		
		int useropt = 1;
		
		Scanner sc = new Scanner(System.in);
		for(Bus b:buses) {
			b.displatInfo();
		}
		while(useropt == 1) {
			System.out.println("Enter 1 to book and 2 to exit");
			
			useropt = sc.nextInt();
			if(useropt == 1) {
				Booking booking = new Booking();
				if(booking.isAvailabe(bookings, buses)) {
					bookings.add(booking);
					System.out.println("Your booking is conformed");
				}
				else {
					System.out.println("Sorry. Bus is full.Try another bus or date.");
				}
			}
		}
	}
}
