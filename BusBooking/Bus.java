package BusBooking;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int busNo, boolean ac, int capacity){
		this.busNo = busNo;
		this.ac = ac;
		this.capacity = capacity;
	}
	int getBusNo() {
		return busNo;
	}
	boolean isAC() {
		return ac;
	}
	int getCapacity() {
		return capacity;
	}
	void setAC(boolean val) {
		ac = val;
	}
	void setCapacity(int cap) {
		capacity = cap;
	}
	void displatInfo() {
		System.out.println("Bus No: "+busNo+","+" AC: "+ac+", Total capacity: "+capacity);
	}
}
