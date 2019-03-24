#include<stdio.h>
int square(int n)
{
  return (n*n);
}
int main() {
   // Type your code here
  int num,sq;
  scanf("%d",&num);
  sq=square(num);
  printf("%d",sq);
   return 0;
}