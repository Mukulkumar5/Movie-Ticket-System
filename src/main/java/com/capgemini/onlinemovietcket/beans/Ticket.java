package com.capgemini.onlinemovietcket.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//import com.capgemini.onlinemovieticket.Ticket;

public class Ticket {

private  int ticketId;

	private String setaAvailable;

	private String theatreSelected;

	private String movieSelected;

	private int price;

	private int randomValue;

	private List<Ticket> myTickets;

	Ticket tkt;

	public Ticket(int ticketId, String movieSelected) {
		this.ticketId = ticketId;
		this.setMovieSelected(movieSelected);
       

	}

	public Ticket() {
		// TODO Auto-generated constructor stub

		//System.out.println(cancealMovieTicket());

	}

//	private boolean cancealMovieTicket() {
//		// TODO Auto-generated method stub
//		
//		System.out.println("Hello B");
//		Scanner sc = new Scanner(System.in);
//		if (myTickets.isEmpty()) {
//
//			System.out.println("You are not booking any ticket");
//			return false;
//		} else {
//
//			System.out.println("Which ticket you want to canceal....\n Enter Movie");
//
//			String canceal = sc.nextLine();
//
//			boolean val = myTickets.remove(canceal);
//			
//			
//			if(val) {
//				
//				System.out.println("Ticket is cancelled");
//				
//				return true;
//				
//			}else {
//				return false;
//			}
//
//			
//		}
//
//	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getSetaAvailable() {
		return setaAvailable;
	}

	public void setSetaAvailable(String setaAvailable) {
		this.setaAvailable = setaAvailable;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Ticket> getMyTickets() {
		return myTickets;
	}

	public void setMyTickets(List<Ticket> myTickets) {
		this.myTickets = myTickets;
	}

	public String getMovieSelected() {
		return movieSelected;
	}

	public void setMovieSelected(String movieSelected) {
		this.movieSelected = movieSelected;
	}

}
