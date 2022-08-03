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
  int i, sum = 0;

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
      cin >> a;
      printf("%s Tk. %.0f\n", meal[a].food_name, meal[a].food_price);
      sum = sum + meal[a].food_price;
    }
  }
  else {
    cout << "More than FOUR choices aren't applicable.\n";
    exit(0);
  }
  printf("\n");

  int quantity;
  cout << "Enter Quantity number:\n";
  cin >> quantity;
  cout << "\nTOTAL: Tk. " << sum;

  int discount, set_price, due;
  discount = (sum / 10);
  printf("\nDiscount: Tk. %d\n", discount);

  set_price = (sum - discount);
  printf("Set Menu Price: Tk. %d\n", set_price);

  due = (set_price * quantity);
  printf("Total Due: Tk. %d\n", due);

  return 0;
}
