package model;

public class OnlineSchool {
	
	// Attributes
	private Participant[] participants;
	private final int MAX_NUM_OF_PARTICIPANTS = 100;
	private int count;
	private int add;
	private Participant[] backup;
	
	// Constructor
	
	public OnlineSchool() {
		this.participants = new Participant[MAX_NUM_OF_PARTICIPANTS];
	}
	
	// Accessor
	
	public Participant[] getParticipants(String course) {

		for(int m = 0; m < this.count; m ++) { // Goes through the this.participants array which has 100 max length but but it will only go through the number of added participants
			for (int i = 0; i < this.participants[m].getArrayNoNull().length; i ++ ) { // this loop will go through each participant in the allArray, which can be null 
				if (this.participants[m].getArrayNoNull()[i] == null) {
				}
				else if (this.participants[m].getArrayNoNull()[i].getTitle().equals(course)) { // if allArray participant is not null and then it will check each course name, if it matches with argument it will increment this.add to count. 
					this.add ++;
				}
		}
		}
		
		boolean stay = true; // used for early exit
		int n = 0;
		this.backup = new Participant[this.add];
		for(int m = 0; m < this.count; m ++) {
			for (int i = 0; i < this.participants[m].getArrayNoNull().length; i ++ ) {
				if (this.participants[m].getArrayNoNull()[i] == null) {
				}
				else if (this.participants[m].getArrayNoNull()[i].getTitle().equals(course)) { // same comments as line 26, if that is the case, we will create a new for loop and add the one that satisfied the condition to our array that we want to return.
					stay = true;
					for (; stay && n < this.add; n ++) {
						this.backup[n] = this.participants[m];
						stay = false; // used to keep the (int n) with the value it remained and come back and add a new participant in the next (int n) when it's satisfied. that's why (int n) was placed outside the loop
					}
				}
		}
		}
		
		this.add = 0;
		return this.backup;
		}
	
	// Mutator 
	public void addParticipant(Participant participant) { // new participants can be added upon invoking
		if (this.count < MAX_NUM_OF_PARTICIPANTS) {
			this.participants[this.count] = participant;
			this.count ++;
		}
	}
	

	
}
