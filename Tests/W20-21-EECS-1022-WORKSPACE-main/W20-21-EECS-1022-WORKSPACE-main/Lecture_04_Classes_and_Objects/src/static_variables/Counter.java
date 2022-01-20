package static_variables;

public class Counter {
	private int l; /* this is a non-static variable */
	static int g = 0; /* this is a static variable */
	
	public Counter() {
		this.l = 0;
	}
	
	public int getLocal() {
		return this.l;
	} 
	
	/* A mutator method that changes the local
	 * value of the context object. */
	public void incrementLocal() {
		this.l ++;
	}
	
	/* A mutator method that changes the global
	 * value, which is shared by all objects. */
	public void incrementGlobal() {
		this.g ++; // warning: static g is not accessed in a static way 
		// its better to do it this way -->  *Counter.g ++;*
	}
}







 

