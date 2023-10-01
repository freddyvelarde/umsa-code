public class Main {
  public static void main(String args[]) {
    ColaSimpleNums c = new ColaSimpleNums();

    c.adi(4);
    c.adi(2);
    c.adi(1);
    c.adi(7);
    c.adi(9);
    c.adi(5);
    c.adi(3);
    c.adi(6);

    c.vaciar(sortStack(c));

    c.mostrar();
  }

  static ColaSimpleNums sortStack(ColaSimpleNums nums) {
    if (nums.nroElem() <= 1) {
      return nums;
    }

    ColaSimpleNums left = new ColaSimpleNums();
    ColaSimpleNums right = new ColaSimpleNums();
    ColaSimpleNums res = new ColaSimpleNums();

    int pivot = nums.eli();

    while (!nums.esVacia()) {
      int x = nums.eli();
      if (x <= pivot) {
        left.adi(x);
      } else {
        right.adi(x);
      }
    }
    left.adi(pivot);
    res.vaciar(sortStack(left));
    res.vaciar(sortStack(right));
    return res;
  }
}
