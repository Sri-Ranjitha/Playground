#include <stdio.h>
int main(){
	// Type your code here
  int rows,starCount,rowIndex,f=0;
  scanf("%d",&rows);
  for(rowIndex=1;rowIndex<=rows;rowIndex++)
  {
    for(starCount=1;starCount<=rowIndex;starCount++)
    {
     if(f==0)
     {
       printf("*");
       f=1;
     }
      else
      {
        printf("#");
        f=0;
      }
    }
    printf("\n");
  }
  	return 0;
}