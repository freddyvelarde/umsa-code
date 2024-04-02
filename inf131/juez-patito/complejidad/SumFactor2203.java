import java.util.*;

public class SumFactor2203 {
  static int findSumOfPrimeNumbers(int n, List<Integer> primes) {
    int sum = 0;
    int i = 2;
    while (i * i <= n) {
      while (n % i == 0) {
        sum += i;
        while (n % i == 0) {
          n /= i;
        }
      }
      i++;
    }
    if (n > 1) {
      sum += n;
    }
    return sum;
  }

  public static void main(String[] args) {
    List<Integer> primes = sieveOfEratosthenes(2, 1000);
    Scanner scanner = new Scanner(System.in);
    Map<Integer, long[]> cache = new HashMap<>();
    /* precalc(primes, cache); */
    cache.put(1, new long[] {10, 36});
    cache.put(11, new long[] {30, 218});
    cache.put(31, new long[] {50, 372});
    cache.put(51, new long[] {70, 506});
    cache.put(71, new long[] {90, 691});
    cache.put(91, new long[] {110, 834});
    cache.put(111, new long[] {130, 719});
    cache.put(131, new long[] {150, 1056});
    cache.put(151, new long[] {170, 1128});
    cache.put(171, new long[] {190, 1124});
    cache.put(191, new long[] {210, 1407});
    cache.put(211, new long[] {230, 1682});
    cache.put(231, new long[] {250, 1309});
    cache.put(251, new long[] {270, 1792});
    cache.put(271, new long[] {290, 1810});
    cache.put(291, new long[] {310, 1681});
    cache.put(311, new long[] {330, 1915});
    cache.put(331, new long[] {350, 2269});
    cache.put(351, new long[] {370, 2052});
    cache.put(371, new long[] {390, 2501});
    cache.put(391, new long[] {410, 2309});
    cache.put(411, new long[] {430, 2143});
    cache.put(431, new long[] {450, 3100});
    cache.put(451, new long[] {470, 3202});
    cache.put(471, new long[] {490, 2371});
    cache.put(491, new long[] {510, 3102});
    cache.put(511, new long[] {530, 2457});
    cache.put(531, new long[] {550, 2824});
    cache.put(551, new long[] {570, 3303});
    cache.put(571, new long[] {590, 3064});
    cache.put(591, new long[] {610, 3610});
    cache.put(611, new long[] {630, 3491});
    cache.put(631, new long[] {650, 3837});
    cache.put(651, new long[] {670, 3670});
    cache.put(671, new long[] {690, 3550});
    cache.put(691, new long[] {710, 4230});
    cache.put(711, new long[] {730, 3238});
    cache.put(731, new long[] {750, 3820});
    cache.put(751, new long[] {770, 4950});
    cache.put(771, new long[] {790, 3733});
    cache.put(791, new long[] {810, 3696});
    cache.put(811, new long[] {830, 5659});
    cache.put(831, new long[] {850, 3380});
    cache.put(851, new long[] {870, 5144});
    cache.put(871, new long[] {890, 5536});
    cache.put(891, new long[] {910, 3113});
    cache.put(911, new long[] {930, 5391});
    cache.put(931, new long[] {950, 4920});
    cache.put(951, new long[] {970, 4264});
    cache.put(971, new long[] {990, 5016});
    cache.put(991, new long[] {1010, 5588});
    cache.put(1011, new long[] {1030, 4941});
    cache.put(1031, new long[] {1230, 58583});
    cache.put(1231, new long[] {1430, 63288});
    cache.put(1431, new long[] {1630, 80549});
    cache.put(1631, new long[] {1830, 77736});
    cache.put(1831, new long[] {2030, 93255});
    cache.put(2031, new long[] {2230, 94886});
    cache.put(2231, new long[] {2430, 111793});
    cache.put(2431, new long[] {2630, 107985});
    cache.put(2631, new long[] {2830, 127428});
    cache.put(2831, new long[] {3030, 132078});
    cache.put(3031, new long[] {3230, 136488});
    cache.put(3231, new long[] {3430, 140547});
    cache.put(3431, new long[] {3630, 159816});
    cache.put(3631, new long[] {3830, 159795});
    cache.put(3831, new long[] {4030, 175919});
    cache.put(4031, new long[] {4230, 170523});
    cache.put(4231, new long[] {4430, 178768});
    cache.put(4431, new long[] {4630, 187495});
    cache.put(4631, new long[] {4830, 206981});
    cache.put(4831, new long[] {5030, 209092});
    cache.put(5031, new long[] {5230, 197290});
    cache.put(5231, new long[] {5430, 218802});
    cache.put(5431, new long[] {5630, 226256});
    cache.put(5631, new long[] {5830, 249870});
    cache.put(5831, new long[] {6030, 229412});
    cache.put(6031, new long[] {6230, 258628});
    cache.put(6231, new long[] {6430, 271471});
    cache.put(6431, new long[] {6630, 239137});
    cache.put(6631, new long[] {6830, 280864});
    cache.put(6831, new long[] {7030, 284209});
    cache.put(7031, new long[] {7230, 279905});
    cache.put(7231, new long[] {7430, 260246});
    cache.put(7431, new long[] {7630, 323927});
    cache.put(7631, new long[] {7830, 303031});
    cache.put(7831, new long[] {8030, 298135});
    cache.put(8031, new long[] {8230, 321350});
    cache.put(8231, new long[] {8430, 326804});
    cache.put(8431, new long[] {8630, 335703});
    cache.put(8631, new long[] {8830, 345449});
    cache.put(8831, new long[] {9030, 352587});
    cache.put(9031, new long[] {9230, 351637});
    cache.put(9231, new long[] {9430, 363988});
    cache.put(9431, new long[] {9630, 382739});
    cache.put(9631, new long[] {9830, 369092});
    cache.put(9831, new long[] {10030, 378882});
    cache.put(10031, new long[] {10230, 401755});
    cache.put(10231, new long[] {12230, 4178576});
    cache.put(12231, new long[] {14230, 4926773});
    cache.put(14231, new long[] {16230, 5638349});
    cache.put(16231, new long[] {18230, 6213917});
    cache.put(18231, new long[] {20230, 6805811});
    cache.put(20231, new long[] {22230, 7506837});
    cache.put(22231, new long[] {24230, 8282769});
    cache.put(24231, new long[] {26230, 8560492});
    cache.put(26231, new long[] {28230, 9342896});
    cache.put(28231, new long[] {30230, 9878191});
    cache.put(30231, new long[] {32230, 10538513});
    cache.put(32231, new long[] {34230, 11303576});
    cache.put(34231, new long[] {36230, 11751716});
    cache.put(36231, new long[] {38230, 12341060});
    cache.put(38231, new long[] {40230, 13048921});
    cache.put(40231, new long[] {42230, 13727414});
    cache.put(42231, new long[] {44230, 14274893});
    cache.put(44231, new long[] {46230, 14565517});
    cache.put(46231, new long[] {48230, 15333449});
    cache.put(48231, new long[] {50230, 15997396});
    cache.put(50231, new long[] {52230, 16480153});
    cache.put(52231, new long[] {54230, 16984289});
    cache.put(54231, new long[] {56230, 17762706});
    cache.put(56231, new long[] {58230, 18683068});
    cache.put(58231, new long[] {60230, 18779148});
    cache.put(60231, new long[] {62230, 19133812});
    cache.put(62231, new long[] {64230, 19771940});
    cache.put(64231, new long[] {66230, 20677243});
    cache.put(66231, new long[] {68230, 21279068});
    cache.put(68231, new long[] {70230, 21168023});
    cache.put(70231, new long[] {72230, 22880853});
    cache.put(72231, new long[] {74230, 22558594});
    cache.put(74231, new long[] {76230, 23101208});
    cache.put(76231, new long[] {78230, 24251300});
    cache.put(78231, new long[] {80230, 24263573});
    cache.put(80231, new long[] {82230, 25469534});
    cache.put(82231, new long[] {84230, 25506375});
    cache.put(84231, new long[] {86230, 25974922});
    cache.put(86231, new long[] {88230, 26643753});
    cache.put(88231, new long[] {90230, 27454503});
    cache.put(90231, new long[] {92230, 27396164});
    cache.put(92231, new long[] {94230, 28800879});
    cache.put(94231, new long[] {96230, 29512307});
    cache.put(96231, new long[] {98230, 28814871});
    cache.put(98231, new long[] {100230, 30361864});
    cache.put(100231, new long[] {102230, 31165363});
    cache.put(102231, new long[] {122230, 335401931});
    cache.put(122231, new long[] {142230, 391433711});
    cache.put(142231, new long[] {162230, 442293642});
    cache.put(162231, new long[] {182230, 495098522});
    cache.put(182231, new long[] {202230, 550058589});
    cache.put(202231, new long[] {222230, 600856886});
    cache.put(222231, new long[] {242230, 651491066});
    cache.put(242231, new long[] {262230, 701290703});
    cache.put(262231, new long[] {282230, 759943071});
    cache.put(282231, new long[] {302230, 797412009});
    cache.put(302231, new long[] {322230, 863074944});
    cache.put(322231, new long[] {342230, 904336057});
    cache.put(342231, new long[] {362230, 954398152});
    cache.put(362231, new long[] {382230, 1000944308});
    cache.put(382231, new long[] {402230, 1054267062});
    cache.put(402231, new long[] {422230, 1105759809});
    cache.put(422231, new long[] {442230, 1156577531});
    cache.put(442231, new long[] {462230, 1192269638});
    cache.put(462231, new long[] {482230, 1257538476});
    cache.put(482231, new long[] {502230, 1302960160});
    cache.put(502231, new long[] {522230, 1350912971});
    cache.put(522231, new long[] {542230, 1396163519});
    cache.put(542231, new long[] {562230, 1430986102});
    cache.put(562231, new long[] {582230, 1503753663});
    cache.put(582231, new long[] {602230, 1534197491});
    cache.put(602231, new long[] {622230, 1596099600});
    cache.put(622231, new long[] {642230, 1623019704});
    cache.put(642231, new long[] {662230, 1683102995});
    cache.put(662231, new long[] {682230, 1735892674});
    cache.put(682231, new long[] {702230, 1771009889});
    cache.put(702231, new long[] {722230, 1831421414});
    cache.put(722231, new long[] {742230, 1874743882});
    cache.put(742231, new long[] {762230, 1911163160});
    cache.put(762231, new long[] {782230, 1977671031});
    cache.put(782231, new long[] {802230, 2021130051});
    cache.put(802231, new long[] {822230, 2051698422});
    cache.put(822231, new long[] {842230, 2110092520});
    cache.put(842231, new long[] {862230, 2155012332L});
    cache.put(862231, new long[] {882230, 2212410077L});
    cache.put(882231, new long[] {902230, 2241433566L});
    cache.put(902231, new long[] {922230, 2290448036L});
    cache.put(922231, new long[] {942230, 2348328024L});
    cache.put(942231, new long[] {962230, 2373812404L});
    cache.put(962231, new long[] {982230, 2421390538L});
    cache.put(982231, new long[] {1002230, 2478814909L});
    int t = scanner.nextInt();

    for (int i = 0; i < t; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      System.out.println(solution(primes, a, b, cache));
    }
  }

