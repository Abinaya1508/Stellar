import java.util.Scanner;
public class vowel
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String S1=S.toLowerCase();
		int i,count=0;
		for(i=0;i<S.length();i++)
		{
		    if(S1.charAt(i)=='a'||S1.charAt(i)=='e'||S1.charAt(i)=='i'||S1.charAt(i)=='o'||S1.charAt(i)=='u')
		    {
		        count++;
		    }
		}
		System.out.print(count);
	}
}