import java.util.*;
class revstring
{
	String s;
	revstring()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to be reversed:");
		s=sc.next();
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}
}
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revstring rs=new revstring();
	}
}