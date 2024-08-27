#include <bits/stdc++.h>
using namespace std;
#define longNum long long

const longNum N = 2e5 + 1;
longNum arr[N][19];

void process() {
  for (int i = 1; i < N; i++) {
    longNum in = 0, x = i;
    while (x > 0) {
      arr[i][in] = x % 2 + arr[i - 1][in];
      x /= 2;
      in++;
    }
  }
}

void solve() {
  longNum l, r;
  cin >> l >> r;
  longNum m = LLONG_MIN;
  for (int i = 0; i < 19; i++) {
    m = max(m, arr[r][i] - arr[l - 1][i]);
  }
  cout << r - l + 1 - m << "\n";
}

int main() {

  process();
  longNum t;
  cin >> t;
  while (t--) {
    solve();
  }

  return 0;
}
