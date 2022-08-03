#include <bits/stdc++.h>
#include <stdlib.h>

using namespace std;

void left_shift(int n, int d, int *ptr)
{
  int i, j, temp;
  for (j = 0; j < d; j++) {
    for (i = 0; i < n - 1; i++) {
      temp = ptr[i];
      ptr[i] = ptr[i + 1];
      ptr[i + 1] = temp;
    }
  }

  for (i = 0; i < n; i++) {printf("%d ", *(ptr + i));}
}

int main()
{
  int n, d, i, *ptr;
  cin >> d;
  cin >> n;
  ptr = (int *)calloc(n, sizeof(int));

  for (i = 0; i < n; i++) {scanf("%d", ptr + i);}
  left_shift(n, d, ptr);
  
  return 0;
}
