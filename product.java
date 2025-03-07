import java.util.Scanner;
public class product
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]= new int[size];
		int i,pro=1;
		for(i=0;i<size;i++)
		{
		    arr[i]=sc.nextInt();
		    pro=pro*arr[i];
		}
		System.out.print(pro);
	}
}
