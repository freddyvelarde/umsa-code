#include <bits/stdc++.h>
using namespace std;

int main() {
  // bool process = false;
  int c = 3;
  int processCounter = 1;

  string line;
  vector<int> a;
  vector<int> b;

  while (getline(cin, line)) {
    if (c % 3 == 0) {
      ++c;
      continue;
    }
    int n;
    istringstream iss(line);
    while (iss >> n) {
      if (processCounter % 2 == 0) {
        a.push_back(n);
      } else {
        b.push_back(n);
      }
    }

    if (processCounter == 2) {
      sort(a.begin(), a.end());
      sort(b.rbegin(), b.rend());
      int r = 0;

      for (vector<int>::size_type i = 0; i < a.size(); ++i) {
        r += a[i] * b[i];
      }
      cout << r << "\n";
      processCounter = 0;
      a.clear();
      b.clear();
    }
    ++processCounter;
    ++c;
  }

  return 0;
}
