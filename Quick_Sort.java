package sorting;

public class Quick_Sort 
{
	public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void quick_sort(int arr[],int l,int h)
	{
		if(l<h)
		{
			int j=partition(arr,l,h);
			quick_sort(arr,l,j);
			quick_sort(arr,j+1,h);
		}
	}
	public static int partition(int arr[],int low,int high)
	{
		int pivot=arr[low];
		int i=low-1;
		int j=high+1;
		while(i<j)
		{
			do
			{
				i++;
			}while(arr[i]<pivot);
			do
			{
				j--;
			}while(arr[j]>pivot);
			if(i<j)
			{
				swap(arr,i,j);
			}
		}
		swap(arr,low,j);
		return j;
	}
}
