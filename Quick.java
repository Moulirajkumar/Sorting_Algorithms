package sorting;

import java.util.Scanner;
public class Quick 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Main_Class.quick_Sort(arr, 0, n-1);
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		sc.close();
	}
	
}

class Main_Class
{
	public static void quick_Sort(int arr[],int l,int h)
	{
		if(l<h)
		{
			int part=partition(arr,l,h);
			quick_Sort(arr,l,part-1);
			quick_Sort(arr,part+1,h);
		}
	}
	public static int partition(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
}
