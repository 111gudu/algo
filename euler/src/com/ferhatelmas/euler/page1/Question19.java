package com.ferhatelmas.euler.page1;

public class Question19 {

    public static void main(String[] args) {

        int year = 1900, old = 1, cnt = 0;

        while(year < 2001) {

            old = (old + 3) % 7;
            if(old == 0 && year > 1900) cnt++;


            if(year%4 == 0 || year == 2000) old = (old + 1) % 7;
            if(old == 0 && year > 1900) cnt++;

            old = (old + 3) % 7;
            if(old == 0 && year > 1900) cnt++;

            old = (old + 2) % 7;
            if(old == 0 && year > 1900) cnt++;

            old = (old + 3) % 7;
            if(old == 0 && year > 1900) cnt++;

            old = (old + 2) % 7;
            if(old == 0 && year > 1900) cnt++;

            old = (old + 3) % 7;
            if(old == 0 && year > 1900) cnt++;

            old = (old + 3) % 7;
            if(old == 0 && year > 1900) cnt++;

            old = (old + 2) % 7;
            if(old == 0 && year > 1900) cnt++;

            old = (old + 3) % 7;
            if(old == 0 && year > 1900) cnt++;

            old = (old + 2) % 7;
            if(old == 0 && year > 1900) cnt++;

            old = (old + 3) % 7;
            if(old == 0 && year > 1900) cnt++;

            year++;

        }

        System.out.println(cnt);

    }

}