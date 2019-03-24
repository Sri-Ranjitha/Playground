#include <stdio.h>
int main() {
	//Type your code
  int num,count,t,i,rem,sum=0,pro=1;
  scanf("%d",&num);
  t=num;
  for(count=0;t>0;t=t/10)
  {
    count++;
  }
  t=num;
  while(t>0)
  {
    rem=t%10;
    for(i=1,pro=1;i<=count;i++)
    {
      pro = pro * rem;
    }
    sum=sum+pro;
    t=t/10;
  }
  if(sum==num)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}