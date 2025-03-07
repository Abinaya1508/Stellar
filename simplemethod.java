import java.util.Scanner;
public class simplemethod
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int i,a,b,add,mul;
		for(i=n1;i<n2;i++)
		{
		    a=i%10;
		    b=i/10;
		    add=a+b;
		    mul=a*b;
		    if(add+mul==i)
		    {
		        System.out.print(i+" ");
		    }
		}
	}
}
