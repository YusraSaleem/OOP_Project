import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewCustomer extends JFrame implements ActionListener {
JButton backbtn2;
    ViewCustomer (String username) {

        setBounds(430,210,730,450);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,30,150,25);
        add(lblusername);

        JLabel cusname = new JLabel("");
        cusname.setBounds(130,30,150,25);
        add(cusname);

        JLabel lblnicnum = new JLabel("NIC Number");
        lblnicnum.setBounds(30,80,150,25);
        add(lblnicnum);

        JLabel cusnic = new JLabel("");
        cusnic.setBounds(130,80,150,25);
        add(cusnic);

        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30,130,150,25);
        add(lblgender);

        JLabel cusgender = new JLabel("");
        cusgender.setBounds(130,130,150,25);
        add(cusgender);

        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(30,180,150,25);
        add(lblcountry);

        JLabel cuscountry = new JLabel("");
        cuscountry.setBounds(130,180,150,25);
        add(cuscountry);

        JLabel lbladd = new JLabel("Address");
        lbladd.setBounds(400,30,150,25);
        add(lbladd);

        JLabel cusadd = new JLabel("");
        cusadd.setBounds(500,30,150,25);
        add(cusadd);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(400,80,150,25);
        add(lblphone);

        JLabel cusphone = new JLabel("");
        cusphone.setBounds(500,80,150,25);
        add(cusphone);

        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(400,130,150,25);
        add(lblemail);

        JLabel cusemail = new JLabel("");
        cusemail.setBounds(500,130,150,25);
        add(cusemail);

        backbtn2 = new JButton("Back");
        backbtn2.setForeground(Color.WHITE);
        backbtn2.setBackground(new Color(63, 141, 200));
        backbtn2.setBounds(300,230,100,25);
        backbtn2.addActionListener(this);
        add(backbtn2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/Viewpd.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,200,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel l4 = new JLabel(image);
        l4.setBounds(100,240,500,200);// if not using panel
        add(l4);

        try {
            Data dt3 = new Data();
            String query3 = "select * from customer where username = '"+username+"'";
            ResultSet rs3 = dt3.stat.executeQuery(query3);

            while (rs3.next()) {
                cusname.setText(rs3.getString("username"));
                cusnic.setText(rs3.getString("nicnumber"));
                cusgender.setText(rs3.getString("gender"));
                cuscountry.setText(rs3.getString("country"));
                cusadd.setText(rs3.getString("address"));
                cusphone.setText(rs3.getString("phonenumber"));
                cusemail.setText(rs3.getString("email"));
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
        new ViewCustomer("Aiman");
    }
}
