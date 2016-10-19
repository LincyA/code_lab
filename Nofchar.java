import java.util.*;
import java.lang.*;
import java.io.*;
class Nofchar
{
	public static void main (String[] args) throws java.lang.Exception
	{

       String str="aabcbdd";
       String a[]=new String[14];
       int i,j,k=0,count;
       for(i=0;i<str.length();i++)
       {
           count=1;
           for(j=0;j<str.length();j++)
           {
               if(i==j)
               {
                   continue;
               }else if(str.charAt(i)==str.charAt(j))
               {
               count++;
               }
           }
               a[k]=Character.toString(str.charAt(i));
               a[k+1]=Integer.toString(count);
               k=k+2;
                }
       for(j=0;j<a.length;j++)
           {
       System.out.println(a[j]);
           }

	}
}
