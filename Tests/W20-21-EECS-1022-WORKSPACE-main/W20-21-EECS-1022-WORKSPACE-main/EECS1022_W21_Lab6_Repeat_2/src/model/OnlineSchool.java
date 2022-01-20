package model;

public class OnlineSchool {
	
	// Attributes
	private Participant[] participants;
	private Participant[] backup;
	private int nop;
	
	// Constructor
	public OnlineSchool() {
		this.participants = new Participant[100];
	}
	
	// Accessor 
	public Participant[] getParticipants(String course) {	
		int counter = 0;
		boolean stay = true;
		int n = 0;
		
		for (int i = 0; i < this.nop; i++) {
			for(int m = 0; m < this.participants[i].getRegistrations().length; m ++) {
				if (this.participants[i].getRegistrations()[m].getTitle().equals(course)) {
					counter ++;
				}
			}
		}
		
		Participant[] temp = new Participant[counter];
		
		for (int i = 0; i < this.nop; i++) {
			for(int m = 0; m < this.participants[i].getRegistrations().length; m ++) {
				if (this.participants[i].getRegistrations()[m].getTitle().equals(course)) {
					stay = true;
					for (; stay && n < counter; n++) {
						temp[n] = this.participants[i];
						stay = false;
					}
				}
			}
		}
		return temp;
	}
	
	// Mutator
	public void addParticipant(Participant p) {
		if (this.nop < 100) {
			this.participants[this.nop] = p;
			this.nop ++;
		}	
	}
	
}
