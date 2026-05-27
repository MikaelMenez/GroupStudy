import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<Integer, Integer> freq = new HashMap<>();
    String input = sc.nextLine();
    List<Integer> inputint = Arrays.stream(input.split(" "))
        .filter(s -> !s.trim().isEmpty())
        .map(Integer::parseInt)
        .collect(Collectors.toList());
    List<Integer> ord = new ArrayList<Integer>();
    for (Integer i : inputint) {
      if (!ord.contains(i)) {
        ord.add(i);
      }
      if (freq.containsKey(i)) {
        freq.put(i, freq.get(i) + 1);
      } else {
        freq.put(i, 1);
      }
    }
    for (Integer i : ord) {
      System.out.println(i + " " + freq.get(i));
    }
    sc.close();

  }
}
