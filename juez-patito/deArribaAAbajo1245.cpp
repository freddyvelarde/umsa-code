#include <bits/stdc++.h>
using namespace std;

int main() {
    int m, n, temp;
    cin >> m; cin >> n;

    if (m > n) {
        temp = n;
        n = m;
        m = temp;
    }
    

    for (int i = n; i >= m; i--) {
        cout << i << "\n";
    }
    return 0;
}
