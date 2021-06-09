package packageFacebook;

import javax.swing.*;
import java.awt.*;

public class RegisterFrame extends IOFrame implements IOInterface{

    JCheckBox adminCheckBox = new JCheckBox("Admin");

    JLabel emailLabel = new JLabel("Email");
    JTextField emailTextField = new JTextField(30);

    JLabel  ageLabel= new JLabel("Age");
    JTextField ageTextField = new JTextField(30);

    public RegisterFrame() {
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


        this.adminCheckBox.setBounds(850, 200, 100,25);
        this.adminCheckBox.setForeground(this.textColor);
        this.adminCheckBox.setBackground(new Color(0x123451));
        this.add(this.adminCheckBox);

        this.emailLabel.setBounds(550, 300, 80, 25);
        this.emailLabel.setForeground(this.textColor);
        this.add(this.emailLabel);

        this.emailTextField.setBounds(650, 300, 165, 25);
        this.add(emailTextField);

        this.ageLabel.setBounds(550, 350, 80, 25);
        this.ageLabel.setForeground(this.textColor);
        this.add(this.ageLabel);

        this.ageTextField.setBounds(650, 350, 165, 25);
        this.add(this.ageTextField);

        this.loginButton.setBounds(850, 500, 200, 25);
        this.loginButton.setText("Have an account? Login!");
        this.loginButton.setFocusable(false);
        // lambda expressions are better than implementing interfaces
        this.loginButton.addActionListener(e -> this.loginButtonPress());
        this.add(this.loginButton);

        this.registerButton.setBounds(660, 400, 100, 25);
        this.registerButton.setFocusable(false);
        this.registerButton.addActionListener(e -> this.registerButtonPress());
        this.add(this.registerButton);

        this.successLabel.setBounds(700,350,300,25);
        this.add(this.successLabel);

        this.setVisible(true);
    }

    private void registerButtonPress() {
        // TODO
    }

    private void loginButtonPress() {
        // TODO
    }

    @Override
    public void showSuccessOrFailure(boolean success) {
        // TODO
    }
}
