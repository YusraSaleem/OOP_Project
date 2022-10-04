import com.mysql.cj.log.Log;

import javax.swing.*;
import java.awt.*;


public class SplashScreen extends JFrame implements Runnable{
    SplashScreen () {
        setBounds(280,120,820,450);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(820,450,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel l1 = new JLabel(image);
        add(l1);

        setVisible(true);

        Thread t = new Thread(this);
        t.start();

    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            new Login();
            setVisible(false);
        }
        catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new SplashScreen();
    }

}
