import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		String ascending,descending;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the element"+" "+(i+1)+":");
			Scanner in=new Scanner(System.in);
			a[i]=in.nextInt();
		}
		System.out.println("Enter the choice of the user:");
		String z=sc.next();
		switch(z)
		{
		case "ascending":
			int p=a.length;
			for(int i=0;i<p-1;i++)
			{
				for(int j=0;j<p-i-1;j++)
				{
					if(a[j+1]<a[j])
					{
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
			System.out.println("Sorting the elements in ascending order:");
			for(int k=0;k<size;k++)
			{
				System.out.println(a[k]+" ");
			}
			break;
		case "descending":
			int q=a.length;
			for(int b=0;b<q-1;b++)
			{
				for(int c=0;c<q-b-1;c++)
				{
					if(a[c+1]>a[c])
					{
						int temp1=a[c];
						a[c]=a[c+1];
						a[c+1]=temp1;
					}
				}
			}
			System.out.println("Sorting the elements in descending order:");
			for(int e=0;e<size;e++)
			{
				System.out.println(a[e]+" ");
			}
			break;
		}
	}
}