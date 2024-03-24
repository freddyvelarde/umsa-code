#include <bits/stdc++.h>
using namespace std;

int main() {

  int a, b;
  cin >> a;
  cin >> b;

  vector<int> nums;

  for (int i = 0; i < a; i++) {
    int x;
    cin >> x;
    nums.push_back(x);
  }
  for (int i = 0; i < b; i++) {
    int x;
    cin >> x;
    nums.push_back(x);
  }

  sort(nums.begin(), nums.end());

  while (!nums.empty()) {
    int x = nums.front();
    nums.erase(nums.begin());
    cout << x << "\n";
  }

  return 0;
}
