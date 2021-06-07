package packageFacebook;
import javax.swing.*;

public class LoginPage {
    JPanel panel = new JPanel();

    public LoginPage(JFrame frame) {


        panel.setLayout(null);
        frame.add(panel);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(10,20,80,25);
        panel.add(usernameLabel);

        JTextField usernameTextField = new JTextField(20);
        usernameTextField.setBounds(100,20,165,25);
        panel.add(usernameTextField);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordTextField = new JPasswordField(20);
        passwordTextField.setBounds(100,50,165,25);
        panel.add(passwordTextField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        frame.setVisible(true);
    }


}
