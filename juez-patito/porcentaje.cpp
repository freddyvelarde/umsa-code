#include <iostream>
#include <string>
#include <unordered_map>

using namespace std;

int main() {
  string line;
  unordered_map<string, string> map;

  map[" "] = "%20";

  while (getline(cin, line)) {
    cout << line << endl;
  }

  return 0;
}
