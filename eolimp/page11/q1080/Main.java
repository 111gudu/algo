package page11.q1080;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  private static int buf[] = new int[26];

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(); in.nextLine();
    for(int i=0; i<n; )
      System.out.println("Case #" + (++i) + ":  " + getDistance(in.nextLine(), in.nextLine()));
  }

  private static int getDistance(String s1, String s2) {
    Arrays.fill(buf, 0);
    for(char c : s1.toCharArray())
      buf[c-'a']++;
    for(char c : s2.toCharArray())
      buf[c-'a']--;
    int sum = 0;
    for(int i : buf)
      sum += Math.abs(i);
    return sum;
  }
}
