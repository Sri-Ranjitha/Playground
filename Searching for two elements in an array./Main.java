#include<stdio.h>
int main()
{
  //Type your code here
  int arr_size, arr[10], search_elem_1, search_elem_2, i;
  int element_1_index=-1, element_2_index=-1;
  scanf("%d",&arr_size);
  for(i=0;i<arr_size;i++)
    scanf("%d",&arr[i]);
  scanf("%d",&search_elem_1);
  scanf("%d",&search_elem_2);
  for(i=0;i<arr_size;i++)
  {
    if(arr[i]==search_elem_1)
    {
      element_1_index=i;
    }
    else if(arr[i]==search_elem_2)
    {
      element_2_index=i;
    }
  }
  printf("%d\n%d",element_1_index,element_2_index);
  return 0;
}