import java.util.Scanner;
public class triangle
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		int N3 = sc.nextInt();
		if(N1+N2+N3==180)
		{
		    if((N1==90)||(N2==90)||(N3==90))
		    {
		        System.out.print("Prize 2");
		    }
		    else if((N1==N2)&&(N2==N3)&&(N3==N1))
		    {
		        System.out.print("Prize 3");
		    }
		    else if((N1!=N2)&&(N2!=N3)&&(N3!=N1))
		    {
		        System.out.print("Prize 1");
		    }
		    
		}
		else 
		{
		    System.out.print("Invalid");
		}
	}
}
