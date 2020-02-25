package com.capgemini.onlinemovieticket.controller;

import java.time.LocalDate;

import java.util.List;
import java.util.Scanner;

import com.capgemin.onlinemovieticket.service.Booking;
import com.capgemini.onlinemovietcket.beans.Movie;
import com.capgemini.onlinemovietcket.beans.Screen;
import com.capgemini.onlinemovietcket.beans.Theatre;
import com.capgemini.onlinemovieticket.dao.DataHandler;


/*
 * Customer class call other class method and also return list of Theatre
 */
public class Customer {

	private String customerId;

	private String customerName;

	private String customerPassword;

	private LocalDate dateofBirth;

	private String customerContact;

	static List<Movie> listOfMovies;
	static List<Screen> listOfScreens;
	static List<Theatre> listOfTheatres;

	public Customer() {
		super();

		customerWork();

	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public LocalDate getDateOfBirth() {
		return dateofBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		dateofBirth = dateOfBirth;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	private void customerWork() {


		// Get the list of movies from DataHandler Class
		listOfMovies = DataHandler.getMovies();
		
		//Get the list of Screens from DataHandler Class
		listOfScreens = DataHandler.getListOfScreens();
		
		//Get the list of theatres from DataHandler Class
		listOfTheatres = DataHandler.getListOfTheatres(listOfMovies, listOfScreens);

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("\t\t\t\tONLINE MOVIE TICKET SYSTEM\n\n");
		
		// decleare variable to use in repeated form.
		int s1;
		
		// by using do-while loop perform more task at a time.
		do {

			System.out.println("Press:....\n     \t\t1.Greater Noida\n     \t\t2.Noida\n     \t\t3.Patna \n     \t\t4.Ahmedabad");

			String choose = sc1.next();
 
			//chooseCity display the all theatres in particular city it will return true or false. If theatres is present then return 
			//true otherwise false
			if(!choose.equals("1")&&!choose.equals("2") && !choose.equals("3")&& !choose.equals("4")){
				
				System.out.println("Please Press[1 or 2 or 3 or 4]");
				break;
			}else{
				
			boolean cityValue = chooseCity(choose);
			System.out.println(cityValue);
			
			// Here call Booking Class using parameterise constructor and in Booking class it will print all movie present in that 
			// particular theatres
			Booking book = new Booking(listOfTheatres, listOfMovies, cityValue);
		

			System.out.println();
			
		
			
			if(cityValue) {
			
			System.out.println("Press...........\n1. FOR BOOK MOVIE TICKET\n2.FOR CANCEAL MOVIE TICKET\n3.EXIT");
			
			int userVal = sc2.nextInt();
			
			switch(userVal) {
			
			case 1:	System.out.println(book.bookMovieTicket(listOfMovies));
			        break;
			    
			case 2: System.out.println(book.cancealMovieTicket());
			        break;
			  
			default: System.out.println("You are not selected any one");        
				     
			
						}
			}
			}
			System.out.println("\n 1.Press to perform more and \n 2. To exit ");

			s1 = sc2.nextInt();
		} while (s1 == 1);
		sc.close();
		sc1.close();
		sc2.close();

	}



	public static boolean chooseCity(String choose) {
		 boolean value = false;

		System.out.println("............THEATRE IN THIS CITY.............");
		System.out.println();

		for (Theatre city : listOfTheatres) {

			if (city.getTheaterCity().equals(choose)) {

				System.out.println("     \t\t"+city.getTheaterId()+" "+city.getTheaterName());
				
				value = true;

			}

		}
		
		System.out.println();
		return value;
	}

}
