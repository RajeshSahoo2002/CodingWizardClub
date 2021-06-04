import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements of the array a[]:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int x=a.length;
		System.out.println("Sorting the elements in ascending order:");
		for(int i=0;i<x-1;i++)
		{
			for(int j=0;j<x-1;j++)
			{
				if(a[j+1]<a[j])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					count++;
				}
			}
		}
		for(int c=0;c<size;c++)
		{
			System.out.println(a[c]);
		}
		System.out.println("Number of minimum swaps to sort the elements in ascending is " +count);
	}
}