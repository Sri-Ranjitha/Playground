#include<stdio.h>
int sum(int n)
{
  return ((n*(n+1))/2);
}
int main() {
    // Type your code here
  int total,num;
  scanf("%d",&num);
  total=sum(num);
  printf("%d",total);
  	return 0;
}