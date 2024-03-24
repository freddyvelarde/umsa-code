#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;

  cin >> n;

  for (int i = 0; i < n; i++) {

    int m;
    cin >> m;
    vector<int> numbers;

    for (int j = 0; j < m; j++) {
      int x;
      cin >> x;

      numbers.push_back(x);
    }

    sort(numbers.begin(), numbers.end());
    for (vector<int>::size_type i = 0; i < numbers.size(); i++) {
      if (i == numbers.size() - 1) {
        cout << numbers[i] << "\n";
        break;
      }
      cout << numbers[i] << " ";
    }
  }

  return 0;
}
