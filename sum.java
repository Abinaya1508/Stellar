
    import java.util.Scanner;
public class sum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j,sum=0;
		int arr[][]=new int[n][n];
		for(i=0;i<n;i++)
		{
		    for(j=0;j<n;j++)
		    {
		        arr[i][j]=sc.nextInt();
		        sum=sum+arr[i][j];
		    }
		    //System.out.print(sum+" ");
		}
		System.out.print(sum);
	}
}
}
