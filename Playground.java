package Assignment4;

/**
 * A class responsible for making a playground and takes its information with a function to add rating to the playground
 * @author Muhammed Yassin
 *@version 1.0 June 8, 2021
 */
public class Playground {
	private double length;
	private double width;
	private String location;
	private PlaygroundOwner owner;
	private short capacity;
	private double pricePerHour;
	private short rating;
	private String groundType;
	private short openingHours;
	private boolean status;
	
	/**
	 * A parameterized constructor that constructs and initializes a playground object and passes to it his attributes  values
	 */
	public Playground(short len,double wid,String loc,PlaygroundOwner Owner,short cap,double price,String Gtype,short openHours) {
		length=len;
		width=wid;
		location =loc;
		owner=Owner;
		capacity=cap;
		pricePerHour=price;
		groundType=Gtype;
		openingHours=openHours;
	}
	/**
	 * A function used to add a rating value to the current playground
	 */
	public void addRating(short Rating) {
		rating=Rating;
	}

}
