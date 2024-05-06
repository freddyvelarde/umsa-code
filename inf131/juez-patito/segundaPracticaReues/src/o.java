/* import java.math.BigInteger; */
/* import java.util.Scanner; */
/*  */
/* public class Main { */
/*   public static void main(String[] args) { */
/*  */
/*     [> for (long i = 1_000_000_000_000_000_000L - 100; <] */
/*     [>      i <= 1_000_000_000_000_000_000L; i++) { <] */
/*   System.out.println(i + " -> \t" + Long.toBinaryString(i) + " has \t" +
 */
/*     [>                      Long.bitCount(i)); <] */
/*     [> } <] */
/*     solution(576460752303423488L, 1_000_000_000_000_000_000L); */
/*     [> BigInteger result = BigInteger.valueOf(2).pow(60); <] */
/* solution(1_000_000_000_000_000_000L - 100, 1_000_000_000_000_000_000L);
 */
/*     [> System.out.println("nums: " + ((long)Math.pow(2, 59) - 1) + " -> \t" +
 * <] */
/*     [>                    Long.toBinaryString((long)Math.pow(2, 59) - 1) + <]
 */
/*     [>                    " bits -> " + <] */
/*     [>                    Long.bitCount((long)Math.pow(2, 59) - 1)); <] */
/*     [> System.out.println(result); <] */
/*   } */
/*  */
/*   [> public static void main(String[] args) { <] */
/*   [>   [> solution(4181, 26209); <] <] */
/*   [>   [> solution(25926, 30799); <] <] */
/*   [>   [> solution(7, 7); <] <] */
/*   [>   [> solution(7, 7); <] <] */
/*   [>   Scanner scanner = new Scanner(System.in); <] */
/*   [>   int t = scanner.nextInt(); <] */
/*   [>  <] */
/*   [>   for (int i = 0; i < t; i++) { <] */
/*   [>     long l = scanner.nextLong(), r = scanner.nextLong(); <] */
/*   [>     solution(l, r); <] */
/*   [>   } <] */
/*   [>  <] */
/*   [>   [> for (int i = 0; i < v.length; i++) { <] <] */
/*   [>   [>   if (v[i] >= max) { <] <] */
/*   [>   [>     max = v[i]; <] <] */
/*   [>   [>     ind = i; <] <] */
/*   [>   [>   } <] <] */
/*   [>   [> } <] <] */
/*   [> } <] */
/*  */
/*   static void solution(long l, long r) { */
/*     // long l = 1, r = 10; */
/*  */
/*     [> int lDig = Long.toBinaryString(l).length(); <] */
/*     int rDig = Long.toBinaryString(r).length(); */
/*  */
/*     long x = (long)Math.pow(2, rDig) - 1; */
/*  */
/*     while (x > r) { */
/*       rDig--; */
/*       x = (long)Math.pow(2, rDig) - 1; */
/*     } */
/*  */
/*     if (x >= l) { */
/*       System.out.print(x + "\n"); */
/*       return; */
/*     } */
/*  */
/*     // this is the fucking  worst case. */
/*     int max = 0; */
/*     [> long num = 0; <] */
/*     for (long i = l; i <= r; i++) { */
/*       int bits = Long.bitCount(i); */
/*  */
/*       if (bits > max) { */
/*         max = bits; */
/*         x = i; */
/*       } */
/*     } */
/*     System.out.print(x + "\n"); */
/*   } */
/* } */
