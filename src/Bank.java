import java.util.ArrayList;

public class Bank {
    // write code here
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        // It returns true if the branch was added successfully or false otherwise.
        try {
            branches.add(new Branch(branchName));
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initTransaction ) {
        // It returns true if the customer was added successfully or false otherwise.
        try {
            // Grab branch object
            Branch branch = this.findBranch(branchName);
            // Create new customer with branch function
            branch.newCustomer(customerName, initTransaction);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        // It returns true if the customers transaction was added successfully or false otherwise.
        try {
            // Grab branch object
            Branch branch = this.findBranch(branchName);
            // Add customer transaction with branch function
            branch.addCustomerTransaction(customerName, transaction)
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Branch findBranch(String branchName) {
        // Return the Branch if it exists or null otherwise.
        try {
            // Grab branch object
            Branch branch = this.findBranch(branchName);
            return branch;
        } catch (Exception e){
            return null;
        }
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        // Return true if the branch exists or false otherwise. This method prints out a list of customers.
        Branch branch = this.findBranch(branchName);
        if (printTransactions) {
            ArrayList<Customer> customers = branch.getCustomers();
            for (Customer customer : customers) {
                System.out.println(customer.getName());
            }
        }
        return false;
    }
}