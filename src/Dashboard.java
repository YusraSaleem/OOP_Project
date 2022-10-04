import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    String username;
    JButton personal,updatepd,viewpd,deletepd;
    JButton destiny;
    JButton viewht;
    JButton checkpkg,bookpkg,viewpkg;
    JButton about,calc,ntpd;
    String[] arr = new String[] {"calc.exe"};
    String[] arr2 = new String[] {"notepad.exe"};
    Dashboard (String username) {
        this.username = username;
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

        personal = new JButton("Add Personal Details");
        personal.setBounds(0,4,200,45);
        personal.setBackground(new Color(58, 178, 124));
        personal.setForeground(Color.WHITE);
        personal.setFont(new Font("Tahoma",Font.PLAIN,18));
        personal.addActionListener(this);
        p2.add(personal);

        updatepd = new JButton("Update Personal Details");
        updatepd.setBounds(0,54,250,45);
        updatepd.setBackground(new Color(58, 178, 124));
        updatepd.setForeground(Color.WHITE);
        updatepd.setFont(new Font("Tahoma",Font.PLAIN,18));
        updatepd.setMargin(new Insets(0,0,0,25));
        updatepd.addActionListener(this);
        p2.add(updatepd);

        viewpd = new JButton("View Details");
        viewpd.setBounds(0,104,200,45);
        viewpd.setBackground(new Color(58, 178, 124));
        viewpd.setForeground(Color.WHITE);
        viewpd.setFont(new Font("Tahoma",Font.PLAIN,18));
        viewpd.setMargin(new Insets(0,0,0,65));
        viewpd.addActionListener(this);
        p2.add(viewpd);

        deletepd = new JButton("Delete Personal Details");
        deletepd.setBounds(0,154,220,45);
        deletepd.setBackground(new Color(58, 178, 124));
        deletepd.setForeground(Color.WHITE);
        deletepd.setFont(new Font("Tahoma",Font.PLAIN,18));
        deletepd.addActionListener(this);
        p2.add(deletepd);

        destiny = new JButton("Destination");
        destiny.setBounds(0,204,200,45);
        destiny.setBackground(new Color(58, 178, 124));
        destiny.setForeground(Color.WHITE);
        destiny.setFont(new Font("Tahoma",Font.PLAIN,18));
        destiny.setMargin(new Insets(0,0,0,65));
        destiny.addActionListener(this);
        p2.add(destiny);

        viewht = new JButton("View Hotels");
        viewht.setBounds(0,254,200,45);
        viewht.setBackground(new Color(58, 178, 124));
        viewht.setForeground(Color.WHITE);
        viewht.setFont(new Font("Tahoma",Font.PLAIN,18));
        viewht.setMargin(new Insets(0,0,0,65));
        viewht.addActionListener(this);
        p2.add(viewht);

        checkpkg = new JButton("Check Package");
        checkpkg.setBounds(0,304,200,45);
        checkpkg.setBackground(new Color(58, 178, 124));
        checkpkg.setForeground(Color.WHITE);
        checkpkg.setFont(new Font("Tahoma",Font.PLAIN,18));
        checkpkg.setMargin(new Insets(0,0,0,35));
        checkpkg.addActionListener(this);
        p2.add(checkpkg);

        bookpkg = new JButton("Book Package");
        bookpkg.setBounds(0,354,220,45);
        bookpkg.setBackground(new Color(58, 178, 124));
        bookpkg.setForeground(Color.WHITE);
        bookpkg.setFont(new Font("Tahoma",Font.PLAIN,18));
        bookpkg.setMargin(new Insets(0,0,0,50));
        bookpkg.addActionListener(this);
        p2.add(bookpkg);

        viewpkg = new JButton("View Package");
        viewpkg.setBounds(0,404,200,45);
        viewpkg.setBackground(new Color(58, 178, 124));
        viewpkg.setForeground(Color.WHITE);
        viewpkg.setFont(new Font("Tahoma",Font.PLAIN,18));
        viewpkg.setMargin(new Insets(0,0,0,30));
        viewpkg.addActionListener(this);
        p2.add(viewpkg);

        calc = new JButton("Calculator");
        calc.setBounds(0,454,200,45);
        calc.setBackground(new Color(58, 178, 124));
        calc.setForeground(Color.WHITE);
        calc.setFont(new Font("Tahoma",Font.PLAIN,18));
        calc.setMargin(new Insets(0,0,0,50));
        calc.addActionListener(this);
        p2.add(calc);

        ntpd = new JButton("Notepad");
        ntpd.setBounds(0,504,200,45);
        ntpd.setBackground(new Color(58, 178, 124));
        ntpd.setForeground(Color.WHITE);
        ntpd.setFont(new Font("Tahoma",Font.PLAIN,18));
        ntpd.setMargin(new Insets(0,0,0,50));
        ntpd.addActionListener(this);
        p2.add(ntpd);

        about = new JButton("About");
        about.setBounds(0,554,200,45);
        about.setBackground(new Color(58, 178, 124));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,18));
        about.setMargin(new Insets(0,0,0,65));
        about.addActionListener(this);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == personal) {
            new AddCustomer(username);
        }
        else if (e.getSource() == viewpd) {
            new ViewCustomer(username);
        }
        else if (e.getSource() == updatepd) {
            new UpdateCustomer(username);
        }
        else if (e.getSource() == checkpkg) {
            new CheckPackage();
        }
        else if (e.getSource() == bookpkg) {
            new BookPackage(username);
        }
        else if (e.getSource() == viewpkg) {
            new ViewPackage(username);
        }
        else if (e.getSource() == viewht) {
            new ViewHotels();
        }
        else if (e.getSource() == destiny) {
            new ViewDestinations();
        }
        else if (e.getSource() == calc) {
           try {
               Runtime.getRuntime().exec(arr);
           }
           catch (Exception e1) {
               e1.printStackTrace();
           }
        }
        else if (e.getSource() == ntpd) {
            try {
                Runtime.getRuntime().exec(arr2);
            }
            catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        else if (e.getSource() == about) {
            new About();
        }
        else if (e.getSource() == deletepd) {
            new DeleteDetails(username);
        }
    }

    public static void main(String[] args) {
        new Dashboard("");
    }
}
