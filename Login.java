import javax.annotation.processing.FilerException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Login {

    public static void main(String[] args) {

        LPage lgn = new LPage("Login");

    }
}


class LPage extends JFrame implements ActionListener {

      Timer timeDelay;
       int i;
       JLabel l, l1;

         static JTextField t;
       JPasswordField p;
       JButton b;

       JButton backToRegister;
       JButton Instructions;
       JTextField successfulLogin;

       JLabel invalidUserLabel;
       JTextField registerAgain;
    public LPage(String title){
        super(title);
          i = 0;
         timeDelay = new Timer(20,this);

         l = new JLabel("Application No.");
         l1 = new JLabel("Password");
          t = new JTextField();
          t.setBackground(Color.lightGray);
          p = new JPasswordField();
          p.setBackground(Color.lightGray);
          b = new JButton("LOGIN");
          b.setBackground(Color.cyan);
          backToRegister = new JButton("Back");
          backToRegister.setBackground(Color.cyan);
          Instructions = new JButton("Instructions");
          Instructions.setBackground(Color.cyan);
          invalidUserLabel = new JLabel("");

         l.setBounds(10,50,100,20);
         l1.setBounds(10,100,100,20);
          t.setBounds(120,50,100,20);
          p.setBounds(120,100,100,20);
          b.setBounds(100,150,100,20);
          backToRegister.setBounds(10,400,70,40);
          Instructions.setBounds(350,10,150,30);
          invalidUserLabel.setBounds(230,130,250,25);


        add(l);
        add(l1);
        add(t);
        add(p);
        add(b);
        add(backToRegister);
        add(Instructions);
        add(invalidUserLabel);

        b.addActionListener(this) ;  //Login Button
            //@Override
            /*public void actionPerformed(ActionEvent e) {
                boolean match = false;
                String AppNo = t.getText().toString();
                String pwd = p.getText().toString();

                try {
                    FileReader fr = new FileReader("LoginValidation.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String line;

                    while ((line = br.readLine()) != null) {
                        if (line.equals(AppNo + "\t" + pwd)) {
                            match = true;
                            break;
                        }
                    }
                    fr.close();
                } catch (Exception e1) {
                }

                if (match) {
                    if (invalidUserLabel.getText() != null) {
                        invalidUserLabel.setText("");
                    }
                    timeDelay.start();
                    new CheckBox("DECLARATION FORM");
                    dispose();
                    //JOptionPane.showMessageDialog(successfulLogin, "Login is successful");
                } else {
                    invalidUserLabel.setText("Invalid Application Number or password");
                    JOptionPane.showMessageDialog(registerAgain, "Register Yourself \n  If not already done");
                }
            }
        }); */



        backToRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Registration("Registration Page");
                dispose();
            }
        });

        Instructions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new InstructsForStudent("Instructions");
                dispose();
            }
        });

        setLayout(null);
        setSize(600,600);
         //setLocation(100,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        boolean match = false;
        String AppNo = t.getText().toString();
        String pwd = p.getText().toString();

        try {
            FileReader fr = new FileReader("LoginValidation.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                if (line.equals(AppNo + "\t" + pwd)) {
                    match = true;
                    break;
                }
            }
            fr.close();
        } catch (Exception e1) {
        }

        if (match) {
            if (invalidUserLabel.getText() != null) {
                invalidUserLabel.setText("");
            }
            timeDelay.start();
            if (i == 100) {
                new CheckBox("DECLARATION FORM");
                dispose();}
                i++;


            //JOptionPane.showMessageDialog(successfulLogin, "Login is successful");
        } else {
            invalidUserLabel.setText("Invalid Application Number or password");
            JOptionPane.showMessageDialog(registerAgain, "Register Yourself \n  If not already done");
        }
    }

        }