
package lab2;
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb1= new StringBuilder("Java is the best programing language");
        StringBuilder sb2 = new StringBuilder("now I love java");
        StringBuilder sb3 = new StringBuilder("what is your name ?");
        System.out.println("sb1 delate = "+sb1.delete(5, 8));
        System.out.println("sb2 delate = "+sb2.delete(0, 1));
        System.out.println("sb1 delateCharAt = "+sb3.deleteCharAt(9));
        System.out.println("sb1 Replace = "+sb1.replace(5, 8, "was "));
        System.out.println("sb1 Replace = "+sb3.replace(7, 8, "she "));
          System.out.println("sb1 reverse = "+sb1.reverse());
        System.out.println("sb2 reverse = "+sb3.reverse()); 
    }
}


