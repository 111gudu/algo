package page49.q4841;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    HashMap<String, Integer> h = new HashMap<String, Integer>();
    while(in.hasNext()) {
      String s = in.next();
      h.put(s, 1 + (h.containsKey(s) ? h.get(s) : 0));
    }
    for(Map.Entry<String, Integer> e : getSortedEntries(h))
      System.out.println(e.getKey());
  }

  private static SortedSet<Map.Entry<String, Integer>> getSortedEntries(Map<String, Integer> h) {
    SortedSet<Map.Entry<String, Integer>> s = new TreeSet<Map.Entry<String, Integer>>(new Comparator<Map.Entry<String, Integer>>() {
      @Override
      public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        int c = o1.getValue() - o2.getValue();
        return c == 0 ? o1.getKey().compareTo(o2.getKey()) : c;
      }
    });
    s.addAll(h.entrySet());
    return s;
  }
}
