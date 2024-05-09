
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Profile implements ActionListener {
    private JButton prvBtn;
    private JButton logoutBtn;
    private JButton updBtn;
    private JLabel uName;
    private JTextField userTf;
    private ImageIcon i1;
    JFrame frame;

    public Profile(String user) {

        // create frame
        frame = new JFrame("Profile");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // construct components
        prvBtn = new JButton("Previous");
        prvBtn.setBackground(Color.decode("#fcf51e"));
        prvBtn.addActionListener(this);
        prvBtn.setForeground(Color.BLACK);

        logoutBtn = new JButton("Logout ");
        logoutBtn.setBackground(Color.decode("#d14434"));
        logoutBtn.setForeground(Color.BLACK);

        updBtn = new JButton("Update Profile");
        updBtn.setBackground(Color.decode("#29a3cc"));

        uName = new JLabel("Username:");
        uName.setForeground(Color.black);
        uName.setFont(new Font("Default", Font.BOLD, 17));

        userTf = new JTextField(user);
        
        //Logo
        i1 = new ImageIcon("logo.png");

        // add components
        frame.add(prvBtn);
        frame.add(logoutBtn);
        frame.add(updBtn);
        frame.add(uName);
        frame.add(userTf);

        // set component bounds (only needed by Absolute Positioning)
        prvBtn.setBounds(1, 1, 100, 30);
        logoutBtn.setBounds(495, 1, 90, 30);
        updBtn.setBounds(200, 215, 140, 30);
        uName.setBounds(135, 125, 100, 25);
        userTf.setBounds(250, 125, 150, 30);

        // addActionListener
        logoutBtn.addActionListener(this);
        prvBtn.addActionListener(this);
        // updBtn.addActionListener(this);

        // adjust size and set layout
        frame.setSize(600, 650);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(i1.getImage());
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == logoutBtn) {
            new LogInPage();
            frame.setVisible(false);

        } else if (e.getSource() == prvBtn) {
            new Dashboard(userTf.getText());
            frame.setVisible(false);

        } else if (e.getSource() == updBtn) {
            
        }

    }

}