package sorting;

import java.util.*;
public class Insertion_sort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array: ");
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		sc.close();
	}
}
