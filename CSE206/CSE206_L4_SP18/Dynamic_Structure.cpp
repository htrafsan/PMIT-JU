#include <bits/stdc++.h>
#include <stdlib.h>

using namespace std;

struct student
{
  char id[20];
  char name[20];
  int marks;
  float result;
};

void trans(struct student *a, struct student *b, struct student *c)
{
  if ((a->result) > (b->result) && (a->result) > (c->result)) {
    printf("Best result: %.2f\n", a->result);
  }
  else if ((b->result) > (a->result) && (b->result) > (c->result)) {
    printf("Best result: %.2f\n", b->result);
  }
  else {
    printf("Best result: %.2f\n", c->result);
  }

  int sum = a->marks + b->marks + c->marks;
  printf("Total marks: %d\n", sum);
}

int main()
{
  struct student *a, *b, *c;

  a = (struct student *)malloc(sizeof(struct student));
  b = (struct student *)malloc(sizeof(struct student));
  c = (struct student *)malloc(sizeof(struct student));

  scanf("%s %s %d %f", &a->id, &a->name, &a->marks, &a->result);
  scanf("%s %s %d %f", &b->id, &b->name, &b->marks, &b->result);
  scanf("%s %s %d %f", &c->id, &c->name, &c->marks, &c->result);

  trans(a, b, c);
}
