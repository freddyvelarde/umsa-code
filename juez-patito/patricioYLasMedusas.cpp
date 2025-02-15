#include <iostream>
#include <string>
#include <sstream>
#include <vector>


std::vector<int> primeFactors(int n) {

    std::vector<int> factors;

  while (n % 2 == 0) {
    factors.push_back(2);
    n /= 2;
  }

  for (int i = 3; i * i <= n; i+=2) {
    while (n % i ==0) {
      factors.push_back(i);
      n /= i;
    }
  }
  if (n > 1) {
    factors.push_back(n);

    }

  return factors;
}

int main() {
  std::string line;

  while (std::getline(std::cin, line)) {
    std::istringstream iss(line);
    std::vector<int> numbers(2);



    int num;
    int ind = 0;
    while (iss >> num) {
      numbers[ind] = num; ind++;
    }

  std::vector<int> a = primeFactors(numbers[0]);
  std::vector<int> b = primeFactors(numbers[1]);



  int i_a = 0;
  int i_b = 0;

  int res = 1;

  while (i_a < a.size() && i_b < b.size()) {
    int currA = a[i_a];
    int currB = b[i_b];

    if (currA == currB) {
      res *= currA;

      i_a++;
    } else if (currB > currA) {
        i_a++;
        i_b--;
      }


    i_b++;

  }

  std::cout  << res << std::endl;


  }



  return 0;
}
