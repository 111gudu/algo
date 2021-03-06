package page51.q5099;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  private static class Team implements Comparable<Team> {
    private int id, points, score;

    public Team(int id, int points) {
      this.id = id;
      this.points = points;
    }

    @Override
    public int compareTo(Team o) {
      int c = o.points - this.points;
      return c == 0 ? o.score - this.score : c;
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Team teams[] = new Team[in.nextInt()];

    for(int i=0; i<teams.length; i++)
      teams[i] = new Team(i+1, in.nextInt());

    for(Team t : teams) t.score = in.nextInt();

    Arrays.sort(teams);

    StringBuilder sb = new StringBuilder();
    for(Team t : teams) sb.append(' ').append(t.id);
    System.out.println(sb.substring(1));
  }
}
