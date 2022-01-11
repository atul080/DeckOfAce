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
	public static String cards[]= new String[52];
	
	public static void main(String[] args) {
		System.out.println("Welcome to Deck Of Ace program.");
		cardsInitialization();
		print();

	}
	/* method to initialize the cards
	 * loops to get all the possible card combinations
	 */
	public static void cardsInitialization()
	{
		//declaration to index over cards array.
		int k=0;
		for(int i=0;i<rank.length;i++)
		{
			for(int j=0;j<suit.length;j++)
			{
				cards[k]=rank[i]+" of "+suit[j];
				k++;
			}
		}
	}
	/* method to print the cards
	 * loops to get all the combinations and printing it.
	 */
	public static void print()
	{
		for(int i=0;i<52;i++)
			System.out.println(cards[i]);
	}

}
