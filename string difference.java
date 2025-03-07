import java.util.Scanner;
class fake{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String s = sc.nextLine();
        System.out.println("enter the second string");
        String v = sc.nextLine();
        int ascii =0;
        for(int i = 0; i < s.length() ; i++){
        if(v.charAt(i) != s.charAt(i)){
            ascii = (int)v.charAt(i) - (int) s.charAt(i);
        }
    }
        
        System.out.println(ascii);
    }
}

        


