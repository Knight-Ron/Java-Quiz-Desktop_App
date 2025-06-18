import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener
{
    String name;
    JButton back, start;
    Rules(String name) 
    {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout (null);

        JLabel heading = new JLabel("Welcome "+name+" to your revision quiz ");
        heading.setBounds(50, 20, 900, 30);
        heading.setFont(new Font ("Mongolian Baiti", Font.BOLD, 25));
        heading.setForeground(Color.BLACK);
        add (heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 40, 900, 350);
        rules.setFont(new Font ("Mongolian Baiti", Font.PLAIN, 15));
        rules.setText (
            "<html>"+ 
            "1. Before taking this quiz, it is advised that you first go through your notes" + "<br><br>" +
            "2. Please try not to go through the notes while taking the quiz" + "<br><br>" +
            "3. Try attempting every questions" + "<br><br>" +
            "4. Note down the questions that you feel were not covered in class so that you can discuss it in future classes" + "<br><br>" +
            "5. Please take the quiz seriously as it will help you in revision" + "<br><br>" +
            "6. It's a good habit to keep record of your progress" + "<br><br>" +
            "7. Questions are framed by your teachers. If any problems arrise, contact them" + "<br><br>" +
            "8. Good Luck!" + "<br><br>" +
        "<html>"
        );
        add (rules);

        back = new JButton ("Back");
        back.setBounds (250, 500, 120, 25);
        back.setBackground(Color.BLACK);
        back.setForeground (Color.WHITE);
        back.addActionListener(this);
        add (back);

        start = new JButton ("Start");
        start.setBounds (450, 500, 120, 25);
        start.setBackground(Color.GREEN);
        start.setForeground (Color.WHITE);
        start.addActionListener(this);
        add (start);

        setSize (1000, 650);
        setLocation (350, 100);
        setVisible (true);
    }
    public void actionPerformed (ActionEvent ae)
    {
        if (ae.getSource() == start)
        {
            setVisible(false);
            new Quiz(name); 
        }
        else 
        {
            setVisible (false);
            new Login();
        }
    }
    public static void main (String args [])
    {
        new Rules("User");
    }
}