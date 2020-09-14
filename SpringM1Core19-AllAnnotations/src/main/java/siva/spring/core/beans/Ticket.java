package siva.spring.core.beans;

public class Ticket {

	private String theaterName;
	private String movieName;
	private double ticketPrice;

	public Ticket(String theaterName, String movieName, double ticketPrice) {
		super();
		this.theaterName = theaterName;
		this.movieName = movieName;
		this.ticketPrice = ticketPrice;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "Ticket [theaterName=" + theaterName + ", movieName=" + movieName + ", ticketPrice=" + ticketPrice + "]";
	}

}
