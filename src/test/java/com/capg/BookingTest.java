package com.capg;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.capgemin.onlinemovieticket.service.Booking;
import com.capgemini.onlinemovietcket.beans.Movie;
import com.capgemini.onlinemovieticket.dao.DataHandler;

public class BookingTest {

	@Test
	public void test() {
		boolean val1=false;;
	       Booking book = new Booking();
	        List<Movie> listOfMovies = DataHandler.getMovies();
	        for(Movie m:listOfMovies) {
	        	  val1 =  book.bookMovieTicket(listOfMovies);	
	        	  break;
	        }
	      
	      
	       System.out.println(val1);
	       assertEquals(true, val1);
	       
	       boolean val= book.cancealMovieTicket();
	       assertEquals(true, val);
	}

}
