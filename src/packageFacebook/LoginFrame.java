package packageFacebook;

import javax.swing.*;

public class LoginFrame extends MainFrame {
    private final JButton loginButton;
    JButton registerButton;

    public LoginFrame(){
        super();
        loginButton = new JButton();
        this.loginButton.setBounds(10, 80, 80, 25);
        this.loginButton.setFocusable(false);
        this.loginButton.setText("Login");
        // lambda expressions are better than implementing interfaces
        this.loginButton.addActionListener(e -> this.loginButtonPress());
        this.add(loginButton);
    }

    private void loginButtonPress(){
        this.loginButton.setEnabled(false);
    }
}
