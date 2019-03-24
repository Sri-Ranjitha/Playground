#include <stdio.h>
int main() {
    // Type your code here
  int rows,rowIndex,num;
  scanf("%d",&rows);
  for(rowIndex=1;rowIndex<=rows;rowIndex++)
  {
    for(num = rows - rowIndex +1;num>=1;num--)
    {
      printf("%d",num);
    }
    printf("\n");
  }
	return 0;
}