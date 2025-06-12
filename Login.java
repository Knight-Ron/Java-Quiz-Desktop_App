import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener
{
    JButton rules, back;
    JTextField tfname;
    Login()
    {   
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); 

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quiz_Images/CU_LOGO.jpg"));
        JLabel image = new JLabel (i1);
        image.setBounds(0, 0, 481, 737);
        add(image);

        JLabel heading = new JLabel("Revision Quiz");
        heading.setBounds(700, 170, 350, 45);
        heading.setFont(new Font ("Mongolian Baiti", Font.BOLD, 50));
        heading.setForeground(Color.RED);
        add (heading);

        JLabel name = new JLabel("Enter your UID");
        name.setBounds(785, 250, 300, 20);
        name.setFont(new Font ("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(Color.BLACK);
        add (name);

        tfname = new JTextField();
        tfname.setBounds (710, 300, 300,25);
        tfname.setFont (new Font ("Times New Roman",Font.BOLD, 20));
        add (tfname);

        rules = new JButton ("Rules");
        rules.setBounds (710, 350, 120, 25);
        rules.setBackground(Color.RED);
        rules.setForeground (Color.WHITE);
        rules.addActionListener(this);
        add (rules);

        back = new JButton ("Back");
        back.setBounds (890, 350, 120, 25);
        back.setBackground(Color.BLACK);
        back.setForeground (Color.WHITE);
        back.addActionListener(this);
        add (back);

        setSize (1200, 800);
        setLocation (200, 50);
        setVisible (true);
    }

    public void actionPerformed (ActionEvent ae)
    {
        if (ae.getSource() == rules)
        {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else 
        if (ae.getSource() == back)
        {
            setVisible (false);
        }
    }
    public static void main (String args[] )
    {
        new Login(); 
    }
}