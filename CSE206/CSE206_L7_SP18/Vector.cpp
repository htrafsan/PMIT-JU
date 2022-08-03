#include <iostream>
#include <vector>

using namespace std;

int main()
{
  vector<int> v;
  for (int i = 1; i <= 7; i++) {v.push_back(i);}

  vector<int>::iterator i;
  for (i = v.end() - 1; i != v.begin() - 1; i--) {cout << *i << " ";}
  cout << endl;

  for (int i = 1; i <= 5; i++) {
    int n = 0;
    cin >> n;
    v.push_back(n);
  }

  int c = 0, d = v.size() - 1, temp = 0;
  while (c < d) {
    temp = v[c];
    v[c] = v[d];
    v[d] = temp;
    c++;
    d--;
  }

  for (i = v.begin(); i != v.end(); i++) {cout << *i << " ";} cout << endl;
  for (int i = 1; i <= 3; i++) {v.erase(v.begin() + 6);}
  for (i = v.end() - 1; i != v.begin() - 1; i--) {cout << *i << " ";}

  return 0;
}
