import java.util.*;
import java.lang.*;
import java.io.*;


class arraytrav
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int i,j,k,arr1[],max[],m;
		int arr[]=new int[6];
		max[]=new int[6];
		arr1[]=new int[5];
		arr[]={8,4,1,9,6,2};
		for(i=0;i<6;i++)
		{
		    k=0;
		    for(j=0;j<6;j++)
		    {
		        if(i==j)
		        {
		            continue;
		        }
		        if(arr[i]<arr[j])
		        {
		            arr1[k]=arr[j];
		            k++;
		        }}
		         m=arr1[0];
		        for(l=1;l<5;l++)
		        {
		            k=0;
		            if(arr[l]!=0)
		            {
		            if(arr1[l]<m)
		            {
		              max[k]=arr[l]; 
		              k++;
		            }
		            }
		        }
		    
		    
		}
		
		for(i=0;i<6;i++)
		{
		System.out.println(max[i]);
		}
		
		
		
	}
}
