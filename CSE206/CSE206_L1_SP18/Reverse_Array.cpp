#include <bits/stdc++.h>

using namespace std;

int main()
{
  int arr[100];
  int n, i, temp, end;

  cout << "How many numbers do you want to reverse?\n";
  cin >> n;
  end = n - 1;

  cout << "Enter the array elements:\n";
  for (i = 0; i < n; i++) {cin >> a[i];}

  for (i = 0; i < n; i++) {
    temp = arr[i];
    arr[i] = arr[end];
    arr[end] = temp;
    end--;
  }

  cout << "Reversed array elements are:\n";
  for (i = (n - 1); i >= 0 ; i--) {cout << arr[i]) << " ";}

  return 0;
}
