package budgetApp;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BudgetApp extends JFrame {

    private JPanel contentPane;
    private JLabel balanceLabel;
    private JTextField balanceField;
    private JButton budgetBtn, expenseBtn;
    private JLabel expenseLabel;
    private JTextField expenseField;
    private JLabel diffLabel;
    private List<Expense> expenses = new ArrayList<>();

    public BudgetApp() {
        setTitle("Budget App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridBagLayout());

        JLabel titleLabel = new JLabel("Budget App");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_titleLabel = new GridBagConstraints();
        gbc_titleLabel.fill = GridBagConstraints.HORIZONTAL;
        gbc_titleLabel.insets = new Insets(0, 0, 20, 0);
        gbc_titleLabel.gridwidth = 2;
        gbc_titleLabel.gridx = 0;
        gbc_titleLabel.gridy = 0;
        contentPane.add(titleLabel, gbc_titleLabel);

        JLabel balanceLabel = new JLabel("Current Balance");
        balanceLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        GridBagConstraints gbc_balanceLabel = new GridBagConstraints();
        gbc_balanceLabel.insets = new Insets(0, 0, 10, 0);
        gbc_balanceLabel.gridx = 0;
        gbc_balanceLabel.gridy = 1;
        contentPane.add(balanceLabel, gbc_balanceLabel);

        balanceField = new JTextField();
        balanceField.setFont(new Font("Arial", Font.PLAIN, 16));
        GridBagConstraints gbc_balanceField = new GridBagConstraints();
        gbc_balanceField.insets = new Insets(0, 0, 10, 0);
        gbc_balanceField.fill = GridBagConstraints.HORIZONTAL;
        gbc_balanceField.gridx = 1;
        gbc_balanceField.gridy = 1;
        contentPane.add(balanceField, gbc_balanceField);
        balanceField.setColumns(10);

        budgetBtn = new JButton("Add to Budget");
        budgetBtn.setFont(new Font("Arial", Font.PLAIN, 16));
        budgetBtn.addActionListener(e -> addBudget());
        GridBagConstraints gbc_budgetBtn = new GridBagConstraints();
        gbc_budgetBtn.insets = new Insets(0, 0, 10, 0);
        gbc_budgetBtn.gridx = 2;
        gbc_budgetBtn.gridy = 1;
        contentPane.add(budgetBtn, gbc_budgetBtn);

        expenseLabel = new JLabel("Expense Amount");
        expenseLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        GridBagConstraints gbc_expenseLabel = new GridBagConstraints();
        gbc_expenseLabel.insets = new Insets(0, 0, 10, 0);
        gbc_expenseLabel.gridx = 0;
        gbc_expenseLabel.gridy = 2;
        contentPane.add(expenseLabel, gbc_expenseLabel);

        expenseField = new JTextField();
        expenseField.setFont(new Font("Arial", Font.PLAIN, 16));
        GridBagConstraints gbc_expenseField = new GridBagConstraints();
        gbc_expenseField.insets = new Insets(0, 0, 10, 0);
        gbc_expenseField.fill = GridBagConstraints.HORIZONTAL;
        gbc_expenseField.gridx = 1;
        gbc_expenseField.gridy = 2;
        contentPane.add(expenseField, gbc_expenseField);
        expenseField.setColumns(10);

    }
}
