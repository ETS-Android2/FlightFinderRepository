
public class ConstantCannotBeReassigned {
	public static void main(String[] args) {
		/* A constant can only be initialized once. */
		final double pi = 3.14;
		/* Reassignment of a constant is illegal. */
		pi = 6.28;
	}
}



