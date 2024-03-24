#include <bits/stdc++.h>
using namespace std;

int main() {
  string line;

  while (getline(cin, line)) {
    vector<int> nums;

    istringstream iss(line);
    int n;

    while (iss >> n) {
      nums.push_back(n);
    }

    sort(nums.begin(), nums.end());

    int captainA = 0;
    int captainB = 0;

    int index = 1;

    while (!nums.empty()) {
      int x = nums.back();
      nums.pop_back();

      if (index % 2 == 0) {
        captainA += x;

      } else {
        captainB += x;
      }

      index++;
    }

    cout << abs(captainA - captainB) << "\n";
  }

  return 0;
}
