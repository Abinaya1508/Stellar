import java.util.Scanner;
public class diagonal
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
		        if(i!=j)
		        {
		            sum=sum+a[i][j];
		        }
		    }
		}
		System.out.print(sum);
	}
}