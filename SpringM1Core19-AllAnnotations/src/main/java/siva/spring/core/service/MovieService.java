package siva.spring.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import siva.spring.core.beans.Ticket;

@Service
public class MovieService {

	@Autowired
	private TheaterService thearterService;

	// @Value("Arjun Reddy")
	@Value("${movie.name}")
	private String myFaviroteMovieName;

	@Autowired
	private List<String> NamesList;

	public void getTheaterOfMovie() {
		List<Ticket> ticketMovieListObj = thearterService.getTheaterByMovieName(myFaviroteMovieName);
		for (Ticket eachMovieTicket : ticketMovieListObj) {
			System.out.println("Theater Name : " + eachMovieTicket.getTheaterName());
			System.out.println("Movie Name : " + eachMovieTicket.getMovieName());
			System.out.println("Ticket Price : " + eachMovieTicket.getTicketPrice());

		}

	}

	public void showFamilyNames() {
		System.out.println(NamesList);
	}

}
