// WHILE ADDING IMAGE ON LOADING FRAME ALL THE OTHR TEXT ON IMAGE  image.add(...)

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable {
    Thread t1;
    JProgressBar pgb;
    String uname;

    public void run () {
        try {
            for (int i=1;i<=101;i++){
                int max = pgb.getMaximum();
                int value = pgb.getValue();

                if (value<max) {
                    pgb.setValue(pgb.getValue()+1);
                }
                else {
                    setVisible(false);
                    new Dashboard(uname);
                }
                Thread.sleep(50);
            }
        }
        catch (Exception e1) {
            e1.printStackTrace();

        }
    }
    Loading (String uname) {
        t1 = new Thread(this);
        this.uname = uname;

        setBounds(400,130,600,450);
        setLayout(null);
        //getContentPane().setBackground(Color.WHITE);

        //SET IT AS A BACKGROUND
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/loading.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(600,450,Image.SCALE_SMOOTH);
//        ImageIcon image = new ImageIcon(i2);
//        //JLabel l1 = new JLabel(image);
//        JLabel l1 = new JLabel();
//        l1.setIcon(image);
//        l1.setBounds(0,0,600,450);
//        add(l1);

        JLabel title = new JLabel("Travel Management System");
        title.setForeground(new Color(66,178,189));
        title.setBounds(100,10,550,40);
        title.setFont(new Font("SAN SERIF",Font.BOLD,28));
        add(title);

        JLabel welcome = new JLabel("Welcome "+uname);
        welcome.setBounds(180,100,300,35);
        welcome.setForeground(new Color(66,178,189));
       // welcome.setForeground(Color.WHITE);
        welcome.setFont(new Font("SAN SERIF",Font.ITALIC,32));
        add(welcome);

        pgb = new JProgressBar();
        pgb.setBounds(150,300,300,35);
        pgb.setStringPainted(true);
        add(pgb);

        JLabel wait = new JLabel("Loading please wait...");
        wait.setBounds(220,350,300,35);
        wait.setForeground(new Color(236, 87, 146, 255));
        wait.setFont(new Font("SAN SERIF",Font.BOLD,17));
        add(wait);

        t1.start();

        setVisible(true);

    }

    public static void main(String[] args) {
        new Loading("");
    }
}
