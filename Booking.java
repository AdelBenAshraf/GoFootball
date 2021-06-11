package Assignment4;

/**
 ** A class responsible for creating a request to book a play ground which aggregates from class System
 * @author Muhammed Yassin
 * @version 1.0 June 8, 2021
 */
public class Booking {
	private Request request;
	private boolean status;
	/**
	 * A function to set the current status of the player request whether it will be accepted or not
	 */
	public void setStatus(String Status) {
		if (Status=="accepted")
			status=true;
		else
			status=false;
	}
	/**
	 * A function to remove a request from the array list of requests
	 */
	public void removeFromRequests() {
		
	}

	/**
	 * A function to remove a booking from the array list of bookings
	 */
	public void removeFromBookings() {
		
	}
}

