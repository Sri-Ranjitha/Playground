#include<stdio.h>
int power(int base,int exp)
{
  int i,value=1;
  for(i=1;i<=exp;i++)
  {
    value=value*base;
  }
  return value;
}
int main(){
    // Type your code here
  int base,exp,result;
  scanf("%d %d",&base,&exp);
  result=power(base,exp);
  printf("%d",result);
  	return 0;
}