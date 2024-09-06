import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListOfColleges {

    public static void main(String[] args){
        OrderListCollege  loc = new OrderListCollege("List Of Colleges");
    }
}
class OrderListCollege extends JFrame{

    JTextPane JP;
    JButton backToMainBtn;
    OrderListCollege(String title){
        super(title);

        backToMainBtn = new JButton("G0 T0 MAIN");
        backToMainBtn.setBackground(Color.CYAN);
        //backToMainBtn.setBounds(10,550,150,30);
        add(backToMainBtn,BorderLayout.PAGE_END);


        JP= new JTextPane();
        SimpleAttributeSet sa = new SimpleAttributeSet();
        StyleConstants.setBold(sa, true);
        JP.setCharacterAttributes(sa, true);
        //JP.setBounds(15, 10, 500, 10);


        JP.setText("LIST OF IIT'S PARTICIPATING:\tLIST OF NIT'S PARTICIPATING:\tLIST OF IIIT'S PARTICIPATING: \n\nIIT MADRAS \t\t\tNIT WARANGAL\t\tIIIT ALLAHABAD\n IIT DELHI\t\t\tNIT TRICHY\t\t\tIIIT HYDERABAD\n IIT BOMBAY\t\t\tNIT KARNATAKA\t\tIIIT GWALIOR\n IIT KANPUR\t\t\tNIT ROURKELA\t\tIIIT BANGALORE\nIIT KHARAGPUR \t\tNIT CALICUT\t\t\tIIIT GUWAHATI\nIIT ROORKEE\t\t\tNIT NAGPUR\t\t\tIIITDM JABALPUR\nIIT GUWAHATI\t\tNIT DURGAPUR\t\tIIITDM KANCHIPURAM\nIIT HYDERABAD\t\tNIT SILCHAR\t\t\tIIIT BHUBANESHWAR\nIIT BHU\t\t\tNIT JAIPUR\t\t\tIIIT PUNE \nIIT ISM DHANBAD\t\tNIT JAIPUR\t\t\tIIIT KOTA\nIIT INDORE\t\t\tNIT ALLAHABAD\t\tIIIT SRI CITY \nIIT MANDI\t\t\tNIT KURUKSHETRA\t\tIIIT VADODARA\nIIT ROPAR\t\t\tNIT JALANDAR\t\tIIIT NAGPUR \nIIT GANDHINAGAR\t\tNIT SURAT\t\t\tIIIT KALYANI\nIIT JODHPUR\t\t\tNIT MEGHALAYA\t\tIIIT LUCKNOW \nIIT PATNA\t\t\tNIT PATNA\t\t\tIIIT DHARWAD \nIIT BHBANESHWAR\t\tNIT RAIPUR\t\t\tIIIT BHAGALPUR \nIIT TIRUPATI\t\t\tNIT SRINAGAR\t\tIIIT BHOPAL \nIIT PALAKKAD \t\tNIT BHOPAL\t\t\tIIIT KOTTAYAM\nIIT JAMMU\t\t\tNIT AGARTALA\t\tIIIT RANCHI \nIIT DHARWAD\t\t\tNIT GOA\t\t\tIIIT UNA \nIIT BHILAI\t\t\tNIT JAMSHEDPUR\t\tIIIT SURAT" );
        JP.setFont(new Font("Agency FB",Font.BOLD,10));
        add(JP);
        //revalidate();

        backToMainBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Action("MAIN PAGE");
                dispose();
            }
        });

        setSize(650, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        setVisible(true);

    }


}

