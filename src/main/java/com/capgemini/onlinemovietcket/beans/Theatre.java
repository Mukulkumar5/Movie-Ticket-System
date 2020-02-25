package com.capgemini.onlinemovietcket.beans;

public class Theatre {

	private int theaterId;

	private String theaterName;
	private String theaterCity;
	private Movie[] movies;
	private Screen[] listOfScreens;
	private String managerName;
	private String managerContact;

	public Theatre(int theaterId, String theaterName, String theaterCity, Movie[] movies, Screen[] listOfScreens,
			String managerName, String managerContact) {
		super();
		this.theaterId = theaterId;
		this.theaterName = theaterName;
		this.theaterCity = theaterCity;
		this.movies = movies;
		this.listOfScreens = listOfScreens;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}

	public int getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getTheaterCity() {
		return theaterCity;
	}

	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}

	public Movie[] getMovies() {
		return movies;
	}

	public void setMovies(Movie[] movies) {
		this.movies = movies;
	}

	public Screen[] getListOfScreens() {
		return listOfScreens;
	}

	public void setListOfScreens(Screen[] listOfScreens) {
		this.listOfScreens = listOfScreens;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}

	public Movie searchMovie(String movieName) {
		for (Movie m : movies) {
			if (m.getMovieName().equals(movieName)) {
				return m;
			}
		}
		return null;
	}

	public Screen searchScreen(String screenName) {
		for (Screen s : listOfScreens) {
			if (s.getScreenName().equals(screenName)) {
				return s;
			}
		}
		return null;
	}

}
