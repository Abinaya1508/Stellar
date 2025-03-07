import java.util.Scanner;
public class special
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,sum=0;
		int n=sc.nextInt();
		int a[][]= new int[n][n];
		for(i=0;i<n;i++)
		{
		    for(j=0;j<n;j++)
		    {
		        a[i][j]=sc.nextInt();
		        sum+=a[i][j]*a[i][j];
		    }
		}
		System.out.print((int) Math.sqrt(sum));
	}
}