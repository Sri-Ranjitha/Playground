#include <stdio.h>
int main() {
	//Type your code
  int num,fact=1,i,rem,sum=0,t;
  scanf("%d",&num);
  t=num;
  while(num>0)
  {
    rem=num%10;
  	for(i=1,fact=1;i<=rem;i++)
  	{
    	fact=fact*i;
  	}
  	sum=sum+fact;
    num=num/10;
  }
  if(sum==t)
    printf("Yes");
  else
    printf("No");
	return 0;
}