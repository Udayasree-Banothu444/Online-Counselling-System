import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.util.ArrayList;


public class BranchList extends JFrame{

    public static JList clgList;
    JButton goBackToClgType;
    static String s ;

    public static ArrayList<String> clgBrnch = new ArrayList<>();
    //JList<String> listClg;

    BranchList(String title) {
        super(title);


        goBackToClgType = new JButton("\uF0DF");
        goBackToClgType.setBackground(Color.cyan);
        goBackToClgType.setBounds(10,480,53,30);
        add(goBackToClgType);

        // create a combo box
        String [] items = {"(CSE) COMPUTER SCIENCE ENGINEERING","(ECE) ELECTRONICS AND COMMUNICATION ENGINEERING","(EEE) ELECTRONICS AND ELECTRICAL ENGINEERING","(CIVIL) CIVIL ENGINEERING","(MECH) MECHANICAL ENGINEERING","CHEMICAL ENGINEERING","ARCHITECTURE","ENVIRONMENTAL ENGINEERING","MINING","(IT) INFORMATION TECHNOLOGY"
                ,"(BI) BUSINESS INFORMATICS","(EE) ELECTRICAL ENGINEERING","AERONAUTICAL ENGINEERING","METALLURGICAL ENGINEERING "
        };
        JComboBox comboBox = new JComboBox(items);
        comboBox.setFont(new Font("Agency FB",Font.BOLD,15));
        comboBox.setEditable(true);

        // create a list with the same data model
        final JList list = new JList(comboBox.getModel());

        // clgList = new JList()

        goBackToClgType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new clgType("COLLEGE TYPE");
                dispose();
            }
        });

        // create a button; when it's pressed, print out
        // the selection in the list
        JButton button = new JButton("SELECT BRANCH");
        button.setBackground(Color.cyan);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Object[] selection = list.getSelectedValues();
                System.out.println("-----");
                for ( Object p : selection ) {
                    System.out.println(p);
                    clgType.brch = p.toString();

                    clgType.StdClg.put(clgType.clg, clgType.brch); //hashMap
                    s = (clgType.clg+","+clgType.brch);
                    StudentInfo.a.add(s);
                   /* try {
                        File f = new File("CollegeChoices.txt");
                        FileWriter fw = new FileWriter(f, true);
                        fw.write(s+"\t");
                        fw.close();
                    } catch (Exception e) {
                    }*/

                    JOptionPane.showMessageDialog(null, "Successfully Added");
                    // listClgBrnch();
                }
            }
        });

        /*list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
              String selectedBranch =
            }
        });*/


        // put the controls the content pane
        Container c = getContentPane();  // unnecessary  in 5.0+
        JPanel comboPanel = new JPanel();
        comboPanel.add(comboBox);
        c.add(comboPanel, BorderLayout.NORTH);
        c.add(new JScrollPane(list), BorderLayout.CENTER);
        c.add(button, BorderLayout.SOUTH);

        setSize(600, 600);
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setVisible(true);
    }

    static void  listClgBrnch() {
        SaveOptions.saveClg.add(s);
    }


    public static void main(String[] args) {
        BranchList branchlist = new BranchList("BRANCH");
        //SaveClgList l = new SaveClgList(s);
    }
}


class SaveClgList{
    static ArrayList<String> SClg = new ArrayList<>();
    SaveClgList(String s){
        SClg.add(s);
    }
}