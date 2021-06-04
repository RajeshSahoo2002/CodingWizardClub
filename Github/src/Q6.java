import java.util.*;
public class Q6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements of the array a[]:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		max=a[0];
		for(int i=0;i<size;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum  number among the entered elements is " +max);
	}
}