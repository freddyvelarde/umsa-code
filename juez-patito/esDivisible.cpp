#include <bits/stdc++.h>
using namespace std;

int main() {
  int x, y;
  cin >> x;
  cin >> y;

  if (x > y) {
    if (x % y == 0) {
      cout << x << " es divisible por " << y << "\n";
    } else {
      cout << "-1"
           << "\n";
    }
    return 0;
  }
  if (y % x == 0) {
    cout << y << " es divisible por " << x << "\n";
  } else {
    cout << "-1"
         << "\n";
  }

  return 0;
}
