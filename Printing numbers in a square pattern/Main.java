#include <stdio.h>
int main(){
	// Type your code here
  int rows,starCount,rowIndex;
  scanf("%d",&rows);
  for(rowIndex=1;rowIndex<=rows;rowIndex++)
  {
    for(starCount=1;starCount<=rows;starCount++)
    {
      printf("%d",rowIndex);
    }
    printf("\n");
  }
  	return 0;
}