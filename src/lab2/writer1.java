
package lab2;

import java.io.FileWriter;
public class writer1 {
    public static void main(String[] args) {
        try{
    FileWriter fw = new FileWriter("H:\\Iqbal.text");
    fw .write("My name is iqbal hossen");
    fw.close();
}
    catch(Exception e ){
            System.out.println(e);
    }
    
}
    
}
