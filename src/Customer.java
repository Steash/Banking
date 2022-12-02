import java.util.ArrayList;

public class Customer {
    // write code here
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double initTransaction) {
        this.name = customerName;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public void addTransaction(double transaction) {

    }
}