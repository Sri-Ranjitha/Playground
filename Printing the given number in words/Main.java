#include<stdio.h>
int main()
{
  //Type your code here
  int num;
  scanf("%d",&num);
  if(num<=5)
  {
    switch(num)
    {
      case 1:
        printf("One");
        break;
      case 2:
        printf("Two");
        break;
      case 3:
        printf("Three");
        break;
      case 4:
        printf("Four");
        break;
      case 5:
        printf("Five");
        break;
    }
  }
  else
  {
    printf("Invalid");
  }
  return 0;
}