package com.Igor;

import java.util.*;

// Write your Checker class here
class Checker implements Comparator{
    @Override
    public int compare(Object a1, Object b1){
        Player a = (Player)a1;
        Player b = (Player)b1;
        if(a.score>b.score)
            return -1;
        else
            if(a.score<b.score)
                return 1;
            else
                return a.name.compareTo(b.name);
    }
}
class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}


class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
