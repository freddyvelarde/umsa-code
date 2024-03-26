#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  cin.ignore();

  for (int i = 0; i < n; ++i) {
    string s;
    getline(cin, s);

    reverse(s.begin(), s.end());

    cout << s << "\n";
  }

  return 0;
}
