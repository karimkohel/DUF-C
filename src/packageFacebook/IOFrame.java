package packageFacebook;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class IOFrame extends MainFrame implements IOInterface{
    protected final JButton loginButton = new JButton("Login");
    protected final JButton registerButton = new JButton("Register");
    protected final JLabel successLabel = new JLabel("");

    protected JLabel usernameLabel = new JLabel("Username");
    protected JTextField usernameTextField = new JTextField(30);
    protected JLabel passwordLabel = new JLabel("Password");
    protected JPasswordField passwordTextField = new JPasswordField(30);

    private JLabel iconLabel = new JLabel();

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

    public IOFrame() {
        super();
        try{
            BufferedImage img = ImageIO.read(new File("src/fb-logo.png"));
            ImageIcon icon = new ImageIcon(img);
            this.iconLabel.setIcon(icon);
            this.setForeground(this.textColor);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        this.iconLabel.setBounds(650, 50, 100, 100);
        this.add(this.iconLabel);
    }
}
