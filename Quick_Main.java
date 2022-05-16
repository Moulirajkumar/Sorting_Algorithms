package sorting;

import java.util.Scanner;
public class Quick_Main extends Quick_Sort
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Quick_Sort.quick_sort(arr, 0, arr.length-1);
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		sc.close();
	}

}
