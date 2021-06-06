import java.util.*;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		. int n;
		String a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		a=Integer.toString(n);
		b=a+a;
		c=a+a+a;
		System.out.println(Integer.parseInt(a)+Integer.parseInt(b)+Integer.parseInt(c));
	}
}
