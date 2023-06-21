import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

// provides a way to create new graph pop-ups
public class GUIlogin extends JFrame implements ActionListener {

    private JFrame frame;
    private JButton loginButton;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public GUIlogin() {
        // Set title
        frame = new JFrame("Login Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set size of JFrame
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Create username label and field
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(15);

        // Create password label and field
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);

        // Create login button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        // Add components to the frame
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);

        // Make the frame visible
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            // Validate the username and password
            if (validateLogin(username, password)) {
                JOptionPane.showMessageDialog(frame, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid username or password!");
            }
        }
    }

    private boolean validateLogin(String username, String password) {
        try (Scanner scanner = new Scanner(GUIlogin.class.getResourceAsStream("users.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String storedUsername = parts[0];
                String storedPassword = parts[1];

                if (storedUsername.equals(username) && storedPassword.equals(password)) {
                    return true; // Valid login

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; //invalid login
    }


    public static void main(String[] args) {


    }

    public static class Basic extends JPanel {

        private JFrame frame;

        public Basic(int width, int height) {
            // initialise the window
            frame = new JFrame("Circular Flow of Income");
            frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            frame.setSize(300, 300);

            // create the canvas that will hold the actual graphics
            frame.getContentPane().add(this);

            // display the frame AFTER adding the panel to prevent drawing glitches
            frame.setVisible(true);
        }

        @Override
        public void paintComponent(Graphics g) {

        }
    }
}
