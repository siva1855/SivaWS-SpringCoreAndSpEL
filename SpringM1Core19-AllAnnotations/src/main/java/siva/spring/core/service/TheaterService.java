package siva.spring.core.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import siva.spring.core.beans.Ticket;

@Service
public class TheaterService {

	private static Ticket[] ticket;

	static {
		ticket = new Ticket[] { new Ticket("Satyam", "Arjun Reddy", 50), new Ticket("Gokul", "Githa Govindam", 70),
				new Ticket("Sesikala", "Julayi", 100), new Ticket("Laksmikala", "Avengers", 120),
				new Ticket("Himax", "Irom Man", 200), };
	}

	public List<Ticket> getTheaterByMovieName(String movieName) {

		List<Ticket> ticketTheaterListObj = new ArrayList<Ticket>();

		for (Ticket eachTheaterTicket : ticket) {

			if (eachTheaterTicket.getMovieName().equals(movieName)) {

				ticketTheaterListObj.add(eachTheaterTicket);
			}
		}
		return ticketTheaterListObj;
	}
}
