public class Main {
  public static void main(String args[]) {
    PilaCar alphabet = new PilaCar();

    alphabet.adi('b');
    alphabet.adi('b');
    alphabet.adi('a');
    alphabet.adi('a');
    alphabet.adi('b');
    alphabet.adi('e');
    alphabet.adi('d');
    alphabet.adi('d');

    // a)
    /* moveVowelsToBeggining(alphabet); */

    // b)
    /* removeRepeatedChars(alphabet); */

    // c)
    /* PilaCar secondAlphabet = new PilaCar(); */
    /* secondAlphabet.adi('b'); */
    /*  */
    /* removeCharsMatchingStacks(alphabet, secondAlphabet); */
    /* alphabet.mostrar(); */
  }

  // a
  static void moveVowelsToBeggining(PilaCar chars) {
    PilaCar charsSwap = new PilaCar();
    PilaCar vowels = new PilaCar();

    while (!chars.esVacia()) {
      char c = chars.eli();

      if (c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u') {
        vowels.adi(c);
      } else {
        charsSwap.adi(c);
      }
    }
    chars.vaciar(vowels);
    chars.vaciar(charsSwap);
  }

  // b
  static void removeRepeatedChars(PilaCar chars) {
    PilaCar charsSwap = new PilaCar();
    while (!chars.esVacia()) {
      char x = chars.eli();

      if (isCharInPilaCar(chars, x)) {
        PilaCar charsSwap2 = new PilaCar();

        while (!chars.esVacia()) {
          char a = chars.eli();
          if (a != x) {
            charsSwap2.adi(a);
          }
        }
        chars.vaciar(charsSwap2);
      } else {
        charsSwap.adi(x);
      }
    }
    chars.vaciar(charsSwap);
  }

  static boolean isCharInPilaCar(PilaCar c, char charTarget) {
    PilaCar charsSwap = new PilaCar();
    while (!c.esVacia()) {
      char x = c.eli();

      if (x == charTarget) {
        charsSwap.adi(x);
        c.vaciar(charsSwap);
        return true;
      }

      charsSwap.adi(x);
    }
    c.vaciar(charsSwap);
    return false;
  }

  // c
  static void removeCharsMatchingStacks(PilaCar firstStack,
                                        PilaCar secondStack) {
    PilaCar firstStackSwap = new PilaCar();
    while (!firstStack.esVacia()) {
      char x = firstStack.eli();

      if (!isCharInPilaCar(secondStack, x)) {
        firstStackSwap.adi(x);
      }
    }
    firstStack.vaciar(firstStackSwap);
  }
}
