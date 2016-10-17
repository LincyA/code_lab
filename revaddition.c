#include <stdio.h>
int main(void) {
	int n1,n2,sum,rev1,rev2,srev;
	scanf("%d\n%d",&n1,&n2);
	rev1=reverse(n1);
	rev2=reverse(n2);
	sum=rev1+rev2;
	srev=reverse(sum);
	printf("%d",srev);
	return 0;
}

int reverse(int n)
{
    int rev=0,digit;
    while(n>0)
		{
		    digit=n%10;
		    rev=(rev*10)+digit;
		    n=n/10;    
		}
		return rev;
}
