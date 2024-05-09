import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class ForgetPass implements ActionListener{
    JLabel l;
    ImageIcon i1;
    JLabel label1,label2,label3,label4,label5,header,imgLabel1,label6,lab7;
    JButton svbtn,bcbtn;
    JTextField tf1,tf2,tf3;
    JFrame fp;


    ForgetPass(){  
        fp = new JFrame("Forget Password"); 
		l = new JLabel("Forget Password");
        l.setFont(new Font("Default",Font.BOLD,19));
        
		l.setBounds(50,50,350,40); 
		fp.add(l);

        //Frame Size
        fp.setSize(400,400);  
        fp.setLayout(null);  
        fp.setVisible(true);  
        fp.setBounds(450,  80, 600, 650);

        // User Name
        label2 = new JLabel("User Name");
        label2.setBounds(80, 150, 200, 50);
        label2.setFont(new Font("Default",Font.BOLD,17));

        // User Password
        label3 = new JLabel("New Password");
        label3.setBounds(80, 200, 200, 50);
        label3.setFont(new Font("Default",Font.BOLD,17));

        // User password comform
        label4 = new JLabel("Re-type New Password");
        label4.setBounds(80, 250, 200, 50);
        label4.setFont(new Font("Default",Font.BOLD,17));

        // User Email InputField
        tf1 = new JTextField();
        tf1.setBounds(300, 160, 150, 22);


        // User Password InputField
        tf2 = new JTextField();
        tf2.setBounds(300, 215, 150, 22);

        // User Password Comform InputField
        tf3 = new JTextField();
        tf3.setBounds(300, 265, 150, 22);


        //Save Button 
        svbtn = new JButton("Save");
        svbtn.setBounds(315, 320, 90, 30);
        svbtn.setForeground(Color.WHITE); 
        svbtn.setBackground(Color.decode("#2E75B6"));
        svbtn.setFont(new Font("Default", Font.BOLD, 13));


        //Back Button 
        bcbtn = new JButton("Back");
        bcbtn.setBounds(1, 1, 90, 30);
        bcbtn.setForeground(Color.blue); 
        bcbtn.addActionListener(this);
        bcbtn.setFont(new Font("Default", Font.BOLD, 13));

        fp.add(label2);
        fp.add(label3);
        fp.add(label4);
        fp.add(tf1);
        fp.add(tf2);
        fp.add(tf3);
        fp.add(svbtn);
        fp.add(bcbtn);

    }
        public void actionPerformed(ActionEvent e) {

        if(e.getSource()==bcbtn)
        {  
            new LogInPage();
            fp.setVisible(false);
        }
    }
            
}
