package com.capgemini.onlinemovieticket.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.onlinemovietcket.beans.Movie;
import com.capgemini.onlinemovietcket.beans.Screen;
import com.capgemini.onlinemovietcket.beans.Theatre;

public class DataHandler {
	
	
	public static List<Integer> getTicket(int count){
		List<Integer> movieTicket = new ArrayList<Integer>();
		
		 movieTicket.add(count);
		 
		 return movieTicket; 
		
	}
	
	public  static List<Movie> getMovies()
	{
		ArrayList<Movie> movies = new ArrayList<Movie>();
		String[] lang = {"Hindi","English"};
		movies.add(new Movie(3001,"Chhichhore", "Nitesh Tiwari", 154, lang, LocalDate.parse("2019-09-06")));
		movies.add(new Movie(3002,"Dream Girl", "Raaj Shaandilyaa", 140, lang, LocalDate.parse("2019-09-13")));
		movies.add(new Movie(3003,"War", "Siddharth Anand", 139, lang, LocalDate.parse("2019-10-02")));
		movies.add(new Movie(3004,"Bala", "Amar Kaushik", 153, lang, LocalDate.parse("2019-11-22")));
		movies.add(new Movie(3005,"Marjaavaan", "Milap Milan Zaveri", 150, lang, LocalDate.parse("2019-11-22")));
		movies.add(new Movie(3006,"Dabangg 3", "Prabhu Deva", 159, lang, LocalDate.parse("2019-12-20")));
		movies.add(new Movie(3007,"Panipat", "Ashutosh Gowariker", 145, lang, LocalDate.parse("2019-12-06")));
		movies.add(new Movie(3008,"Good News", "Raj Mehta", 160, lang, LocalDate.parse("2019-12-20")));
		movies.add(new Movie(3009,"Mardaani 2", "Gopi Puthran", 163, lang, LocalDate.parse("2019-12-13")));
		movies.add(new Movie(3010,"Housefull 4", "Farhad Samji", 154, lang, LocalDate.parse("2019-10-25")));
		
		return movies;
	}
	
	public static List<Screen> getListOfScreens()
	{
		ArrayList<Screen> listOfScreens = new ArrayList<Screen>();
		listOfScreens.add(new Screen(102001,2001,"Screen1",LocalDate.parse("2019-09-30"),25,20));
		listOfScreens.add(new Screen(112001,2001,"Screen2",LocalDate.parse("2019-09-25"),25,20));
		listOfScreens.add(new Screen(102002,2002,"Screen3",LocalDate.parse("2019-09-20"),25,20));
		listOfScreens.add(new Screen(112002,2002,"Screen4",LocalDate.parse("2019-09-30"),25,20));
		listOfScreens.add(new Screen(102003,2003,"Screen5",LocalDate.parse("2019-09-26"),25,20));
		listOfScreens.add(new Screen(112003,2003,"Screen6",LocalDate.parse("2019-09-27"),25,20));
		listOfScreens.add(new Screen(122003,2003,"Screen7",LocalDate.parse("2019-09-28"),25,20));
		
		return listOfScreens;

	}
	
	public static List<Theatre> getListOfTheatres(List<Movie> movies, List<Screen> listOfScreens)
	{
		ArrayList<Theatre> listOfTheatres = new ArrayList<Theatre>();
		
		listOfTheatres.add(new Theatre(2001,"PVR Cinemas","1",addMoviesToTheatre(movies, 2),addScreenToTheatre(listOfScreens, 2001,2),"Aditya Singh","9876543210"));
		listOfTheatres.add(new Theatre(2002,"Cinepolis Cinemas","1",addMoviesToTheatre(movies, 4),addScreenToTheatre(listOfScreens, 2002,2),"Mohd. Ikram","8876543210"));
		listOfTheatres.add(new Theatre(2003,"INOX Cinemas","1",addMoviesToTheatre(movies, 7),addScreenToTheatre(listOfScreens, 2003,3),"Divyansh Singh","7876543210"));
		listOfTheatres.add(new Theatre(2001,"Cinepolis Cinemas","2",addMoviesToTheatre(movies, 4),addScreenToTheatre(listOfScreens, 2002,2),"Mohd. Ikram","8876543210"));
		listOfTheatres.add(new Theatre(2002,"PVR Cinemas","2",addMoviesToTheatre(movies, 4),addScreenToTheatre(listOfScreens, 2002,2),"Mohd. Ikram","8876543210"));
		listOfTheatres.add(new Theatre(2003,"INOX Cinema","2",addMoviesToTheatre(movies, 4),addScreenToTheatre(listOfScreens, 2002,2),"Mohd. Ikram","8876543210"));
		listOfTheatres.add(new Theatre(2001,"INOX Cinemas","3",addMoviesToTheatre(movies, 7),addScreenToTheatre(listOfScreens, 2003,3),"Divyansh Singh","7876543210"));
		listOfTheatres.add(new Theatre(2002,"PVR Cinemas","3",addMoviesToTheatre(movies, 7),addScreenToTheatre(listOfScreens, 2003,3),"Divyansh Singh","7876543210"));
		listOfTheatres.add(new Theatre(2003,"Cinepolis Cinemas","3",addMoviesToTheatre(movies, 7),addScreenToTheatre(listOfScreens, 2003,3),"Divyansh Singh","7876543210"));
		return listOfTheatres;
	}
	
	public static Movie[] addMoviesToTheatre(List<Movie> movies,int n)
	{	Movie[] movie = new Movie[n];
		for(int i=0;i<n;i++)
			movie[i]= movies.get(i);
		return movie;	
	}
	
	public static Screen[] addScreenToTheatre(List<Screen> listOfScreens,int theatreId,int n)
	{
		Screen[] screen = new Screen[n];
		int j=0;
		for(int i=0;i<7;i++)
			if(listOfScreens.get(i).getTheatreId()==theatreId)
			{
				screen[j]= listOfScreens.get(i);
				j++;
			}
		return screen;
		
	}

}
