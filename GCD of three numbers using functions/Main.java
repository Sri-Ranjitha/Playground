#include <stdio.h>
int gcd(int n1,int n2)
{
  int val,minval;
  if(n1<n2)
    minval=n1;
  else
    minval=n2;
  while(minval!=1)
  {
    if(n1%minval==0 && n2%minval==0)
      return minval;
    else
      minval--;
  }
}
int main() {
	//Type your code here
  int num1,num2,num3,res;
  scanf("%d %d %d",&num1,&num2,&num3);
  res=gcd(num1,num2);
  res=gcd(res,num3);
  printf("%d",res);
	return 0;
}