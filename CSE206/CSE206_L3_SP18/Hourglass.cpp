#include <bits/stdc++.h>

using namespace std;

int main()
{
  int a[10][10];
  int i, j, maxSum = -36985247;

  for (i = 0; i < 6; i++)
    for (j = 0; j < 6; j++)
      cin >> a[i][j];

  for (i = 0; i < 6; i++) {
    for (j = 0; j < 6; j++) {
      if ((j + 2) < 6 && (i + 2) < 6) {
        int sum = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1]
              + a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2];
              
        if (sum > maxSum) {
          maxSum = sum;
        }
      }
    }
  }

  cout << maxSum << endl;
  
  return 0;
}
