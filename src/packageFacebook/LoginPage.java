package packageFacebook;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LoginPage implements ActionListener {
    private JLabel usernameLabel = new JLabel("Username");
    private JTextField usernameTextField = new JTextField(20);
    private JLabel passwordLabel = new JLabel("Password");
    private JPasswordField passwordTextField = new JPasswordField(20);
    private JButton loginButton = new JButton("Login");
    private JLabel successLabel = new JLabel("");

    public void setSuccessLabel(String msg) {
        this.successLabel.setText(msg);
    }

    public LoginPage(JFrame frame) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        this.usernameLabel.setBounds(10,20,80,25);
        panel.add(usernameLabel);

        this.usernameTextField.setBounds(100,20,165,25);
        panel.add(usernameTextField);

        this.passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        this.passwordTextField.setBounds(100,50,165,25);
        panel.add(passwordTextField);

        this.successLabel.setBounds(10,110,300,25);

        this.loginButton.setBounds(10, 80, 80, 25);
        this.loginButton.addActionListener(this);
        panel.add(loginButton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameTextField.getText();
        char[] password = passwordTextField.getPassword();

        // hash this password
        // call passwords from file
        // compare passwords
        // display msg or move to next page
        System.out.println("Username : " + username + "\nPassword : " + Arrays.toString(password));
    }
}
