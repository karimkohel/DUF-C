package packageFacebook;

import javax.swing.*;

public class IOFrame extends MainFrame{
    protected final JButton loginButton = new JButton("Login");
    protected final JButton registerButton = new JButton("Register");
    protected final JLabel successLabel = new JLabel("");

    protected JLabel usernameLabel = new JLabel("Username");
    protected JTextField usernameTextField = new JTextField(30);
    protected JLabel passwordLabel = new JLabel("Password");
    protected JPasswordField passwordTextField = new JPasswordField(30);
}
