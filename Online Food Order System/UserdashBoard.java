
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class UserdashBoard extends JFrame implements ActionListener{ 

    JFrame frame1;

    JComboBox combo;

    JRadioButton rb1, rb2, rb3, rb4;
    ButtonGroup bg1;

    ImageIcon img;
    JLabel imgLabel;

    JButton nxbtn,prvbtn,exbtn;

    UserdashBoard() {
        //Creating Frame
        frame1 = new JFrame("DashBoard");
        //StudentCheakBox
        JCheckBox checkBox1 = new JCheckBox("Pizza");
        checkBox1.setBounds(50, 50, 100, 30);
        //Teacher CheakBox
        JCheckBox checkBox2 = new JCheckBox("Burger");
        checkBox2.setBounds(50, 80, 100, 30);
        //admin CheakBox
        JCheckBox checkBox3 = new JCheckBox("Sandwish");
        checkBox3.setBounds(50, 110, 100, 30);
        //ComboBOx
        String items[] = { "Coke", "Pepsi", "Spite", "7up", "Water" };
        combo = new JComboBox(items);
        combo.setBounds(350, 60, 100, 30);
        //Radio Button
        rb1 = new JRadioButton("1");
		rb1.setBounds(275, 25, 100, 20);
        rb2 = new JRadioButton("2");
		rb2.setBounds(275, 50, 100, 20);
        rb3 = new JRadioButton("3");
		rb3.setBounds(275, 75, 100, 20);
        rb4 = new JRadioButton("4");
        rb4.setBounds(275, 100, 100, 20);
       /*  //Img Added
        img = new ImageIcon("Logo.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(170, 100, 250, 250);*/
        //NextButton
        nxbtn = new JButton("Next");
        nxbtn.setBounds(100, 150, 100, 25);
        nxbtn.setBackground(Color.orange);
        nxbtn.addActionListener(this);
        //Previous Button
        prvbtn=new JButton("Previous");
        prvbtn.setBounds(250, 150, 100, 25);
        prvbtn.setBackground(Color.orange);
        prvbtn.addActionListener(this);
        //Exit Button
        exbtn=new JButton("Exit");
        exbtn.setBounds(500, 0, 100, 25);
        exbtn.setBackground(Color.orange);
        exbtn.addActionListener(this);
        //Button Group
        bg1 = new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
        bg1.add(rb4);
		//ALL Component Added
        frame1.add(checkBox1);
        frame1.add(checkBox2);
        frame1.add(checkBox3);
        frame1.add(combo);
        frame1.add(rb1);
        frame1.add(rb2);
        frame1.add(rb3);
        frame1.add(rb4);
        frame1.add(nxbtn);
        frame1.add(exbtn);
        frame1.add(prvbtn);
      //  frame1.add(imgLabel);
       // frame1.setSize(500, 500);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setBounds(450,  80, 600, 650);
    }
    //Button Action Perform
        public void actionPerformed(ActionEvent e) {
        if(e.getSource()==prvbtn)
		{  
			new LogInPage();
			frame1.setVisible(false);
        }  
            if(e.getSource()==nxbtn)
            {  
              //  new ();
              //  frame1.setVisible(false);
            } 
                if(e.getSource()==exbtn)
                {
                    System.exit(0);
                }
                }
    }
