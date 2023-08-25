class Main {
  public static void main(String[] args) {
    DynamicVector<Integer> array = new DynamicVector<>(3);

    array.push(1);
    array.push(2);
    array.push(3);
    array.push(4);
    array.push(5);
    array.push(6);
    array.push(7);

    array.print();
  }
}
