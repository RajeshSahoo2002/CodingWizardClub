import java.util.*;
class inverse_count
{
	int inverse_count=0,size;
	inverse_count()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size=sc.nextInt();
		int a[]=new int[size];
		//System.out.println("Enter the elements of the array a[]:");
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the element"+" "+(i+1)+" "+"of array a[]:");
			Scanner in=new Scanner(System.in);
			a[i]=in.nextInt();
		}
		int x=a.length;
		for(int i=0;i<x-1;i++)
		{
			for(int j=i+1;j<x;j++)
			{
				if(a[i]>a[j])
				{
					System.out.println("The pairs are"+" "+(a[i]+","+a[j]));
					inverse_count++;
				}
				else
				{
					System.out.println(0);
				}
			}
		}
		System.out.println("Number of pairs of inversions is " +inverse_count);
	}
}
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inverse_count ic=new inverse_count();
	}
}