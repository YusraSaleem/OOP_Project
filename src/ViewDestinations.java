import javax.swing.*;
import java.awt.*;

public class ViewDestinations extends JFrame implements Runnable {

    Thread t1;
    JLabel l1, l2, l3, l4, l5,caption;
    JLabel[] labels = new JLabel[]{l1, l2, l3, l4, l5};

    public void run () {
        try {
            for (int j = 0; j <= 4; j++) {
                labels[j].setVisible(true);
                Thread.sleep(2000);
                labels[j].setVisible(false);
            }
            setVisible(false);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    ViewDestinations() {

        setBounds(450, 190, 700, 500);

        caption = new JLabel("");
        caption.setBounds(50,400,700,70);
        caption.setFont(new Font("Tahoma",Font.PLAIN,28));
        caption.setForeground(Color.BLACK);
        add(caption);


        ImageIcon i1=null,i3=null,i5=null,i7=null,i9=null;
        ImageIcon[] imageIcon = new ImageIcon[] {i1,i3,i5,i7,i9};

        Image i2=null,i4=null,i6=null,i8=null,i10=null;
        Image[] images = new Image[] {i2,i4,i6,i8,i10};

        ImageIcon image1=null,image2=null,image3=null,image4=null,image5=null;
        ImageIcon[] imageIcons = new ImageIcon[] {image1,image2,image3,image4,image5};

        String[] list = {"Images/destiny6.jpg","Images/destiny7.jpg","Images/destiny8.jpg","Images/destny9.jpg","Images/destiny10.jpg"};

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        for (int i = 0; i <= 4; i++) {
            imageIcon[i] = new ImageIcon(ClassLoader.getSystemResource(list[i]));
            images[i] = imageIcon[i].getImage().getScaledInstance(700, 500, Image.SCALE_DEFAULT);
            imageIcons[i] = new ImageIcon(images[i]);
            labels[i] = new JLabel(imageIcons[i]);
            labels[i].setBounds(0, 0, 700, 500);// if not using panel
            add(labels[i]);
        }

        t1 = new Thread(this);
        t1.start();

        setVisible(true);

    }

    public static void main (String[]args){
        new ViewDestinations();
    }
}
