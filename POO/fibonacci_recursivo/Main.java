package POO.fibonacci_recursivo;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    int n = 155, firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
        System.out.println();
  }
}
