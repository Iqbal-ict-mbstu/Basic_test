package lab2;
import java.io.File;
public class FileMethod1 {
    public static void main(String[] args) {
        File f1 = new File("H:\\java");
        File f3 = new File ("H:\\Basic java\\java");
        System.out.println(f1.mkdir() ? "java name Directory creat " : "java name Directory not Creat");
        try{
            File f2 = new File("H://java//java programe.text");
            System.out.println(f2.createNewFile()? "java Directory inside  Java programe.text file creat":"java Directory inside Java programe.text file is not creat");
            System.out.println(f2.canExecute()? "java Directory inside Java programe.text file Exicutable" : "java Directory inside Java programe.text file not Exicutable");
            System.out.println(f2.canRead()? "java Directory inside Java programe.text file can redable" :"java Directory inside Java programe.text file can  not redable" );
            System.out.println(f2.canWrite()?"java Directory inside Java programe.text file can Writable" : "java Directory inside Java programe.text file can not Writable");      
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
