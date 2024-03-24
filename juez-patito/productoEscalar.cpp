#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;

  int c = 0;
  while (c < n) {
    int n;
    cin >> n;
    vector<int> numsA;
    vector<int> numsB;

    for (int i = 0; i < n; i++) {
      int x;
      cin >> x;

      numsA.push_back(x);
    }
    for (int i = 0; i < n; i++) {
      int x;
      cin >> x;

      numsB.push_back(x);
    }

    int res = 0;
    for (vector<int>::size_type i = 0; i < numsB.size(); i++) {
      res += numsB[i] * numsA[i];
    }
    cout << res << "\n";
    ++c;
  }

  return 0;
}
