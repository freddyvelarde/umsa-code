public class Principal {

  public static void main(String[] args) {
    Pila<String> names = new Pila<>();

    names.llenar(3);

    Pila<String> longestStrings = findLongestStrings(names);
    longestStrings.mostrar();

    // System.out.println(vowelsCounter(names));
  }

  static Pila<String> findLongestStrings(Pila<String> names) {
    Pila<String> swapStack = new Pila<>();
    Pila<String> longestStrings = new Pila<>();
    int maxLength = 0;

    while (!names.esVacia()) {
      String name = names.eli();
      int length = name.length();

      if (length > maxLength) {
        maxLength = length;
        longestStrings = new Pila<>();
        longestStrings.adi(name);
      } else if (length == maxLength) {
        longestStrings.adi(name);
      }

      swapStack.adi(name);
    }
    names.vaciar(swapStack);
    return longestStrings;
  }

  static int vowelsCounter(Pila<String> names) {
    int counter = 0;
    Pila<String> swap_stack = new Pila<>();
    while (!names.esVacia()) {
      String singleName = names.eli();
      char firstChar = singleName.charAt(0);

      String validVowels = "aeiouAEIOUÁÉÍÓÚáéíóú";

      for (char vowel : validVowels.toCharArray()) {
        if (firstChar == vowel)
          counter++;
      }
      swap_stack.adi(singleName);
    }
    names.vaciar(swap_stack);
    return counter;
  }
}
