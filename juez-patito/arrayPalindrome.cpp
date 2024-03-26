#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;

  vector<int> nums;

  for (int i = 0; i < n; ++i) {
    int x;
    cin >> x;
    nums.push_back(x);
  }

  int lastIndex = nums.size() - 1;
  for (vector<int>::size_type i = 0; i < nums.size(); ++i) {
    if (nums[i] != nums[lastIndex]) {
      cout << "NO"
           << "\n";
      return 0;
    }
    lastIndex--;
  }
  cout << "SI"
       << "\n";

  return 0;
}
