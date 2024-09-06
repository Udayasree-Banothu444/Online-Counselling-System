import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

public class SaveOptions extends JFrame implements ActionListener{

    SaveClgList l;

    static ArrayList<String> saveClg = new ArrayList<>();
    JTextArea showChoiceTA;
    JButton saveBtn ;

    JButton bck;

    //JLabel AppNoSSO; //Application no. for show saved options
    //JTextField AppNo;

    int i ;
    SaveOptions(String title){
        super(title);

        i=0;

        bck = new JButton("Back");
        bck.setBounds(470,500,72,30);
        bck.setBackground(Color.CYAN);
        add(bck);

        saveBtn = new JButton("Show Saved Options");
        saveBtn.setBounds(200,30,180,50);
        saveBtn.setBackground(Color.CYAN);
        add(saveBtn);


        /*AppNoSSO = new JLabel("Application Number");
        AppNoSSO.setBounds(70,30,150,30);
        add(AppNoSSO);

        AppNo = new JTextField();
        AppNo.setBounds(200,30,170,30);
        add(AppNo);*/

        showChoiceTA = new JTextArea();
        // showChoiceTA.setText("Hello student, happy counselling");
        /*for (String key : clgType.StdClg.keySet()) {
          showChoiceTA.append(clgType.StdClg.get(key)+"\n");
        }*/
        /*for (Map.Entry<String, String> set :
        clgType.StdClg.entrySet()) {
            showChoiceTA.setText(set.getKey() +","+set.getValue());
        }*/



        showChoiceTA.setBounds(80,100,400,360);
        add(showChoiceTA);


        saveBtn.addActionListener(this);

        bck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Action("MAIN PAGE");
                dispose();
            }
        });

        setLayout(null);
        setSize(600,600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){


       /* for (Map.Entry<String, String> set :
                clgType.StdClg.entrySet()) {
            showChoiceTA.setText(set.getKey() +","+set.getValue());
        }*/

        String text = "";
        for (int i =0;i< StudentInfo.a.size();i++){
            text += StudentInfo.a.get(i)+"\n";
            showChoiceTA.setText(text);
        }
        /*try {
            FileReader fr1 = new FileReader("CollegeChoices.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            String line;

            while ((line = br1.readLine()) != null) {
                //if (line.contains(AppNo.getText() + "\t")) {
                    //match = true;
                    String str = line;
                    String[] arrStr = str.split("\t");
                    while(arrStr[i] != null){
                    showChoiceTA.setText(arrStr[i]);
                    i++;
                    }
                    // }
                //}
            }
            fr1.close();
        } catch (Exception e1) {
        }
        try {
            PrintWriter pw = new PrintWriter("CollegeChoices.txt");
            pw.close();
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }*/

    }


    public static void main(String[] args) {
        // BranchList.listClgBrnch();
        SaveOptions sO = new SaveOptions("Saved Choices");
    }
}