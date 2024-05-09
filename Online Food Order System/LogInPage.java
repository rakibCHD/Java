
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class LogInPage extends JFrame implements ActionListener {
    JFrame frame;
    JLabel label1, label2, imgLabel, header, imgLabel1, imgLabel2, imgLabel3;
    JTextField tf1;
    JPasswordField pf1;
    JButton lgbtn, fpbtn, sgbtn, exbtn, adminbtn;
    ImageIcon img, icon;
    ImageIcon i1;

    user un1, un2, un3;
    user users[];

    LogInPage() {

        // MUTIPAL USER
        un1 = new user("Safkat", "123");
        un2 = new user("Aishee", "456");
        un3 = new user("Adnan", "789");
        users = new user[6];
        users[0] = un1;
        users[1] = un2;
        users[2] = un3;

        // frame and title added.
        frame = new JFrame("LoginPage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // Header
        header = new JLabel("Log In");
        header.setBounds(680, 50, 100, 100);
        header.setForeground(Color.black);
        header.setFont(new Font("Default", Font.BOLD, 27));

        // logo
        i1 = new ImageIcon("logo.png");

        // user name label
        label1 = new JLabel("Username :");
        label1.setBounds(590, 150, 150, 20);
        label1.setForeground(Color.black);
        label1.setFont(new Font("Default", Font.BOLD, 15));

        // user password label
        label2 = new JLabel("Password :");
        label2.setBounds(590, 190, 150, 20);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Default", Font.BOLD, 15));

        // textfield adding.
        tf1 = new JTextField();
        tf1.setBounds(680, 150, 150, 30);

        // password field adding.
        pf1 = new JPasswordField();
        pf1.setBounds(680, 185, 150, 30);

        // Log in button
        lgbtn = new JButton("Login ➤");
        lgbtn.setBounds(670, 250, 90, 40);
        lgbtn.setForeground(Color.WHITE);
        //lgbtn.setBackground(Color.BLACK);
        lgbtn.setBackground(Color.decode("#2E75B6"));
        lgbtn.addActionListener(this);
        lgbtn.setFont(new Font("Default", Font.BOLD, 13));

        // Forget button
        fpbtn = new JButton("Forget Password");
        fpbtn.setBounds(570, 320, 140, 40);
        fpbtn.setBackground(Color.orange);
        fpbtn.addActionListener(this);
        fpbtn.setFont(new Font("Default", Font.BOLD, 13));

        // Signup button
        sgbtn = new JButton("Sign Up ");
        sgbtn.setBounds(735, 320, 120, 40);
        sgbtn.setBackground(Color.orange);
        //sgbtn.setBackground(Color.decode("#2E75B6"));
        sgbtn.addActionListener(this);
        sgbtn.setFont(new Font("Default", Font.BOLD, 13));

        // Exit button
        exbtn = new JButton("Exit");
        exbtn.setBounds(810, 1, 80, 30);
       // exbtn.setForeground(Color.red);
       // exbtn.setBackground(Color.decode("#ff4122"));
        exbtn.setForeground(Color.black);
        exbtn.addActionListener(this);
        exbtn.setFont(new Font("Default", Font.BOLD, 13));

        //Admin Button
        adminbtn = new JButton("Log in As Admin");
        adminbtn.setBounds(640, 440, 160, 40);
        adminbtn.setBackground(Color.gray);
        adminbtn.setForeground(Color.black);
        adminbtn.addActionListener(this);
        adminbtn.setFont(new Font("Default", Font.BOLD, 13));

        // USER SIDE IMG
        img = new ImageIcon("user.png");
        imgLabel1 = new JLabel(img);
        imgLabel1.setBounds(517, 111, 100, 100);

        // PASSWORD SIDE IMG
        img = new ImageIcon("lock.png");
        imgLabel2 = new JLabel(img);
        imgLabel2.setBounds(517, 147, 100, 100);

        // BACKGROUND IMG
        img = new ImageIcon("wepik-photo-mode.png");
        imgLabel3 = new JLabel(img);
        imgLabel3.setBounds(0, 0, 500, 650);

        // Adding Function On Frame Part
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(350, 90, 900, 650);

        // ADDING FRAME
        frame.add(label1);
        frame.add(label2);
        frame.add(header);
        frame.add(tf1);
        frame.add(pf1);
        frame.add(lgbtn);
        frame.add(fpbtn);
        frame.add(sgbtn);
        frame.add(exbtn);
        frame.add(imgLabel1);
        frame.add(imgLabel2);
        frame.add(imgLabel3);
        frame.add(adminbtn);
        frame.setIconImage(i1.getImage());
    }

    // Action Part
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
                    new UserdashBoard();
                    frame.setVisible(false);
                } else {
                    showMessageDialog(null, "Invalid Username or password!");
                }
            } else {
                showMessageDialog(null, " Please Fillup every field.");
            }

        }

        else if (e.getSource() == exbtn) {
            System.exit(0);
        }

        if (e.getSource() == fpbtn) {
            new ForgetPass();
            frame.setVisible(false);
        }

        if (e.getSource() == sgbtn) {
            new Signup();
            frame.setVisible(false);
        }

        if (e.getSource() == adminbtn) {
            new AdminLogin();
            frame.setVisible(false);
        }

    }



}
