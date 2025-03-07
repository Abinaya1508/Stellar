import java.util.Scanner;
public class luckynum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = n%10;
		if(x==3 || x==8)
		{
		    System.out.println("Lucky winner");
		}
		else
		{
		    System.out.println("Not a Lucky winner");
		}
	}
}
