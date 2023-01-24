package com.edstem.learning;

public class fDeck {
    public static void main(String[] args)
    {

        String[]rank={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[]suit={"Spades","Diamond","Clubs","Hearts"};
        String[]deck=new String[52];
        String temp;;
        for(int i=0;i< deck.length;i++) {
            deck[i] = rank[i % 13] + suit[i / 13];
            System.out.println(deck[i]);
        }
        System.out.println("           ");
        for (int i =0; i < deck.length; i++) {
            int y = (int) (Math.random() * (deck.length));
            temp = deck[i];
            deck[i] = deck[y];
            deck[y] = temp;
        }
        for (String s : deck) {
            System.out.println(s);
        }
    }}


