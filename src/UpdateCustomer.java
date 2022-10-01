import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCustomer extends JFrame implements ActionListener{
    JTextField nametxt;
    JButton updatebtn,backbtn3;
    JTextField nictxt,contxt,addtxt,photxt,emailtxt,gendertxt;
    UpdateCustomer (String username) {
        setBounds(450,210,690,450);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel label = new JLabel("UPDATE USER DETAILS");
        label.setBounds(70,0,250,20);
        label.setFont(new Font("Monospaced",Font.BOLD,18));
        add(label);

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
        add(nictxt);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(25,120,140,20);
        gender.setFont(new Font("San Serif",Font.PLAIN,17));
        add(gender);

        gendertxt = new JTextField();
        gendertxt.setBounds(170,120,150,25);
        add(gendertxt);

        JLabel country = new JLabel("Country");
        country.setBounds(25,160,140,20);
        country.setFont(new Font("San Serif",Font.PLAIN,17));
        add(country);

        contxt = new JTextField();
        contxt.setBounds(170,160,150,25);
        add(contxt);

        JLabel addr = new JLabel("Address");
        addr.setBounds(25,200,140,20);
        addr.setFont(new Font("San Serif",Font.PLAIN,17));
        add(addr);

        addtxt = new JTextField();
        addtxt.setBounds(170,200,150,25);
        add(addtxt);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(25,240,140,20);
        phone.setFont(new Font("San Serif",Font.PLAIN,17));
        add(phone);

        photxt = new JTextField();
        photxt.setBounds(170,240,150,25);
        add(photxt);

        JLabel email = new JLabel("Email");
        email.setBounds(25,280,140,20);
        email.setFont(new Font("San Serif",Font.PLAIN,17));
        add(email);

        emailtxt = new JTextField();
        emailtxt.setBounds(170,280,150,25);
        add(emailtxt);

        updatebtn  =new JButton("Update");
        updatebtn.setForeground(Color.WHITE);
        updatebtn.setBackground(new Color(63, 141, 200));
        updatebtn.setBounds(70,340,100,25);
        updatebtn.addActionListener(this);
        add(updatebtn);

        backbtn3  =new JButton("Back");
        backbtn3.setForeground(Color.WHITE);
        backbtn3.setBackground(new Color(63, 141, 200));
        backbtn3.setBounds(210,340,100,25);
        backbtn3.addActionListener(this);
        add(backbtn3);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/User.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel l4 = new JLabel(image);
        l4.setBounds(350,30,300,300);// if not using panel
        add(l4);

        try {
            Data dt2 = new Data();
            ResultSet rs2 = dt2.stat.executeQuery("select * from customer where username = '"+username+"'");
            while (rs2.next()) {
                nametxt.setText(rs2.getString("username"));
                nametxt.setEditable(false);
                nictxt.setText(rs2.getString("nicnumber"));
                gendertxt.setText(rs2.getString("gender"));
                contxt.setText(rs2.getString("country"));
                addtxt.setText(rs2.getString("address"));
                photxt.setText(rs2.getString("phonenumber"));
                emailtxt.setText(rs2.getString("email"));

            }
        }
        catch (Exception e1) {
            e1.printStackTrace();
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == updatebtn) {
            String username = nametxt.getText();
            String num = nictxt.getText();
            String genderr = gendertxt.getText();
            String con = contxt.getText();
            String address = addtxt.getText();
            String phonenum = photxt.getText();
            String emailt = emailtxt.getText();
            String query2 = "update customer set username= '" + username + "', nicnumber= '" + num + "', gender ='" + genderr +"',country='" + con + "',address='" + address + "',phonenumber='" + phonenum + "',email='" + emailt +"'";
            try{
                Data dt3 = new Data();
                dt3.stat.executeUpdate(query2);

                JOptionPane.showMessageDialog(null, "Customer details updated successfully");
                setVisible(false);
            }
            catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        else if (e.getSource() == backbtn3) {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new UpdateCustomer("Aiman");
    }
}