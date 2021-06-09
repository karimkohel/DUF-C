package packageFacebook;

import javax.swing.*;
import java.awt.*;

public class HomeFrame extends MainFrame{

    private JLabel titleLabel = new JLabel("Welcome to Facebook");
    private JLabel statusLabel = new JLabel();
    String  authedUser = "Admin";

    public HomeFrame() {
        super();
        this.titleLabel.setBounds(400, 150, 500, 100);
        this.titleLabel.setForeground(this.textColor);
        this.titleLabel.setFont(new Font("Serif", Font.BOLD, 26));
        this.add(this.titleLabel);

        this.statusLabel.setText("Logged in as : " + this.authedUser);
        this.statusLabel.setForeground(this.textColor);
        this.statusLabel.setFont(new Font("Serif", Font.BOLD, 22));
        this.statusLabel.setBounds(400, 250, 500, 50);
        this.add(this.statusLabel);

    }

    public String getAuthedUser() {
        return authedUser;
    }

    public void setAuthedUser(User authedUser) {
        this.authedUser = authedUser.getUsername();
        this.statusLabel.setText("Logged in as : " + this.authedUser);
    }
}
