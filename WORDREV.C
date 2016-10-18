#include<stdio.h>
#include<conio.h>
void main()
{
char *p,str[]="This is a Sentence";
int i;
clrscr();
   p = strtok(str, " ");
   if (p)   printf("%s\t", strrev(p));

   for(i=0;i<strlen(str);i++)
   {
 p = strtok(NULL, " ");
   if (p)   printf("%s\t",strrev(p));
   }

getch();
}