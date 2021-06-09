package packageFacebook;

import javax.swing.*;
import java.awt.*;

public abstract class MainFrame extends JFrame{

    protected Color textColor = new Color(0xFFFFFF);
    private static MainFrame backFrame;
    private static LoginFrame loginFrame;
    private static RegisterFrame registerFrame;
    private static HomeFrame homeFrame;
    private static MainFrame currentFrame;

    public static MainFrame getBackFrame() {
        return backFrame;
    }

    public static void setBackFrame(MainFrame backFrame) {
        backFrame.setVisible(false);
        MainFrame.backFrame = backFrame;
    }

    public static HomeFrame getHomeFrame() {
        return homeFrame;
    }

    public static void setHomeFrame(HomeFrame homeFrame) {
        MainFrame.homeFrame = homeFrame;
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
        currentFrame.setVisible(true);
        MainFrame.currentFrame = currentFrame;
    }

    public MainFrame() {
        this.setSize(1420, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x123451));
        this.setResizable(false);
        this.setLayout(null);
    }

    protected void goBack(){
        MainFrame tempFrame = MainFrame.getBackFrame();
        MainFrame.setBackFrame(MainFrame.getCurrentFrame());
        MainFrame.setCurrentFrame(MainFrame.getBackFrame());
    }

    public static void switchFrame(MainFrame frame){
        MainFrame.setBackFrame(MainFrame.currentFrame);
        MainFrame.setCurrentFrame(frame);
    }
    public static void startFrames(){
        MainFrame.setLoginFrame(new LoginFrame());
        MainFrame.setRegisterFrame(new RegisterFrame());
        MainFrame.setHomeFrame(new HomeFrame());
        MainFrame.setBackFrame(MainFrame.getLoginFrame());
        MainFrame.setCurrentFrame(MainFrame.getRegisterFrame());
    }
}
