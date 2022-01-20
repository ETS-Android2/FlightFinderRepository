package model;

public class Bank {
	// Attributes
	private Client[] clients;
	private int noc;
	private String errorMsg;
	private boolean errorExist;
	
	
	// Constructor
	public Bank() {
		this.clients = new Client[6];
		this.errorExist = false;
	}
		
	// Accessor
	public String getStatus() {
		String result = "";
		result = "Accounts: {";
		if (this.errorExist) {
			result = this.errorMsg;
		}
		else {
			for (int i = 0; i < this.noc; i ++) {
				if (i < this.noc - 1) {
					result += this.clients[i].getName() + ": $" + String.format("%.2f", this.clients[i].getAmount()) + ", ";
				}
				else {
					result += this.clients[i].getName() + ": $" + String.format("%.2f", this.clients[i].getAmount());
				}
				
			}
			result += "}";
		}
		return result;
	}
	
	public String[] getStatement(String name) {
		String[] result = null;
		boolean found = false;
		Client temp = null;
		this.errorExist = false;
		
		for (int i = 0; i < this.noc; i ++ ) {
			if (this.clients[i].getName().equals(name)) {
				result = this.clients[i].getStatement();
				found = true;
				temp = this.clients[i];
				break;
			}
		}
		
		if (!found && temp == null) {
			this.errorMsg = "Error: From-Account " + name + " does not exist";
			this.errorExist = true;
		}
		return result;
	}
	
	// Mutator
	public void deposit(String name, double amount) {
		boolean found = false;
		Client temp = null;
		this.errorExist = false;
		
		for (int i = 0; i < this.noc; i ++ ) {
			if (this.clients[i].getName().equals(name) && amount > 0) {
				this.clients[i].deposit(amount);
				found = true;
				temp = this.clients[i];
				break;
			}
			else if (amount <= 0){
				this.errorExist = true;
				this.errorMsg = "Error: Non-Positive Amount";
				found = true;
			}
		}
		
		if (!found) {
			this.errorExist = true;
			this.errorMsg = "Error: To-Account " + name + " does not exist";
		}
		
		
	}
	
	public void withdraw(String name, double amount) {
		boolean found = false;
		Client temp = null;
		this.errorExist = false;
		
		for (int i = 0; i < this.noc; i ++ ) {
			if (this.clients[i].getName().equals(name) && amount > 0 && this.clients[i].getAmount() >= amount) {
				this.clients[i].withdraw(amount);
				found = true;
				temp = this.clients[i];
				break;
			}
			else if (amount <= 0) {
				this.errorExist = true;
				this.errorMsg = "Error: Non-Positive Amount";
				found = true;
			}
			else if (amount > 0 && amount > this.clients[i].getAmount()) {
				this.errorExist = true;
				this.errorMsg = "Error: Amount too large to withdraw";
				found = true;
			}
		}
		
		if (!found) {
			this.errorExist = true;
			this.errorMsg = "Error: From-Account " + name + " does not exist";
		}
	}
	
	public void transfer(String fromName, String toName, double amount ) {
		boolean foundFrom = false;
		boolean foundTo = false;
		Client temp = null;
		boolean negative = false;
		this.errorExist = false;
		
		for (int i = 0; i < this.noc; i ++ ) {
			if (this.clients[i].getName().equals(fromName) && amount > 0 && amount <= this.clients[i].getAmount()) {
				this.clients[i].withdraw(amount);
				foundFrom = true;
				temp = this.clients[i];
				break;
			}
			else if (foundFrom && amount <= 0) {
				this.errorExist = true;
				this.errorMsg = "Error: Non-Positive Amount";
				foundFrom = true;
			}
			else if (!foundFrom && amount > this.clients[i].getAmount()) {
				this.errorExist = true;
				this.errorMsg = "Error: Amount too large to transfer";
				foundFrom = true;
			}
			else if (this.clients[i].getName().equals(fromName)) {
				foundFrom = true;
			}
		}
		
		if (foundFrom) {
			for (int i = 0; i < this.noc; i ++ ) {
				if (this.clients[i].getName().equals(toName) && amount > 0) {
					this.clients[i].deposit(amount);
					foundTo = true;
					temp = this.clients[i];
					break;
				}
				else if (amount <= 0) {
					negative = true;
				}
			}
		}
		
		if (!foundFrom && !negative) {
			this.errorExist = true;
			this.errorMsg = "Error: From-Account " + fromName + " does not exist";
		}
		else if (!foundTo && foundFrom) {
			this.errorExist = true;
			this.errorMsg = "Error: To-Account " + toName + " does not exist";
		}
		else if (negative) {
			this.errorExist = true;
			this.errorMsg = "Error: Non-Positive Amount";
		}
	}
	
	public void addClient(String name, double amount) {
		this.errorExist = false;
		boolean clientExist = false;
		
		for (int i = 0; i < this.noc; i ++) {
			if (this.clients[i].getName().equals(name)) {
				clientExist = true;
			}
		}
		
		if (this.noc < 6) {
			if (amount > 0 && !clientExist) {
				this.clients[this.noc] = new Client(name, amount);
				this.noc ++;
				this.errorExist = false;
			}
			else if (clientExist) {
				this.errorExist = true;
				this.errorMsg = "Error: Client " + name + " already exists";
			}
			else {
				this.errorExist = true;
				this.errorMsg = "Error: Non-Positive Initial Balance";
			}
		}
		else {
			this.errorExist = true;
			this.errorMsg = "Error: Maximum Number of Accounts Reached";
		}
		
		
	}
	
	
}























