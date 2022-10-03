import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {
    JTabbedPane tbp1 = new JTabbedPane();
    JButton book1;

    CheckPackage () {
        setBounds(550,110,500,610);

        String pkg1 = "pkg1.jpeg";
        String pkg2 = "pkg2.jpg";
        String pkg3 = "pkg3.jpg";


        JPanel p1= createPackage(pkg1);
        tbp1.addTab("Package 1",null,p1);

        JPanel p2= createPackage(pkg2);
        tbp1.addTab("Package 2",null,p2);

        JPanel p3= createPackage(pkg3);
        tbp1.addTab("Package 3",null,p3);


        add(tbp1);


        setVisible(true);

    }


    public JPanel createPackage (String pack) {

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/"+pack));
        Image i2 = i1.getImage().getScaledInstance(500,550,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel l4 = new JLabel(image);
        l4.setBounds(0,0,500,550);// if not using panel
        p1.add(l4);


        return p1;

    }


    public static void main(String[] args) {
        new CheckPackage();
    }
}
