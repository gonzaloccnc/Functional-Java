import java.util.ArrayList;
import java.util.List;

public class Bench {

  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>(List.of(2, 3, 4, 4, 5, 9, 7, 8, 6, 10, 4, 5, 10, 10, 8, 4, 6, 4, 10, 1));

    var maxNumbers = new ArrayList<Integer>();
    arr.sort((a,b) -> b - a);
    int sum = arr.stream().reduce(0, Integer::sum);

    for (Integer elem : arr) {
      int sumMax = maxNumbers.stream().reduce(0, Integer::sum);

      int result = sum - sumMax;

      if (sumMax > result) break;
      else maxNumbers.add(elem);

    }

    maxNumbers.sort(Integer::compareTo);
    System.out.println("llegamos");
  }
}
