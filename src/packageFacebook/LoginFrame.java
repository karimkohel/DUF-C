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
        MainFrame.switchFrame(MainFrame.getRegisterFrame());
    }

    private void loginButtonPress(){
        try{
            User found;
            for(User user : User.users){
                if(this.usernameTextField.getText().equals(user.getUsername())){
                    if(User.hashPassword(this.passwordTextField.getText()).equals(user.getPassword())){
                        this.showSuccessOrFailure(true);
                        MainFrame.switchFrame(MainFrame.getHomeFrame());
                        System.out.println("AUTHED");
                    }
                    else{
                        this.showSuccessOrFailure(false);
                    }
                }
                else {
                    this.showSuccessOrFailure(false);
                }
            }
        }
        catch (Exception e){
            System.out.println("error wee");
        }
    }
}
