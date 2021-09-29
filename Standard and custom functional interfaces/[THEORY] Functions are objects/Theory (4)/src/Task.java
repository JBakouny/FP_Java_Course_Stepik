// You can experiment here, it won’t be checked

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
  public static void main(String[] args) {
    List<Double> numbers = Arrays.asList(9.0, 25.0, 49.0);

    List<Double> nbrSqrt =
            numbers.stream().map(x -> Math.sqrt(x)).collect(Collectors.toList());

    System.out.println(numbers);
    System.out.println(nbrSqrt);
  }
}
