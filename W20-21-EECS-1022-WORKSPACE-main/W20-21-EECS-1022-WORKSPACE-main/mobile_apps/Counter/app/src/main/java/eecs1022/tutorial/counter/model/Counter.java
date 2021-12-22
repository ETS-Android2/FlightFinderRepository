package eecs1022.tutorial.counter.model;

public class Counter {
    // Attributes
    private int value;

    // Constructor
    public Counter(int value) {
        this.value = value;
    }

    // Accessor
    public int getValue() {
        return this.value;
    }

    // Mutator
    public  void increment() {
        this.value ++;
    }

    public  void decrement() {
        this.value --;
    }
}
