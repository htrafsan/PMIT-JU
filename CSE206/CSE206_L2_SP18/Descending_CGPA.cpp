#include <bits/stdc++.h>

using namespace std;

struct student
{
  int id;
  float cgpa;
};

int main()
{
  struct student st[10], temp;
  int i, j;

  for (i = 0; i < 5; i++) {scanf("%d %f", &st[i].id, &st[i].cgpa);}

  for (i = 0; i < 5; i++) {
    for (j = 0; j < 5 - 1; j++) {
      if (st[j].cgpa < st[j + 1].cgpa) {
        temp = st[j];
        st[j] = st[j + 1];
        st[j + 1] = temp;
      }
    }
  }

  for (i = 0; i < 5; i++) {printf("%d %.2f\n", st[i].id, st[i].cgpa);}
  
  return 0;
}
