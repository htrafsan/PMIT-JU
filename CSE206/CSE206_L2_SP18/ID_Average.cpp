#include <bits/stdc++.h>

using namespace std;

struct student
{
  int id;
  float cgpa;
};

int main()
{
  struct student a, b, c;

  scanf("%d %f", &a.id, &a.cgpa);
  scanf("%d %f", &b.id, &b.cgpa);
  scanf("%d %f", &c.id, &c.cgpa);

  if (a.cgpa > b.cgpa && a.cgpa > c.cgpa) {printf("%d\n", a.id);}
  else if (b.cgpa > a.cgpa && b.cgpa > c.cgpa) {printf("%d\n", b.id);}
  else {printf("%d\n", c.id);}

  float sum = a.cgpa + b.cgpa + c.cgpa;
  float avg = sum / 3;
  printf("%.2f\n", avg);

  return 0;
}
