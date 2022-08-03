#include <bits/stdc++.h>

using namespace std;

int main() {
  int i, j, a[10][10];

  for (i = 0; i < 3; i++)
    for (j = 0; j < 3; j++)
      cin >> a[i][j];

  int b[10][10];

  for (i = 0; i < 3; i++) {
    for (j = 0; j < 3; j++) {
      b[i][j] = a[j][i];
      printf("%d ", b[i][j]);
    }
    printf("\n");
  }

  return 0;
}
