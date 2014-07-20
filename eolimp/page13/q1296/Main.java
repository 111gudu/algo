package page13.q1296;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    while(in.hasNext()) {
      sb.append(divide(in.next().toCharArray(), 0, in.nextInt())).append('\n');
    }
    System.out.print(sb.toString());
  }

  private static long divide(char c[], int s, int n) {
    if(n == 1)
      return to(c, s, c.length-1);

    long max = Long.MIN_VALUE, l;
    for(int i=s; i<=c.length-n; i++) {
      l = to(c, s, i);
      max = Math.max(max, l*divide(c, i+1, n-1));
    }

    return max;
  }

  private static long to(char c[], int i, int j) {
    StringBuilder sb = new StringBuilder();
    for(; i<=j; i++)
      sb.append(c[i]);
    return Long.parseLong(sb.toString());
  }
}
