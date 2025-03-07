import java.util.Scanner;
public class boolean
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]=new int[size];
		int i,j;
		for(i=0;i<size;i++)
		{
		    arr[i]=sc.nextInt();
		}
		boolean visited[]=new boolean[size];
		for(i=0;i<size;i++)
		{
		    if(visited[i]==true)
		    {
		        continue;
		    }
		    int count = 1;
		    for(j=i+1;j<size;j++)
		    {
		        if(arr[i]==arr[j])
		        {
		            visited[j]=true;
		            count++;
		        }
		    }
		    System.out.println(arr[i]+" "+count);
		}
	}
}