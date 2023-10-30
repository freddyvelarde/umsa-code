public class Main {
  public static void main(String args[]) {
    PilaNums n = new PilaNums();
    n.adi(1);
    n.adi(2);
    n.adi(4);
    n.adi(5);
    pushNumAndKeepStackSorted(n, 3);
    n.mostrar();
  }

  static void pushNumAndKeepStackSorted(PilaNums nums, int newNum) {
    PilaNums greater = new PilaNums();
    PilaNums lower = new PilaNums();
    int lastElem = nums.eli();

    nums.adi(lastElem);

    while (!nums.esVacia()) {
      int n = nums.eli();
      if (n > newNum) {
        greater.adi(n);
      } else {
        lower.adi(n);
      }
    }

    if (isDecreasing(newNum, lastElem)) {
      nums.vaciar(lower);
      nums.adi(newNum);
      nums.vaciar(greater);

    } else {
      nums.vaciar(greater);
      nums.adi(newNum);
      nums.vaciar(lower);
    }
  }

  static boolean isDecreasing(int newNum, int lastElementFromStack) {
    if (newNum >= lastElementFromStack)
      return false;
    return true;
  }
}
