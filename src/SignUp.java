// CAN ADD EMAIL OPTION INSTEAD OF CONFIRM PASSWORD
// CONFIRM PASSWORD NOT WORKING
// HAVE NOT PUT FORGET PASSWORD PAGE
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener {
    JButton btn2;
    JButton btn1;
    JTextField txtf1;
    JTextField txtf2;
    JTextField txtf3;
    SignUp () {

        setBounds(220,130,900,450);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JPanel p1 = new JPanel();
        p1.setBounds(0,0,500,450);
        p1.setBackground(new Color(0,200,180));
        p1.setLayout(null);
        add(p1);

        JLabel lab1 =new JLabel("Username");
        lab1.setBounds(40,30,100,25);
        lab1.setFont(new Font("SAN SERIF",Font.BOLD,18));
        p1.add(lab1);

        txtf1 = new JTextField();
        txtf1.setBounds(180,60,280,30);
        txtf1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(txtf1);

        JLabel lab2 =new JLabel("Password");
        lab2.setBounds(40,120,100,25);
        lab2.setFont(new Font("SAN SERIF",Font.BOLD,18));
        p1.add(lab2);

        txtf2 = new JTextField();
        txtf2.setBounds(180,150,280,30);
        txtf2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(txtf2);

        JLabel lab3 =new JLabel("Confirm Password");
        lab3.setBounds(40,210,200,25);
        lab3.setFont(new Font("SAN SERIF",Font.BOLD,18));
        p1.add(lab3);

        txtf3 = new JTextField();
        txtf3.setBounds(180,250,280,30);
        txtf3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(txtf3);

        btn1  = new JButton("Create");
        btn1.setBounds(80,330,130,30);
        btn1.setFont(new Font("SAN SERIF",Font.BOLD,14));
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(new Color(30,178,170));
        btn1.addActionListener(this);
        p1.add(btn1);

        btn2  = new JButton("Back");
        btn2.setBounds(280,330,130,30);
        btn2.setFont(new Font("SAN SERIF",Font.BOLD,14));
        btn2.setBackground(Color.WHITE);
        btn2.setForeground(new Color(30,178,170));
        btn2.addActionListener(this);
        p1.add(btn2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/Signup.jpg"));
        Image i2 = i1.getImage().getScaledInstance(350,500,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel l4 = new JLabel(image);
        l4.setBounds(520,30,350,400);// if not using panel
        add(l4);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn1) {

//                if (txtf2.getText() == txtf3.getText()) {
                    String username = txtf1.getText();
                    String password = txtf2.getText();
                    String conpassword = txtf3.getText();

                    String query = "insert into account values('" + username + "','" + password + "','" + conpassword + "')";
                    try {
                        Data dt = new Data();
                        dt.stat.executeUpdate(query);

                        JOptionPane.showMessageDialog(null, "Account created successfully");

                        setVisible(false);
                        new Login();

                    } catch (Exception e1) {
                        e1.printStackTrace();

                    }
//                } else {
//                    JOptionPane.showMessageDialog(null, "Fill Again", "Password Incorrect", JOptionPane.ERROR_MESSAGE);
//                    setVisible(false);
//                    new SignUp();
//                }
        }
        else if (e.getSource() == btn2) {
            new Login();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }

}
