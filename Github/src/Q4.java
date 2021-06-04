import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,d,square,l=0,end_No;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		n=sc.nextInt();
		square=n*n;
		d=n;
		while(d>0)
		{
			d=d/10;
			l++;
		}
		end_No=square%((int)Math.pow(10,l));
		System.out.println("The square of the number is " +square);
		if(n!=end_No)
		{
			System.out.println(n+" "+"is not an automorphic number.");
		}
		else
		{
			System.out.println(n+" "+"is an automorphic number.");
		}
	}
}