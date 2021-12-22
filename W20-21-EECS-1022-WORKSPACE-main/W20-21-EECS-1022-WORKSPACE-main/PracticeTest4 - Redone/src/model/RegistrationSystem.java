package model;

public class RegistrationSystem {
	// Attributes
	private Transcript[] transcripts;
	private Transcript[] backup;
	private int not;
	
	// Constructor
	public RegistrationSystem() {
		this.transcripts = new Transcript[500];
	}
	
	// Accessor
	public Transcript[] getReport() {
		this.backup = new Transcript[this.not];
		for (int i = 0; i < this.not; i ++) {
			this.backup[i] = this.transcripts[i];
		}
		return this.backup;
	}
	
	public int getMarks(String id, String courseName) {
		int result = -1;
		for (int i = 0; i < this.not; i ++) {
			if (this.transcripts[i].getStudentID().equals(id)) {
				result = this.transcripts[i].getMarks(courseName);
			}
		}
		return result;
	}
		
	// Mutator
	public void addTranscript(Transcript t) {
		this.transcripts[this.not] = t;
		this.not ++;
	}
}
