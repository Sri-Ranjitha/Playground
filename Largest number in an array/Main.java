#include<stdio.h>
int main()
{
  //fill the code
  int arr_size, arr[10], i,found=0;
  scanf("%d",&arr_size);
  for(i=0;i<arr_size;i++)
    scanf("%d",&arr[i]);
  for(i=0;i<arr_size;i++)
  {
    if(arr[i]>found)
    {
      found=arr[i];
    }
  }
  printf("%d",found);
  return 0;
}