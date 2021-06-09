package packageFacebook;

import javax.swing.*;
import java.awt.*;
import java.util.InvalidPropertiesFormatException;

public class RegisterFrame extends IOFrame{

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

        this.successLabel.setBounds(900,350,300,25);
        this.add(this.successLabel);
    }

    private void registerButtonPress() {
        try{
            if(this.adminCheckBox.isSelected()){
                Admin tempUser = new Admin(
                        this.usernameTextField.getText(),
                        this.passwordTextField.getText(),
                        this.emailTextField.getText(),
                        Integer.parseInt(this.ageTextField.getText())
                );
                User.users.add(tempUser);
            }
            else{
                Client tempUser = new Client(
                        this.usernameTextField.getText(),
                        this.passwordTextField.getText(),
                        this.emailTextField.getText(),
                        Integer.parseInt(this.ageTextField.getText())
                );
                User.users.add(tempUser);
            }
            this.showSuccessOrFailure(true);
            System.out.println(User.users.get(User.users.size() - 1));
            this.clearInputs();
            this.loginButtonPress();
        }
        catch (Exception e){
            this.showSuccessOrFailure(false);
        }
    }

    private void loginButtonPress() {
        this.clearInputs();
        MainFrame.switchFrame(MainFrame.getLoginFrame());
    }
    private void clearInputs(){
        this.usernameTextField.setText("");
        this.passwordTextField.setText("");
        this.ageTextField.setText("");
        this.emailTextField.setText("");
    }
}
