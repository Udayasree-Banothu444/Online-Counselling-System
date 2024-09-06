import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//SELECT THE COLLEGE BUTTON
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class COLLEGETYPE {


    public static void main(String[] args) {
        clgType clg = new clgType("COLLEGE TYPE");
    }
}

class clgType extends JFrame {

     public static String clg;
     public static String brch;
   public static Map<String, String> StdClg = new HashMap<>();
    JButton GoMainPage;

    JScrollPane jsp;
    clgType(String title){
        super(title);

        GoMainPage = new JButton("\uF0DF");
        GoMainPage.setBackground(Color.cyan);
        GoMainPage.setBounds(10,480,53,30);
         add(GoMainPage);

        // create a combo box
        String [] items = {"IIT'S (Indian Institutes Of Technology)","NIT'S (National Institutes Of Technology)","IIIT'S (Indian Institutes Of Information Technology)" };
        JComboBox comboBox = new JComboBox(items);
        comboBox.setFont(new Font("Agency FB", Font.BOLD,15));
        comboBox.setEditable(true);

        // create a list with the same data model
        final JList list = new JList(comboBox.getModel());

        //Defining HashMap for saving the colleges data of the corresponding student
        //HashMap<String,Choices> SClgSave = new HashMap<String, Choices>();


        //StdClg.put(LPage.t.getText(),new ArrayList<String>());


        // create a button; when it's pressed, print out
        // the selection in the list
        JButton button = new JButton("COLLEGE TYPE");
        button.setBackground(Color.cyan);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Object[] selection = list.getSelectedValues();
                System.out.println("-----");
                for ( Object o : selection ) {
                    System.out.println(o);
                    if (o.equals("IIT'S (Indian Institutes Of Technology)")){

                        /*try {
                            FileReader fr = new FileReader("LoginValidation.txt");
                            BufferedReader br = new BufferedReader(fr);
                            String line;

                            while ((line = br.readLine()) != null) {
                                if (line.contains(LPage.t.getText()+ "\t")) {

                                    try {
                                        FileWriter fw = new FileWriter("StudentIITS.txt", true);
                                        if (fw.equals(LPage.t.getText()+"\t"+"IIT'S"))
                                        fw.write(LPage.t.getText()+"\t"+"IIT'S");
                                        fw.close();
                                    } catch (Exception e) {
                                    }


                                    break;
                                }
                            }
                            fr.close();
                        } catch (Exception e1) {
                        }*/




                        new IITList("IIT'S");
                        dispose();
                    }

                    if (o.equals("NIT'S (National Institutes Of Technology)")){
                        new NITList("NIT'S");
                        dispose();
                    }

                    if (o.equals("IIIT'S (Indian Institutes Of Information Technology)")){
                        new IIITList("IIIT'S");
                        dispose();
                    }
                }

            }
        });

        GoMainPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Action("MAIN PAGE");
                dispose();
            }
        });



        // put the controls the content pane
        Container c = getContentPane();  // unnecessary  in 5.0+
        JPanel comboPanel = new JPanel();
        comboPanel.setBackground(Color.cyan);
        comboPanel.add(comboBox);
        c.add(comboPanel,BorderLayout.NORTH);
        //list.setBounds(10,100,200,150);
        c.add(new JScrollPane(list),BorderLayout.CENTER);
            //  jsp.setBounds(60,70,300,150);
       c.add(button,BorderLayout.SOUTH);



        setSize(600, 600);
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setVisible(true);

    }
}



