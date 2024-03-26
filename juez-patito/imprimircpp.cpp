#include <bits/stdc++.h>
using namespace std;

int main() {
  vector<string> v = {"CCC   +    +", "C    +++  +++", "CCC   +    +"};
  int n;
  cin >> n;

  for (int j = 0; j < n; ++j) {

    for (vector<string>::size_type i = 0; i < v.size(); ++i) {
      cout << v[i] << "\n";
    }
    if (j < n - 1) {
      cout << "\n";
    }
  }

  return 0;
}
