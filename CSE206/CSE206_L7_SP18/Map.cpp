#include <iostream>
#include <string>
#include <map>

using namespace std;

int main()
{
  map<string, float> m;
  map<string, float>::iterator i, j;

  m.insert(pair<string, float>("Ayesh", 3.9));
  m.insert(pair<string, float>("Adeeb", 3.7));
  m.insert(pair<string, float>("Sourov", 3.55));
  m.insert(pair<string, float>("Mollika", 3.87));
  m.insert(pair<string, float>("Marjan", 3.5));
  m.insert(pair<string, float>("Yeasin", 3.37));
  m.insert(pair<string, float>("Tanveer", 3.5));
  m.insert(pair<string, float>("Yeasir", 3.45));

  double min = m.begin()->second;
  for (i = m.begin(); i != m.end(); i++) {
    if (i->second < min) {
      min = i->second;
      j = i;
    }
  }
  cout << j->first << " " << j->second << endl;

  double sum = 0;
  for (i = m.begin(); i != m.end(); i++) {sum = sum + i->second;}
  cout << "Average " << sum / m.size() << endl;

  i = m.find("Marjan"); {cout << i->second << " ";}
  i = m.find("Rakin"); {cout << i->second << endl;}

  if (m.count("Progga")) {cout << "Inserted" << endl;}
  else {cout << "Not Inserted" << endl;}

  return 0;
}
