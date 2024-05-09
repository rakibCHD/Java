
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Signup implements ActionListener{
    JFrame frm;
    JLabel label1,label2,label3,label4,label5,header,imgLabel1,label6,lab7;
    JTextField tf1,tf2,tf3,tf4,tf5;
    JPasswordField jp1,jp2;
    ImageIcon i1;
    JPasswordField pf1,cpf1;
    JButton svbtn,exbtn,bkbtn,rsetbtn;
    int a, b;

    user nun1, nun2,nun3;
	user users[];

Signup(){

        // Frame Layout
        frm = new JFrame("Signup page");
        frm.setBounds(450, 80, 600, 650);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setResizable(false);
        frm.setVisible(true);
        frm.setLayout (null);

        //logo
        i1 = new ImageIcon("logo.png");

        //Header
        header = new JLabel("Sign Up");
        header.setBounds(80, 50, 300, 100);
        header.setForeground(Color.black);
        header.setFont(new Font("Default",Font.BOLD,27));


         // User Name
        label1 = new JLabel("Name");
        label1.setBounds(100, 147, 150, 70);
        label1.setFont(new Font("Default",Font.BOLD,17));

         // User Password
        label2 = new JLabel("Password");
        label2.setBounds(100, 205, 100, 50);
        label2.setFont(new Font("Default",Font.BOLD,17));

        // User password comform
        label3 = new JLabel("Re-type Password");
        label3.setBounds(100, 250, 200, 50);
        label3.setFont(new Font("Default",Font.BOLD,17));

        // User Email account
        label4 = new JLabel("Email Account");
        label4.setBounds(100, 300, 200, 50);
        label4.setFont(new Font("Default",Font.BOLD,17));

        // User Phone
        label5 = new JLabel("Phone Number");
        label5.setBounds(100, 352, 200, 50);
        label5.setFont(new Font("Default",Font.BOLD,17));

        // User name textfield adding.
        tf1 = new JTextField();
        tf1.setBounds(280, 170, 150, 22);

        // password field adding.
        pf1 = new JPasswordField();
        pf1.setBounds(280, 220, 150, 22);
       // pf1.setHorizontalAlignment(JTextField.CENTER);

        //Comform password field adding.
        cpf1 = new JPasswordField();
        cpf1.setBounds(280, 265, 150, 22);
      //  cpf1.setHorizontalAlignment(JTextField.CENTER);

        //Email textfield adding.
        tf2 = new JTextField();
        tf2.setBounds(280, 315, 150, 22);
        

        // Phone Number textfield adding.
        tf3 = new JTextField();
        tf3.setBounds(280, 370, 150, 22);

       // Save button Adding
        svbtn = new JButton("Save");
        svbtn.setBounds(300, 470, 100, 40);
        svbtn.setBackground(Color.orange);
        svbtn.addActionListener(this);
        svbtn.setFont(new Font("Default",Font.BOLD,13));

       // Back button
        bkbtn = new JButton("Back");
        bkbtn.setBounds(1, 1, 80, 30);
        bkbtn.setForeground(Color.blue);
        bkbtn.addActionListener(this);
        bkbtn.setFont(new Font("Default",Font.BOLD,13));

        // Exit button
        exbtn = new JButton("Exit");
        exbtn.setBounds(510, 1, 80, 30);
        exbtn.setBackground(Color.orange);
        exbtn.addActionListener(this);
        exbtn.setFont(new Font("Default",Font.BOLD,13));

        // Reset button Adding
        rsetbtn = new JButton("Reset");
        rsetbtn.setBounds(150, 470, 100, 40);
        rsetbtn.addActionListener(this);
        rsetbtn.setFont(new Font("Default",Font.BOLD,13));

        // Captcha Label and Text Field
        label6 = new JLabel();
        label6.setText("Captcha");
        label6.setBounds(100, 400, 200, 50);
        label6.setFont(new Font("Default",Font.BOLD,15));
        frm.add(label6);

        tf5 = new JTextField();
        tf5.setBounds(280, 410, 150, 25);
        frm.add(tf1);

        // To get a random number for captcha
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);

        // Captcha
        lab7 = new JLabel();
        lab7.setText(" " + a + " + " + b + " ");
        lab7.setBounds(170, 410, 75, 30);
        lab7.setForeground(Color.red);
        lab7.setBackground(Color.decode("#FFD3D3"));
        lab7.setOpaque(true);
        

//Adding Part
frm.add(header);
frm.add(label1);
frm.add(label2);
frm.add(label3);
frm.add(label4);
frm.add(label5);
frm.add(tf1);
frm.add(tf2);
frm.add(tf3);
frm.add(tf5);
frm.add(pf1);
frm.add(cpf1);
frm.add(exbtn);
frm.add(svbtn);
frm.add(bkbtn);
frm.add(rsetbtn);
frm.add(lab7);
frm.setIconImage(i1.getImage());
}

    // Action Part
    public void actionPerformed(ActionEvent e) {
        String user = tf1.getText().toLowerCase();
        String pass = pf1.getText();
        String email = tf2.getText();
        String captcha = tf5.getText();
        if (e.getSource() == svbtn) {

            int flag = 0;

            if(user.isEmpty()==false && pass.isEmpty()==false && email.isEmpty()==false && captcha.isEmpty()==false)
			{
				for(int i = 0; i<users.length; i++)
				{
					if(users[i]!=null)
					{
						flag = 1;
						break;
					}
				}
                
				if (flag == 1)
				{
					frm.setVisible(false);
				}
				else
				{
					showMessageDialog(null, "Invalid Username or password!");
				}
			}
			else
			{
				showMessageDialog(null,"Fillup Every Field.");
			}
			
        }
        int result = 0;
        if (result != (a + b)) {
            JOptionPane.showMessageDialog(null, "Wrong Captcha.", "Warning!", JOptionPane.WARNING_MESSAGE);}
    
	    if(e.getSource()==exbtn)
		{
			System.exit(0);
		}
        if(e.getSource()==bkbtn)
        {  
            new LogInPage();
            frm.setVisible(false);
        }

        if(e.getSource()==rsetbtn)
        {  
            new Signup();
            frm.setVisible(false);
        }

}
}
