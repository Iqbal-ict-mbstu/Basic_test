
package lab2;

import java.io.File;
public class FileMethod3 
{
    public static void main(String[] args) {
        File f1= new File("H:\\java File Method");
        f1.mkdir();
        System.out.println(f1.isAbsolute()?"Java file method Derictory absolute":"Java file method Derictory not absolute");
        System.out.println(f1.isDirectory()? "Java file method is Derictory " : "Java file method is not Derictory ");
        System.out.println(f1.isFile() ?"Java file method is file" : "Java file method is not file");
        System.out.println(f1.isHidden() ? "Java file method Derictory is hidden " : "Java file method Derictory is not hidden");
        System.out.println(f1.exists()?"Java file method Derictory is exists" : "Java file method Derictory is not exists");
        try{
            File f2 = new File ("H://java File Method//file Method.text");
            f2.createNewFile();
            System.out.println("");
            System.out.println(f2.isAbsolute()?"file method.text  absolute":"file method.text not absolute");
        System.out.println(f2.isDirectory()? "file method.text Derictory " : "file method.text is not Derictory ");
        System.out.println(f2.isFile() ?"file method.text is file" : "file method.text is not file");
        System.out.println(f2.isHidden() ? "file method.text is hidden " : "file method.text is not hidden");
            System.out.println(f2.exists()?"file method.text is ":"file method.text is not exists");
            System.out.println(f2.equals(f1)?"F1 and F2 are equal " : "F1 and F2 are not equal");
            System.out.println(f2.delete()?"file method.text is deleate" : "file method.text is not delete");    
        }
        catch(Exception e)
        {
            System.out.println(e);
    }
}
    
}
