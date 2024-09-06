import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IITS {
    public static void main(String[] args) {
        IITList iitList = new IITList("IIT'S");
    }
}
class IITList extends JFrame {

      JButton go;
    IITList(String title) {
        super(title);


        go = new JButton("\uF0DF");
        go.setBackground(Color.cyan);
        go.setBounds(10,480,53,30);
        add(go);
        // create a combo box
        String[] items = {"IIT DELHI", "IIT ROORKEE", "IIT KHARAGPUR", "IIT BOMBAY", "IIT KANPUR", "IIT MADRAS", "IIT GUWAHATI", "IIT HYDERABAD", "IIT INDORE", "IIT GANDHINAGAR", "IIT PATNA",
                "IIT JODHPUR", "IIT MANDI", "IIT ROPAR", "IIT BHUBANESHWAR", "IIT TURUPATI", "IIT GOA", "IIT BHILAI", "IIT JAMMU", "IIT DHARWAD", "IIT PALAKKAD", "IIT VARANASI", "IIT DHANBAD"
        };
        JComboBox comboBox = new JComboBox(items);
        comboBox.setFont(new Font("Agency FB", Font.BOLD,15));
        comboBox.setEditable(true);

// create a list with the same data model
        final JList list = new JList(comboBox.getModel());


        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new clgType("COLLEGE TYPE");
                dispose();
            }
        });

       /*Object[] selection = list.getSelectedValues();
        for (Object o : selection) {
            if(selection != comboBox.getSelectedItem()){
                comboBox.setSelectedItem(o);
            }
        }*/
        // create a button; when it's pressed, print out
        // the selection in the list
        JButton scBtn = new JButton("SELECT COLLEGE");
        scBtn.setBackground(Color.cyan);

        scBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Object[] selection = list.getSelectedValues();
                System.out.println("-----");
                for (Object o : selection) {
                    //clgType.StdClg.get(LPage.t.getText()).add(String.valueOf(o));
                    System.out.println(o);
                    clgType.clg = o.toString();
                    new BranchList("BRANCH");
                    dispose();
                }

            }
        });

        // put the controls the content pane
        Container c = getContentPane();  // unnecessary  in 5.0+
        JPanel comboPanel = new JPanel();
        comboPanel.setBackground(Color.cyan);
        comboPanel.add(comboBox);
        c.add(comboPanel, BorderLayout.NORTH);
        c.add(new JScrollPane(list), BorderLayout.CENTER);
        c.add(scBtn, BorderLayout.SOUTH);

        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
