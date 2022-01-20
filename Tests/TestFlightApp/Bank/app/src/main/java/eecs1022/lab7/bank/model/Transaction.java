package eecs1022.lab7.bank.model;

public class Transaction {

    // Attributes
    private final String service;
    private final double amount;
    /*--------------------------------------------------------------------*/

    // Constructor
    public Transaction(String service, double amount) {
        this.service = service;
        this.amount = amount;
    }
    /*--------------------------------------------------------------------*/

    // Accessor
    public String getStatus() {
        String result = "";
        result = "Transaction " + this.service + ": $" + String.format("%.2f",this.amount) + "";
        return result;
    }
    /*--------------------------------------------------------------------*/

    // Mutator
        /*NA*/
}
