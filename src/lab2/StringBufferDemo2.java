
package lab2;

public class StringBufferDemo2 {
    public static void main(String[] args) {
        StringBuffer sb1= new StringBuffer("Java is a programing language ");
        StringBuffer sb2 = new StringBuffer("I love java");
        StringBuffer sb3 = new StringBuffer("who is he ?");
        System.out.println("sb1 delate = "+sb1.delete(5, 8));
        System.out.println("sb2 delate = "+sb2.delete(0, 1));
        System.out.println("sb1 delateCharAt = "+sb3.deleteCharAt(9));
        System.out.println("sb1 Replace = "+sb1.replace(5, 8, "was "));
        System.out.println("sb1 Replace = "+sb3.replace(7, 8, "she "));
          System.out.println("sb1 reverse = "+sb1.reverse());
        System.out.println("sb2 reverse = "+sb3.reverse()); 
    }
    
}
