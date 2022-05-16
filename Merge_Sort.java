package sorting;

import java.util.Scanner;
public class Merge_Sort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Main.merge_sort(arr,0,n-1);
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		sc.close();
	}

}
 class Main
 {
	 public static void merge_sort(int arr[],int low,int high)
	 {
		 if(low<high)
		 {
			 int mid=(low+high)/2;
			 int left[]=new int[mid];
			 int right[]=new int[arr.length-mid];
			 for(int x=0;x<left.length;x++)
			 {
				 left[x]=arr[x];
			 }
			 for(int y=0;y<right.length;y++)
			 {
				 right[y]=arr[mid+y];
			 }
			 merge_sort(arr,low,mid);
			 merge_sort(arr,mid+1,high);
			 merge(arr,left,right);
		 }
	 }
	 public static void merge(int arr[],int left[],int right[])
	 {
		 int i=0,j=0,k=0;
		 while(i<left.length && j<right.length)
		 {
			 if(left[i]<right[j])
			 {
				 arr[k++]=left[i++];
			 }
			 else
				 arr[k++]=right[j++];
		 }
		 while(i<left.length)
		 {
			 arr[k++]=left[i++];
		 }
		 while(j<right.length)
		 {
			 arr[k++]=right[j++];
		 }
	 }
 }