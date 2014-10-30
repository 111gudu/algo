package page10.q971;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), k = in.nextInt();
    ArrayList<Integer> ns = new ArrayList<Integer>(n);
    for(int i=1; i<=n; i++) ns.add(i);

    int i = 0, j = 0;
    while(n > 1) {
      j = (++j) % k;
      if(j == 0) {
        n--;
        ns.remove(i);
      } else {
        i = (++i) % n;
      }
    }

    System.out.println(ns.get(0));
  }
}
