import java.util.ArrayList;

public class Branch {
    // write code here
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.name = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String customerName, double initTransaction) {
        // Returns true if the customer was added successfully or false otherwise.
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        // Returns true if the customers transaction was added successfully or false otherwise.
        return false;
    }

    private ArrayList<Customer> findCustomer(String customerName) {
        // Return the Customer if they exist, null otherwise.
        return null;
    }
}