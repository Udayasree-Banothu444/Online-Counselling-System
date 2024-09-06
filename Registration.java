import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileWriter;
import java.util.Arrays;

public class Registration extends JFrame implements ActionListener{

    // Array List for storing student data
    //ArrayList<User> user = new ArrayList<User>(15);
    int i;
    private JProgressBar p ;
    private JPanel Registration;
    private JLabel ApplicationNoLabel;

    private JTextField ApplicationNoText;
    //ApplicationNoText.setFont(new Font("Agency FB", Font.BOLD, 10));
    private JLabel SetPasswordLabel;
    private JLabel DateOfBirthLabel;
    private JPasswordField setPasswordText;
    private JLabel confirmPasswordLabel;
    private JPasswordField confirmPasswordText;
    private JButton SubmitButton;

    private JButton ClearButton;
    private JComboBox dateComboBox;
    private JComboBox monthComboBox;
    private JComboBox yearComboBox;
    private JFormattedTextField DOBFormattedText;
    private JButton NextButton;
    private JButton backBtn;
    private JTextField errorMessageText;

    private JTextField successfulRegisterText;
    public Registration(String title) {
        super(title);
        i = 0;
        //p = new JProgressBar(0,20);

        Timer t = new Timer(70, this);


        //String[] dates = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        //String[] months = { "Jan", "feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sup", "Oct", "Nov", "Dec" };
        //String[] years = {  "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008"};

       /*dateComboBox = new JComboBox(dates);
       monthComboBox = new JComboBox(months);
       yearComboBox = new JComboBox(years);
        add(dateComboBox);
        add(monthComboBox);
        add(yearComboBox); */

         /*add(ApplicationNoLabel);
         add(ApplicationNoText);
         add(setPasswordText);
         add(confirmPasswordLabel);
         add(confirmPasswordText);
         add(SetPasswordLabel);
         add(ClearButton);
         add(SubmitButton);
         add(DateOfBirthLabel);
         add(DOBFormattedText); */

       /* String appNo = ApplicationNoText.getText();
        String passwd = setPasswordText.getText();
        String dob = DOBFormattedText.getText(); */
          //this.setFont(new Font("Agency FB", Font.BOLD, 10));

         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Registration);
        this.pack();

        //setLayout(new GridLayout(5,2));
        setSize(600, 600);
        setVisible(true);


        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new wlmpage("WELCOME PAGE");
                dispose();
            }
        });

        SubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

               boolean matched = false;
                //String pwd1 = setPasswordText.getText();
                //String pwd2 = confirmPasswordText.getText();

                if (Arrays.equals(setPasswordText.getPassword(), confirmPasswordText.getPassword()) && (setPasswordText.getPassword() != null) && (confirmPasswordText.getPassword() != null)) {

                    try {
                        FileWriter fw = new FileWriter("LoginValidation.txt", true);
                        if ((setPasswordText.getPassword().length > 0) && (confirmPasswordText.getPassword().length > 0)) {
                            fw.write(ApplicationNoText.getText() + "\t" + setPasswordText.getText() + "\n");
                            fw.close();
                            matched = true;
                        } else JOptionPane.showMessageDialog(errorMessageText, "Password field is empty");
                    } catch (Exception e) {
                    }
                    if (matched) {
                        System.out.println("Added " + ApplicationNoText.getText() + "\n" + DOBFormattedText.getText());
                        JOptionPane.showMessageDialog(successfulRegisterText, "Registration is Successful");

                    try {
                        FileWriter fw1 = new FileWriter("StudentInfo.txt", true);
                        fw1.write(ApplicationNoText.getText() + "\t" + setPasswordText.getText() + "\t" + DOBFormattedText.getText() + "\n");
                        //if(ApplicationNoText.getText() != null){
                        //Student s = new Student(ApplicationNoText.getText());}
                        fw1.close();
                    } catch (Exception e) {
                    }
                }
                    }

                else{
                    JOptionPane.showMessageDialog(errorMessageText, "Password did not match !!!");
                }
            }

        });


        ClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ApplicationNoText.setText("");
                setPasswordText.setText("");
                DOBFormattedText.setText("");
                confirmPasswordText.setText("");
                dateComboBox.setSelectedItem("DD");
                monthComboBox.setSelectedItem("MM");
                yearComboBox.setSelectedItem("YYYY");
            }
        });

        NextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                t.start();
            }
        });

                //String dateValue = dateComboBox.getSelectedItem().toString();
                //String monthValue = monthComboBox.getSelectedItem().toString();
                //String yearValue = yearComboBox.getSelectedItem().toString();

                //DOBFormattedText.setText(dateValue + " " + monthValue + " " + yearValue);

                //DOBFormattedText.setVisible(true);

        dateComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (ie.getSource() == dateComboBox) {
                    String dateValue = dateComboBox.getSelectedItem().toString();
                    DOBFormattedText.setText(dateValue + " ");
                }
                }
        });
        monthComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == monthComboBox) {
                    String monthValue = monthComboBox.getSelectedItem().toString();
                    DOBFormattedText.setText(dateComboBox.getSelectedItem().toString()+" "+monthValue);
                }
            }
        });
        yearComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == yearComboBox) {
                    String yearValue = yearComboBox.getSelectedItem().toString();
                    DOBFormattedText.setText(dateComboBox.getSelectedItem().toString()+" "+monthComboBox.getSelectedItem().toString()+" "+yearValue);
                }
            }
        });


    }
    public void actionPerformed(ActionEvent e) {

        if (i == 100) {
            new LPage("Login");
            dispose();
        }
        i++;
        p.setValue(i);
    }


    public static void main(String[] args) {
        JFrame f = new Registration("Registration Page");
    }

}


class Students {
    String applicationNo;
    //String password;

    String dateOfBirth;

    Students(String applicationNo, String dateOfBirth){
        //this.password = password;
        this.applicationNo = applicationNo;
        this.dateOfBirth = dateOfBirth;
    }

}