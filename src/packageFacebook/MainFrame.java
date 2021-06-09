package packageFacebook;

import javax.swing.*;
import java.awt.*;

public abstract class MainFrame extends JFrame{

    protected static Color textColor = new Color(0xFFFFFF);
    private static MainFrame backFrame;
    private static LoginFrame loginFrame;
    private static RegisterFrame registerFrame;
    private static MainFrame currentFrame;

    public static MainFrame getBackFrame() {
        return backFrame;
    }

    public static void setBackFrame(MainFrame backFrame) {
        MainFrame.backFrame = backFrame;
    }

    public static LoginFrame getLoginFrame() {
        return loginFrame;
    }

    public static void setLoginFrame(LoginFrame loginFrame) {
        MainFrame.loginFrame = loginFrame;
    }

    public static RegisterFrame getRegisterFrame() {
        return registerFrame;
    }

    public static void setRegisterFrame(RegisterFrame registerFrame) {
        MainFrame.registerFrame = registerFrame;
    }

    public static MainFrame getCurrentFrame() {
        return currentFrame;
    }

    public static void setCurrentFrame(MainFrame currentFrame) {
        MainFrame.currentFrame = currentFrame;
        currentFrame.setVisible(true);
    }

    public MainFrame() {
        this.setSize(1420, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x123451));
        this.setResizable(false);
        this.setLayout(null);
        MainFrame.loginFrame = new LoginFrame();
        MainFrame.registerFrame = new RegisterFrame();
    }

    protected void goBack(){
        MainFrame.currentFrame.setVisible(false);
        MainFrame.backFrame.setVisible(true);
        MainFrame.setCurrentFrame(MainFrame.backFrame);
    }

    public static void switchFrame(MainFrame frame){
        MainFrame.setBackFrame(MainFrame.currentFrame);
        MainFrame.setCurrentFrame(frame);
    }
}
