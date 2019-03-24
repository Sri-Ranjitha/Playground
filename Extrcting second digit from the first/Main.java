#include <stdio.h>
int main() {
	//Type your code
  long int num;
  scanf("%ld",&num);
  while(num>=100)
  {
    num=num/10;
  }
  printf("%d",num%10);
	return 0;
}