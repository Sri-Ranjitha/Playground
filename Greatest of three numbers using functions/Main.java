#include <stdio.h>
int grt(int n1,int n2)
{
  if(n1<n2)
    return n2;
  else
    return n1;
}
int main(){
	// Type your code here
  int num1,num2,num3,res1,res2;
  scanf("%d %d %d",&num1,&num2,&num3);
  res1=grt(num1,num2);
  res2=grt(res1,num3);
  printf("%d",res2);
  	return 0;
}