#include <bits/stdc++.h>
#include <string.h>
#include <stdlib.h>

using namespace std;

typedef struct items
{
  char food_name[50];
  float food_price;
} items;

int main()
{
  items meal[50];
  int i, sum1 = 0, sum2 = 0, sum3 = 0;

  strcpy(meal[1].food_name, "Beef Burger");
  strcpy(meal[2].food_name, "Beef Cheese Burger");
  strcpy(meal[3].food_name, "Chicken Cheese Burger");
  strcpy(meal[4].food_name, "Drink");
  strcpy(meal[5].food_name, "Wedges");
  strcpy(meal[6].food_name, "Ice Cream");

  meal[1].food_price = 130;
  meal[2].food_price = 150;
  meal[3].food_price = 200;
  meal[4].food_price = 130;
  meal[5].food_price = 120;
  meal[6].food_price = 160;

  for (i = 1; i <= 6; i++) {printf("%d. %s - Tk. %.0f\n", i, meal[i].food_name, meal[i].food_price);}
  printf("\n");

  char name[30];
  cout << "Enter user's name: ";
  gets(name);

  printf("\n%s\n", name);
  cout << "****SET MEAL****\n";

  int a, n;
  cout << "How many items you want to choose for Set 1?\n";
  cin >> n;

  if (n <= 4) {
    cout << "Enter your chosen numbers:\n";
    for (i = 1; i <= n; i++) {
      scanf("%d", &a);
      sum1 = sum1 + meal[a].food_price;
      printf("%s. ", meal[a].food_name);
    }
  }
  else {
    cout << "More than FOUR choices aren't applicable for Set 1.\n";
    exit(0);
  }
  printf("\nSet 1: Tk. %d\n\n", sum1);

  cout << "How many items you want to choose for Set 2?\n";
  cin >> n;

  if (n <= 3) {
    printf("Enter your chosen numbers:\n");
    for (i = 1; i <= n; i++) {
      cin >> a;
      sum2 = sum2 + meal[a].food_price;
      printf("%s. ", meal[a].food_name);
    }
  }
  else {
    cout << "More than THREE choices aren't applicable for Set 2.\n";
    exit(0);
  }
  printf("\nSet 2: Tk. %d\n\n", sum2);

  cout << "How many items you want to choose for Set 3?\n";
  cin >> n;

  if (n <= 3) {
    cout << "Enter your chosen numbers:\n";
    for (i = 1; i <= n; i++) {
      cin >> a;
      sum3 = sum3 + meal[a].food_price;
      printf("%s. ", meal[a].food_name);
    }
  }
  else {
    cout << "More than THREE choices aren't applicable for Set 3.\n";
    exit(0);
  }

  printf("\nSet 3: Tk. %d\n\n", sum3);
  printf("\n");

  int discount, menu_price, due;
  menu_price = (sum1 + sum2 + sum3);
  printf("Total Menu Price: Tk. %d\n", menu_price);

  discount = (menu_price / 10);
  printf("Discount: Tk. %d\n", discount);

  due = (menu_price - discount);
  printf("Total Due: Tk. %d\n", due);

  return 0;
}
