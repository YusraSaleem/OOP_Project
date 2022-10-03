import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewPackage extends JFrame implements ActionListener {

    JLabel nametxt,pkgtxt,pertxt,nictxt,photxt,pritxt;
    JButton backbtn4;
    String username;

    ViewPackage (String username) {
        this.username = username;
        setBounds(450,210,690,450);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel label = new JLabel("VIEW PACKAGE DETAILS");
        label.setBounds(70,0,250,20);
        label.setFont(new Font("Monospaced",Font.BOLD,18));
        add(label);

        JLabel uname = new JLabel("Username");
        uname.setBounds(25,50,140,20);
        uname.setFont(new Font("San Serif",Font.PLAIN,17));
        add(uname);

        nametxt = new JLabel();
        nametxt.setBounds(170,50,150,25);
        nametxt.setBackground(Color.WHITE);
        add(nametxt);

        JLabel pkg = new JLabel("Package");
        pkg.setBounds(25,90,140,20);
        pkg.setFont(new Font("San Serif",Font.PLAIN,17));
        add(pkg);

        pkgtxt = new JLabel();
        pkgtxt.setBounds(170,90,150,25);
        add(pkgtxt);

        JLabel person = new JLabel("Person");
        person.setBounds(25,130,140,20);
        person.setFont(new Font("San Serif",Font.PLAIN,17));
        add(person);

        pertxt = new JLabel();
        pertxt.setBounds(170,130,150,25);
        add(pertxt);

        JLabel niclab = new JLabel("NIC Number");
        niclab.setBounds(25,170,140,20);
        niclab.setFont(new Font("San Serif",Font.PLAIN,17));
        add(niclab);

        nictxt = new JLabel();
        nictxt.setBounds(170,170,150,25);
        add(nictxt);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(25,210,140,20);
        phone.setFont(new Font("San Serif",Font.PLAIN,17));
        add(phone);

        photxt = new JLabel();
        photxt.setBounds(170,210,150,25);
        add(photxt);

        JLabel price = new JLabel("Price");
        price.setBounds(25,250,140,20);
        price.setFont(new Font("San Serif",Font.PLAIN,17));
        add(price);

        pritxt = new JLabel();
        pritxt.setBounds(170,250,150,25);
        add(pritxt);


        backbtn4  =new JButton("Back");
        backbtn4.setForeground(Color.WHITE);
        backbtn4.setBackground(new Color(63, 141, 200));
        backbtn4.setBounds(210,340,100,25);
        backbtn4.addActionListener(this);
        add(backbtn4);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/viewpkg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel l4 = new JLabel(image);
        l4.setBounds(350,0,300,300);// if not using panel
        add(l4);

        try {
            Data dt3 = new Data();
            String query3 = "select * from bookpackages where username = '"+username+"'";
            ResultSet rs3 = dt3.stat.executeQuery(query3);

            while (rs3.next()) {
                nametxt.setText(rs3.getString("username"));
                pkgtxt.setText(rs3.getString("package"));
                pertxt.setText(rs3.getString("person"));
                nictxt.setText(rs3.getString("nicnumber"));
                photxt.setText(rs3.getString("phonenumber"));
                pritxt.setText(rs3.getString("price"));
            }

        }
        catch (Exception e1) {
            e1.printStackTrace();
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new ViewPackage("Aiman");
    }
}
