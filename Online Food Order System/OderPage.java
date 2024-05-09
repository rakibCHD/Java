
import javax.swing.*;
import java.awt.*;


public class OderPage {
    JFrame frame;
    ImageIcon im1,im2,im3,im4,im5,im6,icn;
    JButton btn1,btn2,btn3,btn4,btn5,btn6;
    JLabel header,imgLabel1, imgLabel2, imgLabel3,imgLabel4, imgLabel5, imgLabel6;
    ImageIcon i1;

OderPage(){

        // frame and title added.
        frame = new JFrame("Oder Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        //Header
        header = new JLabel("Please Make Your Oder....");
        header.setBounds(100, 50, 500, 100);
        header.setForeground(Color.black);
        header.setFont(new Font("Default",Font.BOLD,20));

        //logo
        i1 = new ImageIcon("logo.png");


        // Adding Function On Frame Part
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(400, 50, 900, 650);
        
        im1 = new ImageIcon("Photo1.png");
        imgLabel1 = new JLabel(im1);
        imgLabel1.setBounds(100, 100, 350, 250);

        //ADDING FRAME
        frame.setIconImage(i1.getImage());
        frame.add(header);
        frame.add(imgLabel1);
}

}

