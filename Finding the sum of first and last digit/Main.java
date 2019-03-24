#include <stdio.h>
int main() {
	//Type your code
  long int num;
  int first_digit,last_digit;
  scanf("%ld",&num);
  last_digit=num%10;
  while(num>0)
  {
    first_digit=num%10;
    num=num/10;
  }
  printf("%d",first_digit+last_digit);
	return 0;
}