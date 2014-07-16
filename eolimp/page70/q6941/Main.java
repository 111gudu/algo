package page70.q6941;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt(), sum, ns[];

    while(t-- > 0) {
      ns = new int[in.nextInt()];
      for(int i=0; i<ns.length; i++) ns[i] = in.nextInt();
      sum = 0;
      for(int i=0; i<ns.length; i++) {
        for(int j=i+1; j<ns.length; j++) {
          sum += gcd(ns[i], ns[j]);
        }
      }
      System.out.println(sum);
    }
  }

  private static int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a%b);
  }
}
