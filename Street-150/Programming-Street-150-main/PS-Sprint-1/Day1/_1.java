public class _1 {
  public static void main(String[] args) {
    int number = 10;

    checkPrimeNumber(number);
  }

  public static void checkPrimeNumber(int number) {
    int count = 0;

    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        count++;
      }

    }

    if (count == 2) {
      System.out.println("Prime number");
    } else {
      System.out.println("not prime");
    }
  }
}