import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BookPackage extends JFrame implements ActionListener {
    JComboBox pkgs;
    JTextField pertxt;
    JLabel niclab,pholab,prilab;
    String username;
    JButton checkpkg,bookpkg,backbtn;
    BookPackage (String username) {
        this.username = username;
        setBounds(420,210,760,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel label = new JLabel("BOOK PACKAGE");
        label.setBounds(70,5,250,20);
        label.setFont(new Font("Monospaced",Font.BOLD,22));
        add(label);

        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblusername.setBounds(30,50,150,25);
        add(lblusername);

        JLabel cusname = new JLabel("");
        cusname.setFont(new Font("Tahoma",Font.PLAIN,16));
        cusname.setBounds(190,50,150,25);
        add(cusname);

        JLabel lblpkg = new JLabel("Select Package");
        lblpkg.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblpkg.setBounds(30,90,150,25);
        add(lblpkg);

        pkgs = new JComboBox();
        pkgs.addItem("Package 1");
        pkgs.addItem("Package 2");
        pkgs.addItem("Package 3");
        pkgs.setBounds(190,90,150,25);
        add(pkgs);

        JLabel lblper = new JLabel("Total Persons");
        lblper.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblper.setBounds(30,130,150,25);
        add(lblper);

        pertxt = new JTextField();
        pertxt.setFont(new Font("Tahoma",Font.PLAIN,16));
        pertxt.setBounds(190,130,150,25);
        add(pertxt);

        JLabel lblnic = new JLabel("NIC Number");
        lblnic.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblnic.setBounds(30,170,150,25);
        add(lblnic);

        niclab = new JLabel();
        niclab.setFont(new Font("Tahoma",Font.PLAIN,16));
        niclab.setBounds(190,170,150,25);
        add(niclab);

        JLabel lblpho = new JLabel("Phone");
        lblpho.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblpho.setBounds(30,210,150,25);
        add(lblpho);

        pholab = new JLabel();
        pholab.setFont(new Font("Tahoma",Font.PLAIN,16));
        pholab.setBounds(190,210,150,25);
        add(pholab);

        JLabel lblpri = new JLabel("Total Price");
        lblpri.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblpri.setBounds(30,250,150,25);
        add(lblpri);

        prilab = new JLabel();
        prilab.setFont(new Font("Tahoma",Font.PLAIN,16));
        prilab.setBounds(190,250,150,25);
        add(prilab);

        try {
            Data dt3 = new Data();
            String query3 = "select * from customer where username = '"+username+"'";
            ResultSet rs3 = dt3.stat.executeQuery(query3);

            while (rs3.next()) {
                cusname.setText(rs3.getString("username"));
                niclab.setText(rs3.getString("nicnumber"));
                pholab.setText(rs3.getString("phonenumber"));
            }
        }
        catch (Exception e1) {
            e1.printStackTrace();
        }

        checkpkg  =new JButton("Check Price");
        checkpkg.setForeground(Color.WHITE);
        checkpkg.setBackground(new Color(63, 141, 200));
        checkpkg.setBounds(40,300,105,22);
        checkpkg.addActionListener(this);
        add(checkpkg);

        bookpkg  =new JButton("Book Package");
        bookpkg.setForeground(Color.WHITE);
        bookpkg.setBackground(new Color(63, 141, 200));
        bookpkg.setBounds(160,300,120,22);
        bookpkg.addActionListener(this);
        add(bookpkg);

        backbtn  =new JButton("Back");
        backbtn.setForeground(Color.WHITE);
        backbtn.setBackground(new Color(63, 141, 200));
        backbtn.setBounds(290,300,100,22);
        backbtn.addActionListener(this);
        add(backbtn);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/bookpkg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(240,250,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel l4 = new JLabel(image);
        l4.setBounds(450,50,240,250);// if not using panel
        add(l4);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkpkg) { //check price
            String pkg  = pkgs.getSelectedItem().toString();
            int cost  = 0;
            if (pkg == "Package 1") {
                cost += 12000;
            }
            else if (pkg == "Package 2") {
                cost += 25000;
            }
            else if (pkg == "Package 3") {
                cost += 32000;
            }

            int persons = Integer.parseInt(pertxt.getText());
            cost*=persons;
            prilab.setText("Rs "+cost);
        }
        else if (e.getSource() == bookpkg) {

            try {
                Data d3 = new Data();
                d3.stat.executeUpdate("insert into bookpackages values('" + username + "','" + pkgs.getSelectedItem() + "','" + pertxt.getText() +"','" + niclab.getText() + "','" + pholab.getText() + "','" + prilab.getText() +"')");
                JOptionPane.showMessageDialog(null, "Package booked successfully");
                setVisible(false);
            }
            catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        else if (e.getSource() == backbtn) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new BookPackage("");
    }
}
