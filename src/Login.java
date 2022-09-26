import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Login extends JFrame {

    Login () {

        setBounds(200,100,950,500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JPanel p1 = new JPanel();
        //p1.setBackground(new Color(13,152,186));
        p1.setBackground(Color.WHITE);
        p1.setBounds(0,0,350,500);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/Login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(350,500,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel l1 = new JLabel(image);
        p1.add(l1);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(450,25,450,400);
        add(p2);

        JLabel lab1 =new JLabel("Username");
        lab1.setBounds(80,50,100,25);
        lab1.setFont(new Font("SAN SERIF",Font.PLAIN,20));
        p2.add(lab1);

        JTextField txtf1 = new JTextField();
        txtf1.setBounds(80,90,300,30);
        txtf1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(txtf1);

        JLabel lab2 =new JLabel("Password");
        lab2.setBounds(80,150,100,25);
        lab2.setFont(new Font("SAN SERIF",Font.PLAIN,20));
        p2.add(lab2);

        JTextField txtf2 = new JTextField();
        txtf2.setBounds(80,190,300,30);
        txtf2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(txtf2);

        JButton btn1  = new JButton("Login");
        btn1.setBounds(80,290,130,30);
        btn1.setFont(new Font("SAN SERIF",Font.BOLD,14));
        btn1.setBackground(new Color(30,178,170));
        btn1.setForeground(Color.WHITE);
        btn1.setBorder(new LineBorder(new Color(13,152,186)));
        p2.add(btn1);

        JButton btn2  = new JButton("SignUp");
        btn2.setBounds(250,290,130,30);
        btn2.setFont(new Font("SAN SERIF",Font.BOLD,14));
        btn2.setBackground(new Color(30,178,170));
        btn2.setForeground(Color.WHITE);
        btn2.setBorder(new LineBorder(new Color(13,152,186)));
        p2.add(btn2);

        setVisible(true);
    }


    public static void main(String[] args) {
        new Login();
    }
}
