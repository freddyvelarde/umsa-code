#include <bits/stdc++.h>
using namespace std;

int main() {
  string line;
  int c = 1;

  while (getline(cin, line)) {
    if (line == "0") {
      break;
    }
    if (c % 2 == 0) {
      int res = 0;
      int num;

      istringstream iss(line);

      while (iss >> num) {
        res += num;
      }
      cout << res << "\n";
    }
    c++;
  }

  return 0;
}
