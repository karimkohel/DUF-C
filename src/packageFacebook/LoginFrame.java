package packageFacebook;

import javax.swing.*;

public class LoginFrame extends IOFrame implements IOInterface {

    public LoginFrame(){
        super();

        this.usernameLabel.setBounds(550,200,80,25);
        this.usernameLabel.setForeground(this.textColor);
        this.add(this.usernameLabel);

        this.usernameTextField.setBounds(650,200,165,25);
        this.add(this.usernameTextField);

        this.passwordLabel.setBounds(550, 250, 80, 25);
        this.passwordLabel.setForeground(this.textColor);
        this.add(this.passwordLabel);

        this.passwordTextField.setBounds(650,250,165,25);
        this.add(this.passwordTextField);

        this.loginButton.setBounds(660, 300, 100, 25);
        this.loginButton.setFocusable(false);
        // lambda expressions are better than implementing interfaces
        this.loginButton.addActionListener(e -> this.loginButtonPress());
        this.add(this.loginButton);

        this.registerButton.setBounds(850, 500, 200, 25);
        this.registerButton.setText("Need an account? Register!");
        this.registerButton.setFocusable(false);
        this.registerButton.addActionListener(e -> this.registerButtonPress());
        this.add(this.registerButton);

        this.successLabel.setBounds(700,350,300,25);
        this.add(this.successLabel);

    }

    private void registerButtonPress() {
        this.goBack();
    }

    private void loginButtonPress(){
        // TODO
    }

    @Override
    public void showSuccessOrFailure(boolean success) {
        this.successLabel.setText(success ? "Username and Password correct!" : "Username or Password incorrect");
    }
}