  static long solution(List<Integer> primes, int a, int b,
                       Map<Integer, long[]> cache) {

    long sum = 0;
    int skip = 0;
    for (int i = a; i <= b; i++) {
      if (i <= 1)
        continue;
      if (i <= skip)
        continue;

      if (cache.containsKey(i)) {
        long[] data = cache.get(i);
        long upto = data[0];
        long d = data[1];
        if (upto <= b) {
          skip = (int)upto;
          sum += d;
          continue;
        }
      }
      sum += findSumOfPrimeNumbers(i, primes);
    }

    long[] value = new long[] {b, sum};
    cache.put(a, value);

    return sum;
  }

  static void precalc(List<Integer> primes, Map<Integer, long[]> cache) {
    int i = 1;
    int j = 10;
    while (i < 1000) {
      long r = solution(primes, i, j, cache);

      System.out.println("cache.put(" + i + ", new long[]{" + j + ", " + r +
                         "});");

      i = j + 1;
      j = j + 20;
    }
    while (i < 10000) {
      long r = solution(primes, i, j, cache);

      System.out.println("cache.put(" + i + ", new long[]{" + j + ", " + r +
                         "});");

      i = j + 1;
      j = j + 200;
    }
    while (i < 100000) {
      long r = solution(primes, i, j, cache);

      System.out.println("cache.put(" + i + ", new long[]{" + j + ", " + r +
                         "});");

      i = j + 1;
      j = j + 2000;
    }
    while (i < 1000000) {
      long r = solution(primes, i, j, cache);

      System.out.println("cache.put(" + i + ", new long[]{" + j + ", " + r +
                         "});");

      i = j + 1;
      j = j + 20000;
    }
  }

  static List<Integer> sieveOfEratosthenes(int start, long n) {
    boolean[] primes = new boolean[(int)((n - start) + 1)];
    List<Integer> primeList = new ArrayList<>();

    for (int i = 0; i < primes.length; i++) {
      primes[i] = true;
    }

    int sqrtN = (int)Math.sqrt(n);

    for (int p = 2; p <= sqrtN; p++) {
      int i = Math.max(2, (start + p - 1) / p);
      for (int j = i * p; j <= n; j += p) {
        if (j >= start) {
          primes[(int)(j - start)] = false;
        }
      }
    }

    for (int i = 0; i < primes.length; i++) {
      if (primes[i])
        primeList.add(i + start);
    }

    return primeList;
  }
}
