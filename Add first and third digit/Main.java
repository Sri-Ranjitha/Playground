#include<stdio.h>
int main()
{
  int num,first_digit,last_digit;
  scanf("%d",&num);
  first_digit=num/100;
  last_digit=num%10;//Type your code here
  printf("%d",first_digit + last_digit);
  return 0;
}