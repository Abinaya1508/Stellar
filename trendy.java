import java.util.Scanner;
public class trendy
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = n/10;
		int u = r%10;
		if(u%3==0)
		{
		    System.out.print("trendy num");
		}
		else
		{
		    System.out.print("not");
		}
	}
}
