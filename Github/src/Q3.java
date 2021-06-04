import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1=0,t2=1,t3=1,n,t4;
		System.out.println("Values of t1,t2,t3 before swapping is"+" "+t1+","+t2+","+t3);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			t4=t1+t2+t3;
			System.out.println("Next element is " +t4);
			t1=t2;
			t2=t3;
			t3=t4;
		}
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}