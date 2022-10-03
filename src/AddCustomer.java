// !!! ADDING EMAIL HERE AS WELL. REMOVE FROM HERE IF ADDING IT IN SIGNUP FRAME !!!

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddCustomer extends JFrame implements ActionListener {
    ButtonGroup btng;
    JTextField nametxt;
    JButton addbtn;
    JButton backbtn1;
    JTextField nictxt;
    JRadioButton male;
    JRadioButton female;
    JTextField contxt;
    JTextField addtxt;
    JTextField photxt;
    JTextField emailtxt;

    AddCustomer (String username) {
        setBounds(450,210,690,450);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel uname = new JLabel("Username");
        uname.setBounds(25,40,140,20);
        uname.setFont(new Font("San Serif",Font.PLAIN,17));
        add(uname);

        nametxt = new JTextField();
        nametxt.setBounds(170,40,150,25);
        nametxt.setBackground(Color.WHITE);
        add(nametxt);

        JLabel id = new JLabel("NIC Number");
        id.setBounds(25,80,140,20);
        id.setFont(new Font("San Serif",Font.PLAIN,17));
        add(id);

        nictxt = new JTextField();
        nictxt.setBounds(170,80,150,25);
        //nictxt.setBorder(BorderFactory.createEmptyBorder());
        add(nictxt);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(25,120,140,20);
        gender.setFont(new Font("San Serif",Font.PLAIN,17));
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(170,120,60,25);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(250,120,70,25);
        female.setBackground(Color.WHITE);
        add(female);

        btng = new ButtonGroup();
        btng.add(male);
        btng.add(female);

        JLabel country = new JLabel("Country");
        country.setBounds(25,160,140,20);
        country.setFont(new Font("San Serif",Font.PLAIN,17));
        add(country);

         contxt = new JTextField();
        contxt.setBounds(170,160,150,25);
        //nictxt.setBorder(BorderFactory.createEmptyBorder());
        add(contxt);

        JLabel addr = new JLabel("Address");
        addr.setBounds(25,200,140,20);
        addr.setFont(new Font("San Serif",Font.PLAIN,17));
        add(addr);

        addtxt = new JTextField();
        addtxt.setBounds(170,200,150,25);
        //nictxt.setBorder(BorderFactory.createEmptyBorder());
        add(addtxt);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(25,240,140,20);
        phone.setFont(new Font("San Serif",Font.PLAIN,17));
        add(phone);

        photxt = new JTextField();
        photxt.setBounds(170,240,150,25);
        //nictxt.setBorder(BorderFactory.createEmptyBorder());
        add(photxt);

        JLabel email = new JLabel("Email");
        email.setBounds(25,280,140,20);
        email.setFont(new Font("San Serif",Font.PLAIN,17));
        add(email);

        emailtxt = new JTextField();
        emailtxt.setBounds(170,280,150,25);
        //nictxt.setBorder(BorderFactory.createEmptyBorder());
        add(emailtxt);

        addbtn  =new JButton("Add");
        addbtn.setForeground(Color.WHITE);
        addbtn.setBackground(new Color(63, 141, 200));
        addbtn.setBounds(70,340,100,25);
        addbtn.addActionListener(this);
        add(addbtn);

        backbtn1  =new JButton("Back");
        backbtn1.setForeground(Color.WHITE);
        backbtn1.setBackground(new Color(63, 141, 200));
        backbtn1.setBounds(210,340,100,25);
        backbtn1.addActionListener(this);
        add(backbtn1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/add details.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel l4 = new JLabel(image);
        l4.setBounds(325,30,345,300);// if not using panel
        add(l4);

        try {
            Data dt2 = new Data();
            ResultSet rs2 = dt2.stat.executeQuery("select * from account where username = '"+username+"'");
            while (rs2.next()) {
                nametxt.setText(rs2.getString("username"));
                nametxt.setEditable(false);
            }
        }
        catch (Exception e1) {
            e1.printStackTrace();
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addbtn) {
            String username = nametxt.getText();
            String num = nictxt.getText();
            String genderr ;
            if (male.isSelected()){
                genderr = "Male";
            }
            else {
                genderr = "Female";
            }
            String con = contxt.getText();
            String address = addtxt.getText();
            String phonenum = photxt.getText();
            String emailt = emailtxt.getText();
            String query2 = "insert into customer values('" + username + "','" + num + "','" + genderr +"','" + con + "','" + address + "','" + phonenum + "','" + emailt +"')";
            try{
                Data dt3 = new Data();
                dt3.stat.executeUpdate(query2);

                JOptionPane.showMessageDialog(null, "Customer details added successfully");
                setVisible(false);
            }
            catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        else if (e.getSource() == backbtn1) {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new AddCustomer("Aiman");
    }
}
