package packageFacebook;

import javax.swing.*;
import java.awt.*;

public class IOFrame extends MainFrame implements IOInterface{
    protected final JButton loginButton = new JButton("Login");
    protected final JButton registerButton = new JButton("Register");
    protected final JLabel successLabel = new JLabel("");

    protected JLabel usernameLabel = new JLabel("Username");
    protected JTextField usernameTextField = new JTextField(30);
    protected JLabel passwordLabel = new JLabel("Password");
    protected JPasswordField passwordTextField = new JPasswordField(30);

    // TODO Main logo

    @Override
    protected void goBack() {
        MainFrame.switchFrame(MainFrame.getBackFrame());
    }

    @Override
    public void showSuccessOrFailure(boolean success) {
        if(success){
            this.successLabel.setForeground(new Color(0x00BC00));
            this.successLabel.setText("Successfully");
        }
        else{
            this.successLabel.setForeground(new Color(0xC10000));
            this.successLabel.setText("Invalid Data, Try again");
        }
    }
}
