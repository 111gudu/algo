package com.ferhatelmas.eolimp.page46.q1402;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> res = new ArrayList<Integer>();

    int n, size;
    while(in.hasNextInt()) {
      n=in.nextInt();
      size=in.nextInt();
      res.add(size/(n+1));
    }

    for(int i : res) System.out.println(i);
  }

}