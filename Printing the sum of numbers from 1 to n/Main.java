#include <stdio.h>
int main() {
	//Type your code
  int num,sum;
  scanf("%d",&num);
  for(sum=0;num>=1;num--)
  {
    sum=sum+num;
  }
  printf("%d",sum);
	return 0;
}