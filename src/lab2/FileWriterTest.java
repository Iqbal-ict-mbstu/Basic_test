

package lab2;

import java.io.FileWriter;


public class FileWriterTest {
    public static void main(String[] args) {
         try{
             try (FileWriter fw = new FileWriter("H:\\Iqbal.text")) {
                 fw .write("Hello,this is my first java program");
             }
}
    catch(Exception e ){
            System.out.println(e);
    }
    }
            
    
}
