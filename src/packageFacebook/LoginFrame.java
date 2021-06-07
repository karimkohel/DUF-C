package packageFacebook;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends MainFrame implements ShowOutputInterface{
    private final JButton loginButton = new JButton("Login");
    private final JButton registerButton = new JButton("Register");
    private final JLabel successLabel = new JLabel("");

    public LoginFrame(){
        super();
        JLabel usernameLabel = new JLabel("Username");
        JTextField usernameTextField = new JTextField(30);
        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordTextField = new JPasswordField(30);

        usernameLabel.setBounds(550,200,80,25);
        usernameLabel.setForeground(new Color(0xFFFFFF));
        this.add(usernameLabel);

        usernameTextField.setBounds(650,200,165,25);
        this.add(usernameTextField);

        passwordLabel.setBounds(550, 250, 80, 25);
        passwordLabel.setForeground(new Color(0xFFFFFF));
        this.add(passwordLabel);

        passwordTextField.setBounds(650,250,165,25);
        this.add(passwordTextField);

        this.loginButton.setBounds(660, 300, 100, 25);
        this.loginButton.setFocusable(false);
        // lambda expressions are better than implementing interfaces
        this.loginButton.addActionListener(e -> this.loginButtonPress());
        this.add(loginButton);

        this.registerButton.setBounds(660, 350, 100, 25);
        this.registerButton.setFocusable(false);
        this.registerButton.addActionListener(e -> this.registerButtonPress());
        this.add(registerButton);

        this.successLabel.setBounds(700,350,300,25);
        this.add(successLabel);

        this.setVisible(true);
    }

    private void registerButtonPress() {
        // TODO
    }

    private void loginButtonPress(){
        this.loginButton.setEnabled(false);
        this.registerButton.setEnabled(false);
        this.showSuccessOrFailure(true);
    }

    @Override
    public void showSuccessOrFailure(boolean success) {
        this.successLabel.setText(success ? "Username and Password correct!" : "Username or Password incorrect");
    }
}
