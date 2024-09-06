import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class StudentInfo {

    static ArrayList<String> a = new ArrayList<>();
    public static void main(String[] args) {
        DisplayOfStudentInfo StuInfo = new DisplayOfStudentInfo("Student Info");

    }
}

class DisplayOfStudentInfo extends JFrame {

    JLabel l;
    JTextField  enterAppNo;
    JLabel StuDetails;
    JButton ok;
    JLabel StuDetails1;
    JLabel StuDetails2;
    JLabel StuDetails3;
    JLabel StuDetails4;
    //JLabel StuDetails5;
    //JLabel StuDetails6;
    //JLabel StuDetails7;
    //JLabel StuDetails8;

    JButton backMainBtn;

    DisplayOfStudentInfo(String Title){
        super(Title);

        l = new JLabel("ENTER APPLICATION NUMBER : ");
        l.setBounds(30,50,200,30);
        add(l);

        enterAppNo = new JTextField();
        enterAppNo.setBounds(250,50,120,30);
        add(enterAppNo);

        ok = new JButton("OK");
        ok.setBackground(Color.CYAN);
        ok.setBounds(400,50,53,30);
        add(ok);

        backMainBtn = new JButton("BACK");
        backMainBtn.setBounds(300,350,70,30);
        backMainBtn.setBackground(Color.CYAN);
        add(backMainBtn);

        StuDetails = new JLabel("");
        StuDetails.setBounds(100,100,300,20);
        add(StuDetails);

        StuDetails1 = new JLabel("");
        StuDetails1.setBounds(100,150,300,20);
        add(StuDetails1);

        StuDetails2 = new JLabel("");
        StuDetails2.setBounds(100,200,300,20);
        add(StuDetails2);

        StuDetails3 = new JLabel("");
        StuDetails3.setBounds(100,250,370,20);
        add(StuDetails3);

        StuDetails4 = new JLabel("");
        StuDetails4.setBounds(100,300,300,20);
        add(StuDetails4);

        /*StuDetails5 = new JLabel();
        StuDetails5.setBounds(100,350,300,30);
        add(StuDetails5);*/

        /*StuDetails6 = new JLabel("");
        StuDetails6.setBounds(100,350,300,30);
        add(StuDetails6);*/


        backMainBtn.addActionListener(new ActionListener() {
            @Override
           public void actionPerformed(ActionEvent e) {
                new Action("MAIN PAGE");
                dispose();
            }
        });

         ok.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

        try {
        FileReader fr1 = new FileReader("StudentInfo.txt");
        BufferedReader br1 = new BufferedReader(fr1);
            String line;

            while ((line = br1.readLine()) != null) {
                if (line.contains( enterAppNo.getText()+ "\t")) {
                    //match = true;
                    String str = line;
                    String[] arrStr = str.split("\t");
                    StuDetails.setText("Registered Email : "+enterAppNo.getText()+"@gmail.com");
                   StuDetails1.setText("Date of Birth : "+ arrStr[2]);
                    StuDetails2.setText("Nationality : INDIAN");
                   StuDetails3.setText("JEE(MAIN) B.E/B.TECH Rank (Open Category) : 2170");
                   StuDetails4.setText("                              JEE ADVANCED : 2396");
                 // StuDetails5.setText("Person with Disability : NO");
                   //StuDetails6.setText("Registered Email : "+enterAppNo.getText()+"@gmail.com");

                    break;
                }
            }
            fr1.close();
        } catch (Exception e1) {
        }

             }
         });




        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}