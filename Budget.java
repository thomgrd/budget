public class Budget {
    package budgetApp;

public class Budget {

    private String name;
    private double balance;

    public Budget(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void addExpense(double expense) {
        balance -= expense;
    }

    public void addBudget(double budget) {
        balance += budget;
    }
}

}
