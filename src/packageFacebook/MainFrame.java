package packageFacebook;

import javax.swing.*;
import java.awt.*;

public abstract class MainFrame extends JFrame{

    protected Color textColor = new Color(0xFFFFFF);

    public MainFrame() {
        this.setSize(1420, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x123451));
        this.setLayout(null);
    }
}
