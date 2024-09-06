import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Student {
     static String ApplicationNum;

   public Student(String ApplicationNum){
        this.ApplicationNum = LPage.t.getText();

       try {
           FileWriter fw = new FileWriter("Student.txt", true);
           try {
               FileReader fr = new FileReader("Student.txt");
               BufferedReader br = new BufferedReader(fr);
               String line;

               while ((line = br.readLine()) != null) {
                   if (!line.contains(ApplicationNum)) {
                       fw.write(ApplicationNum);
                       break;
                   }
               }
               fr.close();
           } catch (Exception e1) {
           }

           fw.close();
       } catch (Exception e) {
       }

   }

}
