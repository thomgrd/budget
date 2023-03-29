public class Expense {
    package budgetApp;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

public class Expense extends JPanel {
    
    private static final long serialVersionUID = 1L;
    
    private final Budget budget;
    private List<ExpenseEntry> expenses = new ArrayList<>();
    
    private final JPanel expensePanel = new JPanel();
    private final JPanel formPanel = new JPanel();
    private final JPanel tablePanel = new JPanel();
    
    private final JLabel expenseLabel = new JLabel("Add Expense");
    private final JLabel dateLabel = new JLabel("Date (dd/mm/yyyy)");
    private final JLabel descriptionLabel = new JLabel("Description");
    private final JLabel amountLabel = new JLabel("Amount");
    
    private final JFormattedTextField dateField = new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH));
    private final JFormattedTextField amountField = new JFormattedTextField(new DecimalFormat("#,##0.00"));
    private final JTable expenseTable = new JTable();
    
    private final JButton expenseButton = new JButton("Add Expense");
    private final JButton clearButton = new JButton("Clear Form");
    private final JButton backButton = new JButton("Back");
    
    public Expense(Budget budget) {
        this.budget = budget;
        setLayout(new BorderLayout());
        expensePanel.setLayout(new BoxLayout(expensePanel, BoxLayout.Y_AXIS));
        expensePanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        formPanel.setBorder(BorderFactory.createTitledBorder("Expense Form"));
        tablePanel.setLayout(new BoxLayout(tablePanel, BoxLayout.Y_AXIS));
        tablePanel.setBorder(BorderFactory.createTitledBorder("Expense List"));
        
        expenseLabel.setFont(new Font("Arial", Font.BOLD, 20));
        expenseLabel.setAlignmentX(CENTER_ALIGNMENT);
        expenseLabel.setBorder(new EmptyBorder(0, 0, 10, 0));
        expensePanel.add(expenseLabel);
        
        dateField.setColumns(10);
        dateField.setAlignmentX(CENTER_ALIGNMENT);
        dateField.setFormatterFactory(new DefaultFormatterFactory(new JFormattedTextField.AbstractFormatter() {
            private static final long serialVersionUID = 1L;

            @Override
            public Object stringToValue(String text) throws ParseException {
                return new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parseObject(text);
            }

            @Override
            public String valueToString(Object value) throws ParseException {
                return new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).format((Date) value);
            }
        }));
        formPanel.add(Box.createVerticalStrut(10));
        formPanel.add(dateLabel);
        formPanel.add(dateField);
        
        descriptionLabel.setAlignmentX(CENTER_ALIGNMENT);
        descriptionLabel.setBorder(new EmptyBorder(10, 0, 0, 0));
        formPanel.add(descriptionLabel);
        
        JTextArea descriptionArea = new JTextArea(3, 10);

}
