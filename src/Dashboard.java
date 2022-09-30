import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    Dashboard () {
        setBounds(0,0,1370,730);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBounds(0,0,1370,75);
        p1.setLayout(null);
        p1.setBackground(new Color(58, 178, 124));
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(200,75,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel l1 = new JLabel(image);
        l1.setBounds(5,0,150,75);// if not using panel
        p1.add(l1);

        JLabel dashname = new JLabel("Main Menu");
        dashname.setBounds(160,15,200,40);
        dashname.setForeground(Color.WHITE);
        dashname.setFont(new Font("Monospaced",Font.ITALIC,30));
        p1.add(dashname);

        JPanel p2 = new JPanel();
        p2.setBounds(0,75,230,730);
        p2.setLayout(null);
        p2.setBackground(new Color(58, 178, 124));
        add(p2);

        JButton personal = new JButton("Add Personal Details");
        personal.setBounds(0,4,200,45);
        personal.setBackground(new Color(58, 178, 124));
        personal.setForeground(Color.WHITE);
        personal.setFont(new Font("Tahoma",Font.PLAIN,18));
        //personal.setMargin(new Insets(0,0,0,30));
        p2.add(personal);

        JButton updatepd = new JButton("Update Personal Details");
        updatepd.setBounds(0,54,250,45);
        updatepd.setBackground(new Color(58, 178, 124));
        updatepd.setForeground(Color.WHITE);
        updatepd.setFont(new Font("Tahoma",Font.PLAIN,18));
        updatepd.setMargin(new Insets(0,0,0,25));
        p2.add(updatepd);

        JButton veiwpd = new JButton("View Details");
        veiwpd.setBounds(0,104,200,45);
        veiwpd.setBackground(new Color(58, 178, 124));
        veiwpd.setForeground(Color.WHITE);
        veiwpd.setFont(new Font("Tahoma",Font.PLAIN,18));
        veiwpd.setMargin(new Insets(0,0,0,65));
        p2.add(veiwpd);

        JButton deletepd = new JButton("Delete Personal Details");
        deletepd.setBounds(0,154,220,45);
        deletepd.setBackground(new Color(58, 178, 124));
        deletepd.setForeground(Color.WHITE);
        deletepd.setFont(new Font("Tahoma",Font.PLAIN,18));
        p2.add(deletepd);

        JButton destiny = new JButton("Destination");
        destiny.setBounds(0,204,200,45);
        destiny.setBackground(new Color(58, 178, 124));
        destiny.setForeground(Color.WHITE);
        destiny.setFont(new Font("Tahoma",Font.PLAIN,18));
        destiny.setMargin(new Insets(0,0,0,65));
        p2.add(destiny);

        JButton veiwht = new JButton("View Hotels");
        veiwht.setBounds(0,254,200,45);
        veiwht.setBackground(new Color(58, 178, 124));
        veiwht.setForeground(Color.WHITE);
        veiwht.setFont(new Font("Tahoma",Font.PLAIN,18));
        veiwht.setMargin(new Insets(0,0,0,65));
        p2.add(veiwht);

        JButton bookht = new JButton("Book Hotel");
        bookht.setBounds(0,304,200,45);
        bookht.setBackground(new Color(58, 178, 124));
        bookht.setForeground(Color.WHITE);
        bookht.setFont(new Font("Tahoma",Font.PLAIN,18));
        bookht.setMargin(new Insets(0,0,0,65));
        p2.add(bookht);

        JButton veiwbookht = new JButton("View Booked Hotel");
        veiwbookht.setBounds(0,354,220,45);
        veiwbookht.setBackground(new Color(58, 178, 124));
        veiwbookht.setForeground(Color.WHITE);
        veiwbookht.setFont(new Font("Tahoma",Font.PLAIN,18));
        veiwbookht.setMargin(new Insets(0,0,0,30));
        p2.add(veiwbookht);

        JButton checkpkg = new JButton("Check Package");
        checkpkg.setBounds(0,404,200,45);
        checkpkg.setBackground(new Color(58, 178, 124));
        checkpkg.setForeground(Color.WHITE);
        checkpkg.setFont(new Font("Tahoma",Font.PLAIN,18));
        checkpkg.setMargin(new Insets(0,0,0,30));
        p2.add(checkpkg);

        JButton bookpkg = new JButton("Book Package");
        bookpkg.setBounds(0,454,200,45);
        bookpkg.setBackground(new Color(58, 178, 124));
        bookpkg.setForeground(Color.WHITE);
        bookpkg.setFont(new Font("Tahoma",Font.PLAIN,18));
        bookpkg.setMargin(new Insets(0,0,0,30));
        p2.add(bookpkg);

        JButton viewpkg = new JButton("View Package");
        viewpkg.setBounds(0,504,200,45);
        viewpkg.setBackground(new Color(58, 178, 124));
        viewpkg.setForeground(Color.WHITE);
        viewpkg.setFont(new Font("Tahoma",Font.PLAIN,18));
        viewpkg.setMargin(new Insets(0,0,0,30));
        p2.add(viewpkg);

        JButton about = new JButton("About");
        about.setBounds(0,554,200,45);
        about.setBackground(new Color(58, 178, 124));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,18));
        about.setMargin(new Insets(0,0,0,65));
        p2.add(about);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Images/splash.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1370,730,Image.SCALE_DEFAULT);
        ImageIcon image1 = new ImageIcon(i5);
        JLabel l2 = new JLabel(image1);
        l2.setBounds(100,0,1370,730);// if not using panel
        add(l2);

        JLabel title = new JLabel("Travel And Tourism");
        title.setBounds(450,90,1000,70);
        title.setFont(new Font("Monospaced",Font.ITALIC,45));
        title.setForeground(Color.BLACK);
        l2.add(title);




        setVisible(true);
    }



    public static void main(String[] args) {
        new Dashboard();
    }
}
