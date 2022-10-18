import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {
    About () {

        setBounds(550,180,500,540);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel l1 = new JLabel("TOURISM MANAGEMENT SYSTEM");
        l1.setBounds(30,10,450,40);
        l1.setForeground(new Color(30,178,170));
        l1.setFont(new Font("SAN SERIF",Font.BOLD,25));
        add(l1);

        String txt = "About Project             \n\n"+
                    "The main purpose of “Tourism Management System ” is to provide a convenient " +
                "way for a customer to book hotels, flight, train and bus for tour purposes. \n\n"+
                "The objective of this project is to develop a system that automates the processes " +
                "and activities of a travel agency. In this project, We will make an easier task of searching " +
                "places and for booking train, flight or bus.\n\n"+
                "It is tedious for a customer to plan a particular journey and have it executed " +
                "properly. The project ‘Tourism Management System’ is developed to replace the" +
                " currently existing system, which helps in keeping records of the customer details of " +
                "destination as well as different packages.";

        TextArea txtarea = new TextArea(txt,10,14,Scrollbar.VERTICAL);
        txtarea.setEditable(false);
        txtarea.setBounds(20,100,450,300);
        add(txtarea);

        JButton backbtn  =new JButton("Back");
        backbtn.setForeground(Color.WHITE);
        backbtn.setBackground(new Color(63, 141, 200));
        backbtn.setBounds(200,420,100,25);
        backbtn.addActionListener(this);
        add(backbtn);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new About();
    }
}
