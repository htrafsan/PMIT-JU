#include <bits/stdc++.h>

using namespace std;

int main()
{
  int n;
  cout << "Enter the Array Size:\n";
  cin >> n;

  cout << "Enter Array Elements:\n";
  int i, j, k, l, a[n][n];

  for (i = 0; i < n; i++)
    for (j = 0; j < n; j++)
      cin >> a[i][j];

  int degree;
  cout << "Enter the Rotation degree\n";
  cin >> degree;

  int cnt = degree / 90;
  if (cnt > 4) {cnt = cnt % 4;}
  printf("%d \n", cnt);

  int temp = 0;
  switch (cnt) {
  case 1: {
    int b[n][n];
    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {b[i][j] = a[i][j];}
    }

    for (i = 0; i < n; i++) {
      for (j = i; j < n; j++) {
        temp = b[i][j];
        b[i][j] = b[j][i];
        b[j][i] = temp;
      }
    }

    for (i = 0; i < n; i++) {
      for (j = 0, k = n - 1; j < k; j++, k--) {
        temp = b[j][i];
        b[j][i] = b[k][i];
        b[k][i] = temp;
      }
    }

    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {printf("%d ", b[i][j]);}
      printf("\n");
    }
    break;
  }

  case 2: {
    for (i = n - 1; i >= 0; i--) {
      for (j = n - 1; j >= 0; j--) {printf("%d ", a[i][j]);}
      printf("\n");
    }
    break;
  }

  case 3: {
    int b[n][n];
    for (i = n - 1, k = 0; i >= 0; i--, k++) {
      for (j = n - 1, l = 0; j >= 0; j--, l++) {b[k][l] = a[i][j];}
    }

    for (i = 0; i < n; i++) {
      for (j = i; j < n; j++) {
        temp = b[i][j];
        b[i][j] = b[j][i];
        b[j][i] = temp;
      }
    }

    for (i = 0; i < n; i++) {
      for (j = 0, k = n - 1; j < k; j++, k--) {
        temp = b[j][i];
        b[j][i] = b[k][i];
        b[k][i] = temp;
      }
    }

    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {printf("%d ", b[i][j]);}
      printf("\n");
    }
    break;
  }

  case 4: {
    for (i = 0; i < n; i++) {for (j = 0; j < n; j++) {printf("%d ", a[i][j]);} printf("\n");} break;}
  }
}
