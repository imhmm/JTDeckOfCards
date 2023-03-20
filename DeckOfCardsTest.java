import java.io.*;
import java.util.*;
import java.util.ArrayList;


public class DeckOfCardsTest {
   public static void main(String[] args) {
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle();
      
      //converts myDeckOfCards into a stack
      Stack<String> stockPile = new Stack<String>();
      for (int k = 0; k < 52; k++) {
         stockPile.push((myDeckOfCards.dealCard()).toString());
      }
      
      // creates the arraylists for each player's hands
      ArrayList<String> playerHand1 = new ArrayList<String>();
      ArrayList<String> playerHand2 = new ArrayList<String>();
      ArrayList<String> playerHand3 = new ArrayList<String>();
      ArrayList<String> playerHand4 = new ArrayList<String>();
     
      
      //deals out 4 cards to each player
      for (int i = 1; i <= 16; i++) {
         if (i == 1 || i == 5 || i == 9 || i == 13) {
            playerHand1.add(stockPile.pop());
         }
         else if (i == 2 || i == 6 || i == 10 || i == 14) {
            playerHand2.add(stockPile.pop());
         }
         else if (i == 3 || i == 7 || i == 11 || i == 15) {
            playerHand3.add(stockPile.pop());
         }
         else {
            playerHand4.add(stockPile.pop());
         }
      }// end of for loop 
     
     // creates count variables as indexes for replacing cards
     int count1 = 0;
     int count2 = 0;
     int count3 = 0;
     int count4 = 0;
     
     //plays game, checks if first card in player's hand matches card in rotation
     //continues until winner
     //if not matches, keep going into discard pile (QUEUE)
     
     
     //insert game here
     
                
   }// end of main method
   
   
   
   //method for checking if there is a winner
   public static void checkWin (ArrayList<String> playerHand) {
      // sets the face of each card into a variable for comparing later
      String playerFace1 = (playerHand.get(1)).substring(0, ((playerHand.get(1)).indexOf(' ')));
      String playerFace2 = (playerHand.get(2)).substring(0, ((playerHand.get(2)).indexOf(' ')));
      String playerFace3 = (playerHand.get(3)).substring(0, ((playerHand.get(3)).indexOf(' ')));
      String playerFace4 = (playerHand.get(4)).substring(0, ((playerHand.get(4)).indexOf(' ')));      
   
      // checks if the face of each card is the same and prints winning text
      if (playerFace1.equals(playerFace2) && playerFace2.equals(playerFace3) && playerFace3.equals(playerFace4)) {
         System.out.println("We have a winner!");
         System.out.println("Here is the winning hand:");
         System.out.println(playerHand.toString());
      }
   }// end of checkWin method
   
}// end of DeckOfCardsTest

