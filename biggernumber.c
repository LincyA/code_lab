#include<stdio.h>
#include<conio.h>
#include<limits.h>
void main()
{
int arr[]={8,4,1,9,6,2},x,arr1[6],t,i,j;
clrscr();
for(i=0;i<6;i++)
{
arr1[i]=arr[i];
}
for(i=0;i<6;i++)
{
for(j=0;j<6;j++)
{
if(arr[i]<arr[j])
{
t=arr[i];
arr[i]=arr[j];
arr[j]=t;

}
}}
for(i=0;i<6;i++)
{
for(j=0;j<6;j++)
{
if(arr1[i]==arr[j])
{
x=j+1;
if(x>5)
{
 printf("%d--> \t",arr1[i]);
}
else
{
printf("%d-->%d\t",arr1[i],arr[x]);
}}
}}
getch();
}
