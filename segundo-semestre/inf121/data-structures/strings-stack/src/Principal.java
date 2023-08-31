public class Principal {

  public static void main(String[] args) {
    Pila<String> names = new Pila<>();

    names.llenar(3);

    names.mostrar();
    // System.out.println(vowelsCounter(names));
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
