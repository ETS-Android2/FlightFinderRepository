package eecs1022.lab7.bank.model;

import java.util.Objects;

public class Client {

    // Attributes
    private String name;
    private double balance;
    private String[] statFullArray; // Array used to store statements of transactions of clients as String.
    private String[] statBackup; // Will be used to take non-null indices of statFullArray
    private int countStat;
    private Transaction transaction;
    /*--------------------------------------------------------------------*/

    // Constructor
    public Client(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.statFullArray = new String[11];
        this.countStat = 1;
    }

    /*--------------------------------------------------------------------*/


    // Accessor
    public String getStatus() {  // for the zero index to store the current balance and the client's name.
        String result = "";
        result = this.name + ": $" + String.format("%.2f",this.balance);
        this.statFullArray[0] = result; // Because we change the index 0 regularly, that's why we haven't used this.countStat.
        return result;
    }

    public String[] getStatement() {
        this.statBackup = new String[this.countStat];
        for (int i = 0; i < this.countStat; i ++ ){ // statBackup array is taking non-null indices of statFullArray
            String result = this.name + ": $" + String.format("%.2f",this.balance);
            this.statFullArray[0] = result; // for changing the first index
            this.statBackup[i] = this.statFullArray[i]; // for determining the subsequent indices
        }
        return this.statBackup;
    }

    // Helper methods Used to retrieve name and balance
    public String getName() {
        return this.name;
    }
    public double getBalance() {return  this.balance;}

    /*--------------------------------------------------------------------*/

    // Mutator
    public void deposit(double addAmount) { // Deposits money into the balance of the client
        this.balance += addAmount;
        this.transaction = new Transaction("DEPOSIT", addAmount);
        this.statFullArray[this.countStat] = this.transaction.getStatus();
        this.countStat ++;
    }

    public void withdraw(double removeAmount) { // Withdraws money from the balance of the client
        this.balance -= removeAmount;
        this.transaction = new Transaction("WITHDRAW", removeAmount);
        this.statFullArray[this.countStat] = this.transaction.getStatus();
        this.countStat ++;

    }
}















