//Class to input user details

public class User {
 String username;
 String toPlace;
 String fromPlace;
 int seats;
 double price;
public User(String username, String toPlace, String fromPlace, int seats,
		double price) {
	super();
	this.username = username;
	this.toPlace = toPlace;
	this.fromPlace = fromPlace;
	this.seats = seats;
	this.price = price;
}
//return user name
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
//return source place
public String getToPlace() {
	return toPlace;
}
public void setToPlace(String toPlace) {
	this.toPlace = toPlace;
}
//return destination place
public String getFromPlace() {
	return fromPlace;
}
public void setFromPlace(String fromPlace) {
	this.fromPlace = fromPlace;
}
//return seat number
public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}
//return price
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
}
