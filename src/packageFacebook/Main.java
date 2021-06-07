package packageFacebook;

import javax.swing.*;

public class Main {

    public static JFrame initFrame(){
        JFrame frame = new JFrame();
        frame.setSize(420, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    public static void main(String[] args) {
        JFrame frame = initFrame();
        LoginPage loginPage = new LoginPage(frame);
    }
}
