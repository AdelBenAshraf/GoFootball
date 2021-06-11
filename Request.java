package Assignment4;

import java.util.Date;

/**
 * A class responsible for creating a request to book a play ground which aggregates from class System
 * @author Muhammed Yassin
 * @version 1.0 June 9, 2021
 */
public class Request {
	private double noOfHours;
	private Playground playground;
	private Date dateAndTime;
	private Player player;
	public Request(double hours,Playground Playground, Date dateTime,Player Player) {
		noOfHours=hours;
		playground=Playground;
		dateAndTime=dateTime;
		player=Player;
		
	}
}
