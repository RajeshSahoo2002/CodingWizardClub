import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows,cols;
		String ascending,descending,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		rows=sc.nextInt();
		System.out.println("Enter the number of coloumns:");
		cols=sc.nextInt();
		int a[][]=new int[rows][cols];
		System.out.println("Enter the elements of the array a[]:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display the original matrix:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter the choice of the user:");
		choice=sc.next();
		switch(choice)
		{
		case "ascending":
			for(int i=0; i<rows; i++) {
				for(int j=0; j<cols; j++) {
					for(int m=0; m<rows; m++) {
						for(int n=0; n<cols; n++) {
							if(a[i][j]<a[m][n]) {
								int temp = a[i][j];
								a[i][j] = a[m][n];
								a[m][n] = temp;
							}
						}
					}
				}
			}
			for(int i=0; i<rows; i++) {
				for(int j=0; j<cols; j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			break;
		case "descending":
			for(int i=0; i<rows; i++) {
				for(int j=0; j<cols; j++) {
					for(int m=0; m<rows; m++) {
						for(int n=0; n<cols; n++) {
							if(a[i][j]>a[m][n]) {
								int temp = a[i][j];
								a[i][j] = a[m][n];
								a[m][n] = temp;
							}
						}
					}
				}
			}
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		break;
		default: System.out.println("Not available");
		}
	}
}
