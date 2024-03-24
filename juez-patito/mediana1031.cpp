#include <bits/stdc++.h>

using namespace std;

int main() {
  string line;

  int c = 1;

  while (getline(cin, line)) {
    if (c % 2 != 0) {
      c++;
      continue;
    }
    vector<int> nums;
    int n;
    istringstream iss(line);

    while (iss >> n) {
      nums.push_back(n);
    }

    if (nums.size() % 2 == 0) {
      // cout << "-1"
      //      << "\n";
      c++;
      continue;
    }

    sort(nums.begin(), nums.end());

    // cout << nums[(nums.size() / 2) + 1] << "\n";
    while (!nums.empty()) {
      int x = nums.back();
      nums.pop_back();
      cout << x << "\n";
    }
    c++;
  }

  return 0;
}
