package packageFacebook;

import javax.swing.*;

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

        usernameLabel.setBounds(600,200,80,25);
        this.add(usernameLabel);

        usernameTextField.setBounds(700,200,165,25);
        this.add(usernameTextField);

        passwordLabel.setBounds(600, 250, 80, 25);
        this.add(passwordLabel);

        passwordTextField.setBounds(700,250,165,25);
        this.add(passwordTextField);

        this.successLabel.setBounds(10,110,300,25);
        this.add(successLabel);

        this.loginButton.setBounds(10, 80, 80, 25);
        this.loginButton.setFocusable(false);
        // lambda expressions are better than implementing interfaces
        this.loginButton.addActionListener(e -> this.loginButtonPress());
        this.add(loginButton);

        this.setVisible(true);
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
