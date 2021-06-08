package packageFacebook;

public class RegisterFrame extends MainFrame implements IOInterface{
    public RegisterFrame() {
        super();

        this.usernameLabel.setBounds(550,200,80,25);
        this.usernameLabel.setForeground(textColor);
        this.add(usernameLabel);

        this.usernameTextField.setBounds(650,200,165,25);
        this.add(usernameTextField);

        this.passwordLabel.setBounds(550, 250, 80, 25);
        this.passwordLabel.setForeground(textColor);
        this.add(passwordLabel);

        this.passwordTextField.setBounds(650,250,165,25);
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
    }

    private void loginButtonPress() {
    }

    @Override
    public void showSuccessOrFailure(boolean success) {

    }
}
