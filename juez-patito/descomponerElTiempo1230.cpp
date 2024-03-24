#include <bits/stdc++.h>
using namespace std;

int main() {
    int t; cin >> t;
     
    int hour = t / 3600;

    int min = (t / 60) % 60;

    int seg = t % 60;

    cout << hour << " " << min << " " << seg << "\n";


    return 0;
}
