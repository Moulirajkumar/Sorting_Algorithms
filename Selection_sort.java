package sorting;

import java.util.Scanner;

public class Selection_sort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				int temp=arr[i];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		sc.close();
	}
}
