/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.FileWriter;

/**
 *
 * @author Dell
 */
public class Writter1 {
    public static void main(String[] args) {
        try{
            FileWriter f1 = new FileWriter("H:\\ ma.text");
            f1.write("Hello,this my first java program");
            f1.close();
            
        }catch(Exception e)
        {
            System.out.println(e);
            
        }
        
    }
    
}
