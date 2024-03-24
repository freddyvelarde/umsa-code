#include <bits/stdc++.h>
using namespace std;

int main() {
  string line;

  while (getline(cin, line)) {
    if (line.empty()) {
      break;
    }

    vector<int> numbers;
    int num;

    istringstream iss(line);

    while (iss >> num) {
      numbers.push_back(num);
    }

    int a, b;

    a = numbers[0];
    b = numbers[1];

    if (a % b == 0) {
      cout << a << " es divisible por " << b << "\n";
    } else if (b % a == 0) {
      cout << b << " es divisible por " << a << "\n";
    } else {
      cout << "-1"
           << "\n";
    }
  }
  //
  return 0;
}
