package model;

public class Zone {
// Attributes
	private String nameOfZone;
	private static int id = 12;
	private int num;
	
	private MovieRecord[] mRecords;
	private int noz;
	
	
	
// Constructor
	public Zone(int num) {
		this.num = num;
		Zone.id += 11;
		this.nameOfZone = "Zone-";
		this.nameOfZone += Zone.id;
		
		this.mRecords = new MovieRecord[num];
		
		
	}
// Accesoor
	public String getID() {
		return this.nameOfZone;
	}
	
	public int getNumberOfMovieRecords() {
		return this.noz;
	}
	
	public int getNumberOfMovieDVDs() {
		int sum = 0;
		for (int i = 0; i < this.noz; i ++) {
			sum += this.mRecords[i].getNumdvd();
		}
		return sum;
		
	}
	
	public String getStatus() {
		String result = "";
		
		String seq = "{";
		
		for (int i = 0; i < this.noz; i ++) {
			if (i == this.noz - 1) {
				seq += this.mRecords[i].getName() + " (" + this.mRecords[i].getNumberOfDVDs() + ")";
			}
			else {
				seq += this.mRecords[i].getName() + " (" + this.mRecords[i].getNumberOfDVDs() + "), ";
			}
		}
		seq += "}";
		
		if (this.noz == 0) {
			result = this.noz + " records and " + this.getNumberOfMovieDVDs() + " DVDs: "; 
		}
		else {
			result = this.noz + " records and " + this.getNumberOfMovieDVDs() + " DVDs: ";
		}
		result += seq;
		
		if (this.getNumberOfMovieDVDs() > this.num) {
			result = "Error: maximum number of movie DVDs (" + (this.getNumberOfMovieDVDs() - 1) + ") reached";
		}
		return result;
	}
	
	
	
// Mutator
	public void addMovieRecord(MovieRecord mRecord) {
		if (this.num >= this.getNumberOfMovieDVDs()) {
			this.mRecords[this.noz] = mRecord;
			this.noz ++;
		}
		
		
	}
	
}


















 