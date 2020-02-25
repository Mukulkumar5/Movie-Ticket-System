package com.capgemin.onlinemovieticket.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.capgemini.onlinemovietcket.beans.Movie;
import com.capgemini.onlinemovietcket.beans.Theatre;
import com.capgemini.onlinemovietcket.beans.Ticket;

/*
 * Booking class Book movie ticket and Canceal Movie ticket
 * 
 */
public class Booking {

	Theatre th;
	int count;

	static List<Integer> seatAvailable = new ArrayList<Integer>();

	// Non-parameterise Constructor
	public Booking() {

	}

	// Parametrise constructor take listOfTheatres, listOfMovies and City and call
	// CheckMovie method
	public Booking(List<Theatre> listOfTheatres, List<Movie> listOfMovies, boolean cityValue) {

		checkMovie(listOfTheatres, listOfMovies, cityValue);

	}

//Print list of Movie in theatre
	private void checkMovie(List<Theatre> listOfTheatres, List<Movie> listOfMovies, boolean cityValue) {

		// cityValue is boolean type if true it means theatre is present City false
		// means theatre is not present
		if (cityValue) {

			System.out.println("\n     \t\tEnter Theatre ID");
			Scanner scan = new Scanner(System.in);
			Integer theatre = 0;
			try {
				theatre = scan.nextInt();
			} catch (Exception e) {

			}

			if (theatre != 2001 && theatre != 2002 && theatre != 2003 && theatre != 2004) {

				System.out.println("Please Enter Right Theatre Id");
				System.exit(0);
			} else {
				System.out.println("Movie in " + theatre + "Id");

				for (Theatre t : listOfTheatres) {

					if (t.getTheaterId() == theatre) {
						for (Movie mscr : listOfMovies) {

							System.out.println("     \t\t" + mscr.getMovieName());

						}

					}

				}
			}

		} else {
			System.out.println("Sorry No any theatre");

		}
	}

	public boolean bookMovieTicket(List<Movie> listOfMovies) {

		boolean movieMatch = false;

		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Movie Name");
		String movieName = "";
		try {
			movieName = scan.nextLine();
		} catch (Exception e) {

			System.out.println("Please Enetr Right Name of Movie");
		}

		for (Movie mscr : listOfMovies) {

			if (mscr.getMovieName().equalsIgnoreCase(movieName)) {

				movieMatch = true;
				break;
			}

		}

		if (movieMatch) {
			Random read = new Random();

			int price = read.nextInt(250 - 150) + 150;

			System.out.println("Enter price of movie " + price + "/-");

			int userPrice = sc.nextInt();

			if (userPrice == price && seatAvailable.size() <= 10) {

				count++;
				System.out.println("Your ticket is booked");
				seatAvailable.add(count);

			} else {
				System.out.println("Sorry you have to pay " + price);

			}

		} else {
			System.out.println("SORRY MOVIE IS NOT IN THIS LIST");

		}

		if (count == 0 || movieMatch) {

			return movieMatch;
		} else {

			return movieMatch;
		}

	}

	public boolean cancealMovieTicket() {

		Scanner sc = new Scanner(System.in);
		if (seatAvailable.isEmpty()) {

			System.out.println("You have not booked any ticket");
			return false;
		} else {

			System.out.println("Which ticket you want to canceal....\n Start from 0 Enter Position");

			int canceal = sc.nextInt();

			int val = seatAvailable.remove(canceal);

			System.out.println(" Ticket has cancelled.......");
			System.out.println("YOUR TICKETID IS " + val);

			return true;

		}

	}

}
