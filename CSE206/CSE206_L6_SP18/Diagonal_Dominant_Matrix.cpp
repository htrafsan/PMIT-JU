#include <bits/stdc++.h>

using namespace std;

int main()
{
  int n;
  cin >> n;
  int a[n][n], i, j, cnt = 0, sum = 0;

  for (i = 0; i < n; i++) {
    for (j = 0; j < n; j++) {
      cin >> a[i][j];

      if (a[i][j] < 0) {a[i][j] = a[i][j] * (-1);}
      else if (i != j) {sum = sum + a[i][j];}
    }

    if (sum <= a[i][i]) {
      cnt++;
      sum = 0;
    }
  }

  if (cnt == n) {cout << "The matrix is diagonally dominant.";}
  else {cout << "The matrix is not diagonally dominant.";}

  return 0;
}
