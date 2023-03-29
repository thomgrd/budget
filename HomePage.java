public class HomePage {
    package budgetApp;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class HomePage extends JFrame {

    private JPanel contentPane;

    public HomePage() {
        setTitle("Budget App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridBagLayout());

        JLabel titleLabel = new JLabel("Welcome to Budget App");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_titleLabel = new GridBagConstraints();
        gbc_titleLabel.fill = GridBagConstraints.HORIZONTAL;
        gbc_titleLabel.insets = new Insets(0, 0, 20, 0);
        gbc_titleLabel.gridwidth = 2;
        gbc_titleLabel.gridx = 0;
        gbc_titleLabel.gridy = 0;
        contentPane.add(titleLabel, gbc_titleLabel);

        JButton startButton = new JButton("Get Started");
        startButton.setFont(new Font("Arial", Font.PLAIN, 16));
        GridBagConstraints gbc_startButton = new GridBagConstraints();
        gbc_startButton.insets = new Insets(0, 0, 0, 5);
        gbc_startButton.gridx = 0;
        gbc_startButton.gridy = 1;
        contentPane.add(startButton, gbc_startButton);

        JButton aboutButton = new JButton("About");
        aboutButton.setFont(new Font("Arial", Font.PLAIN, 16));
        GridBagConstraints gbc_aboutButton = new GridBagConstraints();
        gbc_aboutButton.gridx = 1;
        gbc_aboutButton.gridy = 1;
        contentPane.add(aboutButton, gbc_aboutButton);

        JLabel footerLabel = new JLabel("Budget App © 2023 All rights reserved.");
        footerLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        footerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_footerLabel = new GridBagConstraints();
        gbc_footerLabel.fill = GridBagConstraints.HORIZONTAL;
        gbc_footerLabel.insets = new Insets(20, 0, 0, 0);
        gbc_footerLabel.gridwidth = 2;
        gbc_footerLabel.gridx = 0;
        gbc_footerLabel.gridy = 2;
        contentPane.add(footerLabel, gbc_footerLabel);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                HomePage frame = new HomePage();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

}
