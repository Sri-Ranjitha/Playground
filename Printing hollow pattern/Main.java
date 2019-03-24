#include <stdio.h>
int main() {
	// Type your code here
  int rows,rowIndex,spaces,starCount;
  scanf("%d",&rows);
  for(rowIndex=1;rowIndex<=rows;rowIndex++)
  {
    if(rowIndex==1 || rowIndex==rows)
    {
      for(starCount=1;starCount<=rows;starCount++)
      {
        printf("*");
      }
    }
    else
    {
      for(starCount=1;starCount<=rows;starCount++)
      {
        if(starCount==1 || starCount==rows)
        {
          printf("*");
        }
        else
        {
          printf(" ");
        }
      }
    }
    printf("\n");
  }
	return 0;
}