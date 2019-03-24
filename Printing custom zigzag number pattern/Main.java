#include <stdio.h>
int main() {
	// Type your code here
  int rows,rowIndex,num;
  scanf("%d",&rows);
  for(rowIndex=1;rowIndex<=rows;rowIndex++)
  {
    if(rowIndex%2==1)
    {
      for(num=1;num<rows;num++)
      {
        printf("%d",rowIndex);
      }
      printf("%d",rowIndex+1);
    }
    else
    {
      printf("%d",rowIndex+1);
      for(num=1;num<rows;num++)
      {
        printf("%d",rowIndex);
      }
    }
    printf("\n");
  }
	return 0;
}