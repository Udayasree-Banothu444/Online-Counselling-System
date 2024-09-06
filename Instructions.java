import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Instructions {
    public static void main(String[] args) {
InstructsForStudent Ins = new InstructsForStudent("Instructions");

    }
}

class InstructsForStudent extends JFrame {
    JTextPane pane;
    JButton btnBack;
    InstructsForStudent(String title){
        super(title);



        btnBack = new JButton("BACK TO LOGIN");
        btnBack.setBounds(15,400,170,40);
        btnBack.setBackground(Color.cyan);
        add(btnBack);

        pane = new JTextPane();
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setBold(attributeSet, true);
        pane.setBounds(10,10,400,370);
        add(pane);
        pane.setText("IMPORTANT INSTRUCTIONS: \n\n\n1) Confidentiality of the password is Solely Student's responsibility\n2) For Security reasons, never share your password\n3) After Choice Filling, save the options manually\n4) Only Colleges from the list are participating in the Councelling, so please be mindful of it\n5) Take the print of the options saved for confirmation\n");
        pane.setFont(new Font("Agency FB",Font.BOLD,15));

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LPage("Login");
                dispose();
            }
        });


   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setLayout(null);
   setSize(600,600);
   setVisible(true);

    }
}