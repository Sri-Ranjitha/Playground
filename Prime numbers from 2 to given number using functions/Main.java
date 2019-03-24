#include<stdio.h>
int check_prime(int p)
{
  int i,count=0;
  for(i=1;i<=p;i++)
  {
    if(p%i==0)
      count++;
  }
  if(count==2)
    return p;
  else
    return -1;
}
int main(){
    // Type your code here
  int num,i,p;
  scanf("%d",&num);
  for(i=2;i<=num;i++)
  {
    p=check_prime(i);
    if(p!=-1)
       printf("%d\n",p);
  }
    return 0;
}