#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;

  for (int i = 0; i < n; i++) {
    int m;
    cin >> m;

    vector<int> nums;
    for (int j = 0; j < m; j++) {
      int x;
      cin >> x;

      // if (!nums.empty()) {
      //   int last = nums.back();
      //   if (last != x) {
      //     cout << j << "\n";
      //     break;
      //   }
      // }

      nums.push_back(x);
    }

    for (vector<int>::size_type i = 0; i < nums.size(); i++) {
      int cur = nums[i];
      int next = nums[i + 1];
      int nextNext = nums[i + 2];

      if (i == nums.size() - 1) {
        break;
      }

      if (cur != next) {
        if (i == 0) {
          if (cur == nextNext) {
            cout << i + 1 << "\n";
            break;
          } else {

            cout << i << "\n";
            break;
          }
        }

        cout << i + 1 << "\n";
        break;
      }
    }
  }

  return 0;
}
