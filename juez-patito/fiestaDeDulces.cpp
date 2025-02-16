#include <iostream>
using namespace std;

int main() {
  int x, y, z;
  int a, b, c;

  cin >> x >> y >> z;
  cin >> a >> b >> c;

  if (a < x) {
    cout << "NO" << endl;
    return 0;
  }
  a -= x;

  if (a + b < y) {
    cout << "NO" << endl;
    return 0;
  }
  int remaining = (a + b) - y;

  if (remaining + c < z) {
    cout << "NO" << endl;
    return 0;
  }

  cout << "SI" << endl;
  return 0;
}
