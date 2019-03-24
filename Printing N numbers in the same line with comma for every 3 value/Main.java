#include <stdio.h>
int main() {
	//Type your code
  int n,count;
  scanf("%d",&n);
  for(count=1;count<=n;count++)
  {
    if(count%3==0)
    {
      printf("%d,",count);
    }
    else
    {
      printf("%d",count);
    }
  }
	return 0;
}