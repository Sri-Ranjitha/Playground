#include <stdio.h>
int main() {
	// Type your code here
  int rows,rowIndex,spaces,num=1,i;
  scanf("%d",&rows);
  for(rowIndex=1;rowIndex<=rows;rowIndex++)
  {
    for(spaces=1;spaces<=rows-rowIndex;spaces++)
    {
      printf(" ");
    }
    for(i=1;i<=rowIndex;i++)
    {
      printf("%d ",num);
      num++;
    }
    printf("\n");
  }
	return 0;
}