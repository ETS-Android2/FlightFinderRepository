package static_variables;

// Common errors

public class Bank {
	private String branchName;
	
	public String getBranchName() {
		return this.branchName;
	}
	
	private static int nextAccountNumber = 0;
	
	public static String getInfo() {
		nextAccountNumber ++;
		
		return this.branchName + nextAccountNumber;
	}
}
