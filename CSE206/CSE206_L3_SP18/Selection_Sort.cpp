#include <bits/stdc++.h>

using namespace std;

int main()
{
  int a[100];
  int i, n, k, temp;

  cout << "Enter the number of elements to be sorted:\n";
  cin >> n;

  cout << "Enter the array elements:\n";
  for (i = 0; i < n; ++i) {cin >> a[i];}

  for (k = 0; k < n; ++k) {
    for (i = k + 1; i < n; ++i) {
      if (a[k] > a[i]) {
        /* To sort in descending order, change > to <. */
        temp = a[k];
        a[k] = a[i];
        a[i] = temp;
      }
    }
  }

  cout << "Elements after sorted:\n";
  for (i = 0; i < n; ++i) {cout << a[i] << " ";}
  printf("\n");

  return 0;
}
