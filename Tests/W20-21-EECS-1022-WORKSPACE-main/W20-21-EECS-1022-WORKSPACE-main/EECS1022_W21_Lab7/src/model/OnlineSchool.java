package model;

public class OnlineSchool {
	// Attributes
	private Participant[] participants;
	private Participant[] backup;
	private int n;
	
		// Constructor
	public OnlineSchool() {
		this.participants = new Participant[100];
		this.n = 0;
		
	}
		
		// Accessor
	
	public Participant[] getParticipants(String course) {
		Participant[] current = null;
		int repeat = 0;
		int m = 0;
		int l = 0;
		boolean stay = true;
		boolean stay1 = true;
		this.backup = new Participant[this.n];
		for(int i = 0; i < this.n; i ++ ) {
			this.backup[i] = this.participants[i];
		}
		
		for(int k = 0; k < this.n; k ++) {
			for(int p = 0; p < this.backup[k].getCount(); p ++ ) {
				if (this.backup[k].getArray()[p].getTitle().equals(course)) {
					repeat ++;
				}
			}
		}
		
		current = new Participant[repeat];
		
		for(int k = 0; k < this.n; k ++) {
			for(int p = 0; p < this.backup[k].getCount(); p ++ ) {
				if (this.backup[k].getArray()[p].getTitle().equals(course)) {
					stay1 = true;
					for(; stay1 && l < repeat; l ++) {
						current[l] = this.backup[k];
						stay1 = false;
					}
				}
			}
		}
		
		
		return current;
	}
		
		// Mutator
	
	public void addParticipant(Participant participant) {
		this.participants[this.n] = participant;
		this.n ++;
	}
}
