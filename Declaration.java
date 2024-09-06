import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Declaration {
    public static void main(String[] args) {
        CheckBox jf = new CheckBox("DECLARATION FORM");
    }
}
class CheckBox extends JFrame implements ActionListener {
    // JFrame fr;
    JCheckBox cb1;
    // JTextArea ta;
    JTextPane jp;
    JLabel l;
    //JButton jb;
    //JProgressBar  pb;
    // Timer  t = new Timer(50,this);
    int i ;
    CheckBox(String title) {
        //fr = new JFrame();
        //  fr.setLayout(null);
        //fr.setSize(500, 500);
        super(title);
        i = 0;
        jp = new JTextPane();
        jp.setBackground(Color.white);
        SimpleAttributeSet sa = new SimpleAttributeSet();
        StyleConstants.setBold(sa, true);
        jp.setCharacterAttributes(sa, true);
        jp.setBounds(25, 20, 500, 150);

        jp.setText("I hereby declare that all the above statements made by me are true and correct to the best of our knowledge and belief. I also understand that in case it is detected at any stage of counselling that I do not fulfill the eligibility criteria and/or that the information furnished by me is incorrect/false, the candidature of the applicant(i.e.,me) will stand cancelled, irrespective of the result of the examination. If any of these shortcoming(s) is/are detected even after the candidate's allotment, his/her seat in respective college is liable to be terminated.");
        add(jp);
        revalidate();


        l = new JLabel("");

        cb1 = new JCheckBox(" I Agree");
        cb1.setBackground(Color.cyan);
        cb1.setBounds(100, 350, 80, 20);
        add(cb1);


        cb1.addActionListener(this);

                /*ta = new JTextArea();
                ta.setBounds(120, 350, 20, 20);
                add(ta);*/
        l.setBounds(165, 275, 200, 25);
        add(l);

                /*pb  = new JProgressBar(0,20);
                pb.setBounds(500,500,120,50);
                add(pb); */


                /*jb = new JButton("Submit");
                jb.addActionListener(this);

                jb.setBounds(160, 600, 5, 5);
                add(jb);*/
        setVisible(true);

        setSize(650, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {

        if (cb1.isSelected())
            l.setText(l.getText() + "\n" + "I have agreed to the conditions");

        new Action("MAIN PAGE");
        dispose();


    }

}
