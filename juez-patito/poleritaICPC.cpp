#include <iostream>
#include <string>
using namespace std;

char compareSizes(const string &A, const string &B) {
  char baseA = A.back();
  char baseB = B.back();
  int countXA = 0, countXB = 0;

  for (char ch : A) {
    if (ch == 'X')
      countXA++;
  }

  for (char ch : B) {
    if (ch == 'X')
      countXB++;
  }

  if (baseA != baseB) {
    if (baseA == 'L' && baseB != 'L')
      return '>';
    if (baseA == 'M' && baseB == 'S')
      return '>';
    if (baseA == 'S' && baseB != 'S')
      return '<';
    if (baseA == 'M' && baseB == 'L')
      return '<';
    if (baseA == 'S' && baseB == 'M')
      return '<';
    if (baseA == 'L' && baseB == 'M')
      return '>';
  } else {
    if (baseA == 'L') {
      if (countXA > countXB)
        return '>';
      else if (countXA < countXB)
        return '<';
      else
        return '=';
    } else if (baseA == 'S') {
      if (countXA > countXB)
        return '<';
      else if (countXA < countXB)
        return '>';
      else
        return '=';
    } else {
      return '=';
    }
  }

  return '=';
}

int main() {
  int t;
  cin >> t;
  while (t--) {
    string A, B;
    cin >> A >> B;
    char result = compareSizes(A, B);
    cout << result << endl;
  }
  return 0;
}
