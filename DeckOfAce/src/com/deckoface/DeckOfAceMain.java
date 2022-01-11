/*
 * @author Atul Srivastav
 * @date 11/01/22
 * */
package com.deckoface;

import java.util.Random;

public class DeckOfAceMain {
	//initializing string arrays for suit and rank
	public static final String rank[]={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	public static final String suit[]={"Clubs","Diamond","Hearts","Spades"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Deck Of Ace program.");
		
		//initializing the cards
		int n=suit.length*rank.length;
		int k=0;
		String deck[]= new String[n];
		for(int i=0;i<rank.length;i++)
		{
			for(int j=0;j<suit.length;j++)
			{
				deck[k]=rank[i]+" of "+suit[j];
				k++;
			}
		}
		
		//prinitng the card
		for(int i=0;i<n;i++)
			System.out.println(deck[i]);

	}

}
