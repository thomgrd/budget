package budgetApp;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BudgetApp extends JFrame {

    private JPanel contentPane;
    private List<Budget> budgets;
    private List<Expense> expenses;

    public BudgetApp() {
        setTitle("Budget App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());

        JLabel balanceLabel = new JLabel("Total Balance: $0.00");
        balanceLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(balanceLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton budgetBtn = new JButton("Create Budget");
        budgetBtn.addActionListener(e -> addBudget());
        buttonPanel.add(budgetBtn);

        JButton expenseBtn = new JButton("Add Expense");
        expenseBtn.addActionListener(e -> addExpense());
        buttonPanel.add(expenseBtn);

        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        JPanel listPanel = new JPanel();
        listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.Y_AXIS));

        JScrollPane budgetScrollPane = new JScrollPane();
        budgetScrollPane.setBorder(BorderFactory.createTitledBorder("Budgets"));
        listPanel.add(budgetScrollPane);

        JList<Budget> budgetList = new JList<>();
        budgetScrollPane.setViewportView(budgetList);

        JScrollPane expenseScrollPane = new JScrollPane();
        expenseScrollPane.setBorder(BorderFactory.createTitledBorder("Expenses"));
        listPanel.add(expenseScrollPane);

        JList<Expense> expenseList = new JList<>();
        expenseScrollPane.setViewportView(expenseList);

        contentPane.add(listPanel, BorderLayout.CENTER);

        // Initialize lists
        budgets = new ArrayList<Budget>();
        expenses = new ArrayList<Expense>();
    }

    private void addBudget() {
        Budget budget = new Budget();
        budgets.add(budget);
        BudgetDialog dialog = new BudgetDialog(this, budget);
        dialog.setVisible(true);
    }

    private void addExpense() {
        Expense expense = new Expense();
        expenses.add(expense);
        ExpenseDialog dialog = new ExpenseDialog(this, expense);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                BudgetApp frame = new BudgetApp();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        });
    }
}

        