package Extras;

public class PrintNumbersUsingRecursion {

  public static void main(String[] args) {
    PrintNumbersUsingRecursion.printNumbers(1, 10);
  }

  public static void printNumbers(int n, int range) {
    if(n>range) return;
    System.out.print(n+ " ");
    printNumbers(n+1, range);
  }
}
