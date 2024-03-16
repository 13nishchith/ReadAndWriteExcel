package com.readandwriteexcel.ReadAndWriteExcel;

public class MoviesDTO {
	
	private String movieName;
	
	private String movieLanguage;
	
	private String movieType;
	
	private String actorName;
	
	private String actressName;
	
	private double movieBudget;
	
	private double movieCollection;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieLanguage() {
		return movieLanguage;
	}

	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	public String getMovieType() {
		return movieType;
	}

	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getActressName() {
		return actressName;
	}

	public void setActressName(String actressName) {
		this.actressName = actressName;
	}

	public double getMovieBudget() {
		return movieBudget;
	}

	public void setMovieBudget(double movieBudget) {
		this.movieBudget = movieBudget;
	}

	public double getMovieCollection() {
		return movieCollection;
	}

	public void setMovieCollection(double movieCollection) {
		this.movieCollection = movieCollection;
	}

	@Override
	public String toString() {
		return "MoviesDTO [movieName=" + movieName + ", movieLanguage=" + movieLanguage + ", movieType=" + movieType
				+ ", actorName=" + actorName + ", actressName=" + actressName + ", movieBudget=" + movieBudget
				+ ", movieCollection=" + movieCollection + "]";
	}
}
