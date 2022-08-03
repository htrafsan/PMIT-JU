#include <bits/stdc++.h>
#include <stdlib.h>

using namespace std;

int main()
{
  int *ptr;
  ptr = (int *)malloc(10 * sizeof(int));

  int i;
  cout << "Enter inputs:\n";
  for (i = 0; i < 10; i++) {scanf("%d", ptr + i);}

  ptr = (int *)realloc(ptr, 20 * sizeof(int));
  cout << "Enter inputs for reallocate memory:\n";
  for (i = 10; i < 20; i++) {scanf("%d", ptr + i);}

  cout << "After increasing size:\n";
  for (i = 0; i < 20; i++) {printf("%d ", *(ptr + i));}
  printf("\n");

  ptr = (int *)realloc(ptr, 14 * sizeof(int));
  printf("After decreasing size:\n");
  for (i = 0; i < 14; i++) {printf("%d ", *(ptr + i));}

  return 0;
}
