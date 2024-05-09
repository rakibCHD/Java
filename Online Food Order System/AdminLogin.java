
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class AdminLogin implements ActionListener
{
    JFrame frm;
    JTextField tf1;
    JPasswordField pf1;
    ImageIcon i1;
    JButton lgbtn, exbtn,bkbtn;
    JLabel label1, label02, header;

    user un1, un2, un3;
    user users[];

    //Store By Array
    Account[] accounts = new Account[100];


    AdminLogin() {

        // MUTIPAL user
        un1 = new user("Safkat", "123");
        un2 = new user("ABCD", "456");
        un3 = new user("abcd", "789");
        users = new user[6];
        users[0] = un1;
        users[1] = un2;
        users[2] = un3;



        // Frame Layout
        frm = new JFrame("Admin Login");
        frm.setBounds(450, 80, 600, 650);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setResizable(false);
        frm.setVisible(true);

        // logo
        i1 = new ImageIcon("logo.png");

        // Log in button
        lgbtn = new JButton("Login");
        lgbtn.setBounds(170, 320, 200, 30);
        lgbtn.setForeground(Color.white);
        lgbtn.setBackground(Color.black);
        lgbtn.addActionListener(this);
        lgbtn.setFont(new Font("Default", Font.BOLD, 15));

        // Exit button
        exbtn = new JButton("Exit");
        exbtn.setBounds(513, 1, 80, 30);
        exbtn.setBackground(Color.orange);
        exbtn.setForeground(Color.black);
        exbtn.addActionListener(this);
        exbtn.setFont(new Font("Default", Font.BOLD, 13));

        // Back button
        bkbtn = new JButton("Back");
        bkbtn.setBounds(1, 1, 80, 30);
        bkbtn.setForeground(Color.blue);
        bkbtn.addActionListener(this);
        bkbtn.setFont(new Font("Default",Font.BOLD,13));

        // user name label
        label1 = new JLabel("Username");
        label1.setBounds(170, 150, 150, 20);
        label1.setForeground(Color.black);
        label1.setFont(new Font("Default", Font.BOLD, 17));

        // user password label
        label02 = new JLabel("Password");
        label02.setBounds(170, 230, 150, 30);
        label02.setForeground(Color.black);
        label02.setFont(new Font("Default", Font.BOLD, 17));

        // textfield adding.
        tf1 = new JTextField();
        tf1.setBounds(170, 180, 200, 30);

        // password field adding.
        pf1 = new JPasswordField();
        pf1.setBounds(170, 260, 200, 30);

        // Adding Part
        frm.setIconImage(i1.getImage());
        frm.add(tf1);
        frm.add(pf1);
        frm.add(lgbtn);
        frm.add(bkbtn);
        frm.add(exbtn);
        frm.add(label1);
        frm.add(label02);

    }

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == lgbtn) {
                String user = tf1.getText();
                String pass = pf1.getText();
    
                int flag = 0;
    
                if (user.isEmpty() == false && pass.isEmpty() == false) {
                    for (int i = 0; i < users.length; i++) {
                        if (users[i] != null) {
                            if (user.equals(users[i].getUsername()) && pass.equals(users[i].getPassword())) {
                                flag = 1;
                                break;
                            }
                        }
                    }
                    if (flag == 1) {
                        new Dashboard(user);
                        frm.setVisible(false);
                    } else {
                        showMessageDialog(null, "Invalid Username or Password!");
                    }
                } else {
                    showMessageDialog(null, "Please Fillup Every Field.");
                }
            }
            else if (e.getSource() == exbtn) {
                System.exit(0);
            }
            if(e.getSource()==bkbtn)
            {  
                new LogInPage();
                frm.setVisible(false);
            }
    }

}
