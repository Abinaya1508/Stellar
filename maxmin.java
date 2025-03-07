import java.util.Scanner;
public class maxmin
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int i,max=0,min=0;
		int a[] = new int[size];
		for(i=0;i<size;i++)
		{
		    a[i]=sc.nextInt();
		}
		max=a[0];
		for(i=1;i<size;i++)
		{
		    if(a[i]>max)
		    {
		        max=a[i];
		    }
		}
		min=a[0];
		for(i=1;i<size;i++)
		{
		    if(a[i]<min)
		    {
		        min=a[i];
		    }
		}
		System.out.print(max+" ");
		System.out.print(min);
	}
}