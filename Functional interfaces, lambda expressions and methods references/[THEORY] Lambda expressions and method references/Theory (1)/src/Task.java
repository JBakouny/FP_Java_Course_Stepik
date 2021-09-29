// You can experiment here, it won’t be checked

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Task {

  public static void main(String[] args) throws Exception {
    Callable<Integer> c = () -> 10;
    System.out.println(c.call());
  }
}
