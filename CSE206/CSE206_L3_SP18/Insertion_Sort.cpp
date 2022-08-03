#include <bits/stdc++.h>

using namespace std;

int main()
{
  int a[20];
  int i, j, n, key;

  cout << "Enter the number of elements to be sorted:\n";
  cin >> n;

  cout << "Enter the array elements:\n";
  for (i = 0; i < n; i++) {cin >> a[i];}

  for (j = 0; j < n; j++) {
    key = a[j];
    i = j - 1;
    while (i >= 0 && a[i] > key) {
      a[i + 1] = a[i];
      i = i - 1;
    }
    a[i + 1] = key;
  }

  cout << "Elements after sorted:\n";
  for (i = 0; i < n; i++) {cout << a[i] << " ";}
  printf("\n");
  
  return 0;
}
