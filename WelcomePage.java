import javax.lang.model.type.NullType;
import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage {
    public static void main(String[] args)
    {
        wlmpage wp= new wlmpage("WELCOME PAGE");

    }
}
class wlmpage extends JFrame{
    wlmpage(String title){
        super(title);

        JLabel jl= new JLabel();
        SimpleAttributeSet sa = new SimpleAttributeSet();
        jl.setFont(new Font("Agency FB",Font.BOLD, 20));
        jl.setText("WELCOME TO ONLINE COUNSELLING SYSTEM");
        jl.setBounds(100, 50, 600, 50);
        add(jl);



        JLabel jl1= new JLabel(" NEW REGISTRATION");
        add(jl1);
        jl1.setBounds(50, 250,150,40);
        //jl1.setBackground(Color.black);


        JLabel jl3 = new JLabel("➨");
        add(jl3);
        jl3.setBounds(300, 250, 70,40);

        Button Bp1= new Button("REGISTRATION");
        Bp1.setBounds(400, 250, 150, 40);
        Bp1.setBackground(Color.cyan);
        add(Bp1);
        Bp1.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent ae) {
                   new Registration("Registration");
                   dispose();
            }
        });

        JLabel jl2 =new JLabel("IF REGISTERED");
        add(jl2);
        jl2.setBounds(50, 360, 150,40);


        Button Bp2 = new Button("LOGIN");
        Bp2.setBounds(400, 350, 150, 40);
        Bp2.setBackground(Color.cyan);
        add(Bp2);
        JLabel jl4 = new JLabel("➨");
        add(jl4);
        jl4.setBounds(300, 360, 70,40);
        Bp2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new LPage("LOGIN");
               dispose();
            }
        });

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        setSize(600, 600);
        setVisible(true);


    }

}
