public class M {
  public static void main(String[] args) {
    int i = 0;
    int j = 5;
    int k = -1;

    long sumIncrements = i;
    long sumDecrements = 0;

    for(long in = i + 1; in <= j; in++) {
      sumIncrements += in;
    }

    for (long in = j - 1; in >= k; in--) {
      sumDecrements += in;
    }

    System.out.println(sumIncrements + sumDecrements);
  }
}
