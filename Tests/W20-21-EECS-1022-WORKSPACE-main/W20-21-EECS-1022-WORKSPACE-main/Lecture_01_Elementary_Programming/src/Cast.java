
public class Cast {

	public static void main(String[] args) {
		
		System.out.println( 1 				/ 2				);	/* 0 */
		
		System.out.println( ((double) 1) 	/ 2				);	/* 0.5 */
		
		System.out.println( 1 				/ ((double) 2)	);	/* 0.5 */
		
		System.out.println( ((double) 1) 	/ ((double) 2)	);	/* 0.5 */
		
		System.out.println( (double) 1 / 2 );					/* 0.5 */
		
		System.out.println( (double) (1	/ 2) ); 				/* 0.0 */
		
	}

}
