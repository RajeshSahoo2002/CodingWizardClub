import java.util.*;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		res=n+n*n+n*n*n;
		System.out.println("Value of n+n*n+n*n*n is " +res);
	}
}