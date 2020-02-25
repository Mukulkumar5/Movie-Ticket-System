package com.capgemini.onlinemovietcket.beans;

import java.time.LocalDate;

public class Screen {
	private int screenId;
	private int theatreId;
	private String screenName;
	private LocalDate movieEndDate;
	private int rows;
	private int columns;

	public Screen(int screenId, int theatreId, String screenName, LocalDate movieEndDate, int rows, int columns) {
		super();
		this.screenId = screenId;
		this.theatreId = theatreId;
		this.screenName = screenName;
		this.movieEndDate = movieEndDate;
		this.rows = rows;
		this.columns = columns;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public LocalDate getMovieEndDate() {
		return movieEndDate;
	}

	public void setMovieEndDate(LocalDate movieEndDate) {
		this.movieEndDate = movieEndDate;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

}
