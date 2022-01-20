package model;

public class MovieRecord {
	// Attributes
	private String movieName;
	private int numMovie;
	private Zone zone;
	private static int order = 0;
	private String result;
	

	public static int noDvd = 0;
	
	
	// Constructor
	public MovieRecord(String movieName, int numMovie, Zone zone) {
		this.movieName = movieName;
		this.numMovie = numMovie;
		this.zone = zone;
		MovieRecord.order ++;
		this.result = this.zone.getID() + "-" + this.movieName + "-" + MovieRecord.order;
//		
//		MovieRecord.noDvd = MovieRecord.noDvd + numMovie;
	}
	
	// Accesoor
	public String getName() {
		return this.movieName;
	}
	
	public int getGlobe() {
		int r = 0;
		MovieRecord.noDvd +=this.numMovie;
		r += MovieRecord.noDvd;
		return r;
		
	}
	
	public int getNumdvd() {
		return this.numMovie;
	}
	
	
	public int getNumberOfDVDs() {
		return this.numMovie;
	}
	
	public Zone getZone() {
		return this.zone;
	}
		
	public String getID() {
		return this.result;
	}
	// Mutator
}




















