import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IIITS {

    public static void main(String[] args) {
        IIITList iiitlist = new IIITList("IIIT'S");
    }
}

class IIITList extends JFrame {

    JButton go;
    IIITList(String title) {
        super(title);


        go = new JButton("\uF0DF");
        go.setBackground(Color.cyan);
        go.setBounds(10,480,53,30);
        add(go);

        // create a combo box
        String[] items = {"IIIT ALLAHABAD", "IIIT KANCHEPURAM", "IIIT VADODARA", "IIIT KOTA", "IIIT LUCKNOW", "IIIT BHAGALPUR",
                "IIIT BHOPAL", "IIIT DHARWAD", "IIIT DELHI", "IIIT UNA", "IIIT SURAT", "IIIT KOTTAYAM", "IIIT BANGALORE",
                "IIIT MANIPUR", "IIIT NAGPUR", "IIIT KURNOOL", "IIIT RANCHI", "IIIT KALYANI", "IIIT SRI CITY", "IIIT JABALPUR",
                "IIIT GUWAHATI", "IIIT PUNE"};
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




        // create a button; when it's pressed, print out
        // the selection in the list
        JButton button = new JButton("SELECT COLLEGE");
        button.setBackground(Color.cyan);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Object[] selection = list.getSelectedValues();
                System.out.println("-----");
                for (Object o : selection) {
                    System.out.println(o);
                    clgType.clg = o.toString();
             //clgType.StdClg.get(LPage.t.getText()).add(String.valueOf(o));
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
        c.add(button, BorderLayout.SOUTH);

        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
