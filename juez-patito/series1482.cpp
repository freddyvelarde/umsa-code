#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;

  long long x = -1;
  int c = -2;
  for (int i = 0; i < n; i++) {
    cout << x << "\n";
    x *= c;
    c--;
  }

  return 0;
}
