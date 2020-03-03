
package lab2;

import java.io.File;
public class FileMethod2 {
    public static void main(String[] args) {
        File file = new File("H://java File");
        file.mkdir();
        try{
            File f2 = new File ("H://java File//file.text");
            f2.createNewFile();
            System.out.println("GetAbsoluteFile = " +f2.getAbsoluteFile());
            System.out.println("GetAbsolutePath = " +f2.getAbsolutePath());
            System.out.println("GetCanonicalFile = "+ f2.getCanonicalFile());
            System.out.println("GetCanonicalPath = " +f2.getCanonicalPath());
            System.out.println("GetFreeSpace = " +f2.getFreeSpace());
            System.out.println( "GetName = " +f2.getName());
            System.out.println("GetParent = " +f2.getParent());
            System.out.println( "GetParentFile = "+f2.getParentFile());
            System.out.println("GetPath = " +f2.getPath());
            System.out.println("GetTotalSpace = "+f2.getTotalSpace());
            System.out.println("GetUsableSpace = "+f2.getUsableSpace());
            System.out.println("hashCode = "+f2.hashCode());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
  
  
    
}
