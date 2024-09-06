import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage {

    public static void main(String[] args) {

        Action act = new Action("MAIN PAGE");
    }
}


class Action extends JFrame {

       JButton logOutBtn;
       JButton helpBtn;
    Action(String title){
        super(title);

        logOutBtn = new JButton("LOGOUT");
        logOutBtn.setBackground(Color.cyan);
        logOutBtn.setBounds(10,500,120,40);
        add(logOutBtn);

        helpBtn = new JButton("GET HELP");
        helpBtn.setBackground(Color.cyan);
        helpBtn.setBounds(480,10,100,40);
        add(helpBtn);
       // JPanel panel = new JPanel();
       // add(panel);

        JButton button = new JButton("DISPLAY OF STUDENT INFO");
        button.setBackground(Color.lightGray);
        button.setBounds(10,10,220,50);
        add(button);

        JButton button1 = new JButton("DISPLAY OF COLLEGES");
        button1.setBackground(Color.lightGray);
        button1.setBounds(10,80,220,50);
        add(button1);

        JButton button2 = new JButton("SELECT THE COLLEGE");
        button2.setBackground(Color.lightGray);
        button2.setBounds(10,150,220,50);
        add(button2);

        JButton button3 = new JButton("SAVE OPTIONS");
        button3.setBackground(Color.lightGray);
        button3.setBounds(10,220,220,50);
        add(button3);

        JButton button4 = new JButton("LOCKED CHOICES");
        button4.setBackground(Color.lightGray);
        button4.setBounds(10,290,220,50);
        add(button4);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DisplayOfStudentInfo("STUDENT INFO");
                dispose();
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new OrderListCollege("LIST OF COLLEGES");
                dispose();
            }
        });


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new clgType("COLLEGE TYPE");
                dispose();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SaveOptions("Saved Choices");
                dispose();
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Your Saved Choices has been locked Successfully");
            }
        });


        logOutBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new wlmpage("WelcomePage");
                dispose();
            }
        });

         helpBtn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                    new CounsellingProcess("Counselling process");
                    dispose();
             }
         });

        setLayout(null);
        setLocation(50,50);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);

    }


}
