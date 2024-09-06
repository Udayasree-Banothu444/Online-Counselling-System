import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetHelp {

    public static void main(String[] args){
        CounsellingProcess loc = new CounsellingProcess("Counselling process");
    }
}
class CounsellingProcess extends JFrame{

    JTextPane JP;


    JButton BackToMainBtn;
    CounsellingProcess(String title){
        super(title);

        BackToMainBtn = new JButton("G0 T0 MAIN");
        BackToMainBtn.setBackground(Color.cyan);
        //backToMainBtn.setBounds(10,550,150,30);
        add(BackToMainBtn, BorderLayout.PAGE_END);

        JP= new JTextPane();
        SimpleAttributeSet sa = new SimpleAttributeSet();
        StyleConstants.setBold(sa, true);
        JP.setCharacterAttributes(sa, true);
        JP.setBounds(25, 20, 500, 300);
        String nl = System.lineSeparator();

        JP.setText("COUNSELLING PROCESS:" +nl+nl+
                "1. Fill out the Registration form with appropriate information"+nl+nl+"2. Login to the page using application number and password"+nl+nl+"3. Choose any option from the MainPage"+nl+nl+"4. If Display of StudentInfo is choosen, you can view your data"+nl+nl+"5. If Display of Colleges is chosen, you can view the list of colleges participating in Counselling process"+nl+nl+"6. If select the colleges is choosen, You can select the college of your preference"+nl+nl+"7. After the selection of colleges, You can save the options"+nl+nl+"8. By clicking on print choices, You can print all the choices you have selected" );
        JP.setBackground(Color.white);
        JP.setFont(new Font("Agency FB", Font.BOLD,15));
        add(JP);
        revalidate();

        BackToMainBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Action("MAIN PAGE");
                dispose();
            }
        });

        setSize(650, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // setLocationRelativeTo(null);
        setVisible(true);
    }
}
