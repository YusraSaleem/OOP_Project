import javax.swing.*;
import java.awt.*;


public class SplashScreen extends JFrame {
    SplashScreen () {
        setBounds(280,120,820,450);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(820,450,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel l1 = new JLabel(image);
        add(l1);

        setVisible(true);
    }

    public static void main(String[] args) {
       new SplashScreen();
    }

}
