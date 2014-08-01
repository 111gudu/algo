package page53.q5288;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    TreeSet<String> t = generateSubs(in.next());
    t.retainAll(generateSubs(in.next()));
    int n = in.nextInt();
    while(n-- > 1) {
      t.pollFirst();
    }
    System.out.println(t.pollFirst());
  }

  private static TreeSet<String> generateSubs(String s) {
    TreeSet<String> t = new TreeSet<String>();
    for(int i=0, l=s.length(); i<l; i++) {
      for (int j = i + 1; j <= l; j++) {
        t.add(s.substring(i, j));
      }
    }
    return t;
  }
}
