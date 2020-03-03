
package lab2;


import java.io.FileReader;


public class FileReaderTest {
    public static void main(String[] args) {
        try{
            try (FileReader fr = new FileReader("H:\\Iqbal.text")) {
                int i;
                while(( i = fr.read())!=-1)
                    System.out.print((char)i);
                System.out.println();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
