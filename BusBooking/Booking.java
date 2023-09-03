package BusBooking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the passenger: ");
		passengerName = sc.next();
		System.out.println("Enter Bus Number (1, 2, 3): ");
		busNo = sc.nextInt();
		System.out.println("Enter date (dd-mm-yyyy): ");
		String dateInput = sc.next();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-mm-yyyy");
		
		try {
			date = dateformat.parse(dateInput);
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
	}
	public boolean isAvailabe(ArrayList <Booking> bookings, ArrayList <Bus> buses) {
		int capacity = 0;
		for(Bus bus:buses) {
			if(bus.getBusNo() == busNo) {
				capacity = bus.getCapacity();
			}
		}
		int booked = 0;
		for(Booking b:bookings) {
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		return booked < capacity ? true:false;
	}
}
