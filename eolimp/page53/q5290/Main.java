package page53.q5290;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String s = new Scanner(System.in).next();
    HashSet<String> ss = new HashSet<String>();
    for(int i=0, l=s.length(); i<l; i++)
      for(int j=i+1; j<=l; j++)
        ss.add(s.substring(i, j));
    System.out.println(ss.size());
  }
}
