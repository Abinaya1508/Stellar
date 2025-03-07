import java.util.Scanner;
public class email{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        String s = sc.next();
        int a = s.length();
        int var = a - 10;
        if(var == 0){
            System.out.println(" not valid email");
            
         }
        String b = s.substring(var , a); // Keeps only "Hello "
        String c = "@gmail.com";
       //System.out.println(b);

        

       // String n = s.replace(" ", "");
       
        if( b.equals(c)){
           System.out.println("valid email");

        }
        else{
            System.out.println("not valid");
        }
    }
}
        