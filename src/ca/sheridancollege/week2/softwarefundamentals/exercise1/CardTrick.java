/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author-Ramandeep Kaur Sidhu
 * Student Number- 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int value=(int)(Math.random()*13+1);
            c.setValue(value);
            int SuitCard=(int)(Math.random()*4);
            c.setSuit(Card.SUITS[SuitCard]);
            magicHand[i]=c;
            
            
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Card luckyCard=new Card();
        luckyCard.setSuit("Heart");
        luckyCard.setValue(4);
        
        //insert code to ask the user for Card value and suit, create their car
       
      
        }
       
        
    }
   
   
    
    
                    
            
            
                    
        }

        //Then report the result here
    
    

