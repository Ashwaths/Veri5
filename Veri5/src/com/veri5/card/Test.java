package com.veri5.card;

public class Test {

	 public static void main(String[] args) {

	        int n=10; // Number of cards to deal for test
	        DeckOfCards deck=new DeckOfCards();
	        deck.printStack();
	        deck.shuffle(10);

	        System.out.println("----------------------------  After shuffle -----------------------------------------------\n");
	            deck.shuffle(30);
	            deck.printStack();

	        System.out.println("----------------------------  Dealing 10 cards  -----------------------------------------------\n");
	            for(int i=0;i<n;i++){
	                deck.deal();
	            }

	        System.out.println("--------------------------    After Sort ---------------------------------------------\n");
	            deck.sort();
	            deck.printStack();

	        System.out.println("----------------------------  Dealing 10 cards  -----------------------------------------------\n");
	            for(int i=0;i<n;i++){
	                deck.deal();
	            }

	        System.out.println("----------------------------  Putting back all cards  -----------------------------------------------\n");
	            deck.resetdesk();

	        System.out.println("--------------------------    After Sort ---------------------------------------------\n");
	            deck.sort();
	            deck.printStack();

	        System.out.println("----------------------------  Dealing 10 cards  -----------------------------------------------\n");
	            for(int i=0;i<n;i++){
	                deck.deal();
	            }
	    }
}
