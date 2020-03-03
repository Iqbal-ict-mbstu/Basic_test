
package lab2;


public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str =new StringBuffer ("Mawlana bhashani scince and technology university");
        StringBuffer str1 = new StringBuffer(" ICT is the best");
        System.out.println("Str length = "+str.length());
        System.out.println("str.capacity = "+str.capacity());
        System.out.println("str charAt = "+str.charAt(21));
        System.out.println("Str1 length = "+str1.length());
        System.out.println("str1.capacity = "+str1.capacity());
        System.out.println("str1 charAt = "+str1.charAt(12));
          System.out.println("str insert  all the dept =  "+str.insert(49, " all the dept "));
        System.out.println("str appand str1 = "+str.append(str1));
    }
    
}
