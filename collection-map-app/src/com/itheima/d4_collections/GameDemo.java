package com.itheima.d4_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    目标：斗地主游戏的案例开发。
    业务需求分析:
        业务: 总共有54张牌。
        点数: "3","4","5","6","7","8","9","10","J","Q","K","A","2"
        花色: "♠", "♥", "♣", "♦"
        大小王: "👲" , "🃏"
        点数分别要组合4种花色，大小王各一张。
        斗地主：发出51张牌，剩下3张作为底牌。
 */
public class GameDemo {
    private ArrayList<Card> cards = new ArrayList<>();
    private String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

    private String[] colors = {"♠", "♥", "♣", "♦"};

    public GameDemo() {
        int size=0;
        for (String num : nums) {
            size++;
            for (String color : colors) {
                Card card = new Card(num, color, size);
                cards.add(card);
            }
        }
        cards.add(new Card("🃏","",++size));
        cards.add(new Card("👲","",++size));
        System.out.println(cards);
    }
    public void start() {
        Collections.shuffle(cards);
        System.out.println("-------------洗牌后----------");
        System.out.println(cards);
        ArrayList<Card> player1 = new ArrayList<>();
        ArrayList<Card> player2 = new ArrayList<>();
        ArrayList<Card> player3 = new ArrayList<>();
        for (int i = 0; i < cards.size()-3; i++) {
            Card card = cards.get(i);
            switch (i % 3) {
                case 0:player1.add(card);break;
                case 1:player2.add(card);break;
                case 2:player3.add(card);break;
            }
        }
        System.out.println("---------------发牌后-----------------");
        System.out.println("p1:"+player1);
        System.out.println("p2:"+player2);
        System.out.println("p3:"+player3);
        Collections.sort(player1, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getSize() - o1.getSize();
            }
        });
        Collections.sort(player2,(a,b)-> b.getSize() - a.getSize());
        Collections.sort(player3,(a,b)-> b.getSize() - a.getSize());
        System.out.println("--------------排序后------------");
        System.out.println("p1:"+player1);
        System.out.println("p2:"+player2);
        System.out.println("p3:"+player3);
        System.out.println("玩家1拿到地主");
        Card card1 = cards.get(53);
        Card card2 = cards.get(53);
        Card card3 = cards.get(53);
        player1.add(card1);
        player1.add(card2);
        player1.add(card3);
        System.out.println("p1:"+player1);
        System.out.println("p2:"+player2);
        System.out.println("p3:"+player3);

        Collections.sort(player1, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getSize() - o1.getSize();
            }
        });
        Collections.sort(player2,(a,b)-> b.getSize() - a.getSize());
        Collections.sort(player3,(a,b)-> b.getSize() - a.getSize());
        System.out.println("拿到地主后排序");
        System.out.println("p1:"+player1);
        System.out.println("p2:"+player2);
        System.out.println("p3:"+player3);
    }
}










