/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

import java.util.Random;
import java.util.Scanner;

/**
 * step1 : generate 7 random cards and store in array - how step 2: take any
 * card input from user suit,number step 3: user card is in the array 'card is
 * found'
 *
 * @author sivagamasrinivasan,May 23rd
 * @modifer Om Patel 
 * @args Student Number : 991653947
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7]; //Array of object
        Random num = new Random();
        System.out.print("Prinnting cards");
        for (int i = 0; i < magicHand.length; i++) {
            Card c1 = new Card();
            c1.setValue(num.nextInt(12) + 1);//use a method to generate random *13
            c1.setSuits(Card.SUITS[num.nextInt(4)]);//random method suit 

            System.out.println();
            magicHand[i] = (c1);
            System.out.print(magicHand[i].getValue() + " of ");
            System.out.print(magicHand[i].getSuits());

        }
        System.out.println();
        System.out.println();
        
//         Card luckyCard = new Card()
//         luckyCard.setValue(5);
//         luckyCard.setSuits("hearts");

        //step 2:take input 
        int cardValue;
        int suits;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter suit from the following");
        int i = 1;
        for (String Deck : Card.SUITS) {

            System.out.print(i + " " + Deck + "\n");
            i++;
        }
        System.out.println("Enter suit (1-4)" + " :");
        suits = sc.nextInt();
        System.out.print("Enter the value of the card(1-12): ");
        cardValue = sc.nextInt();

        //step 3: match with array 
        boolean detected = false;
        Card InputUser = new Card();
        InputUser.setValue(cardValue);

        switch (suits) {
            case 1 ->
                InputUser.setSuits(Card.SUITS[0]);
            case 2 ->
                InputUser.setSuits(Card.SUITS[1]);
            case 3 ->
                InputUser.setSuits(Card.SUITS[2]);
            case 4 ->
                InputUser.setSuits(Card.SUITS[3]);
            default -> {
            }
        }

        for (Card magicHand1 : magicHand) {
            if (magicHand1.getValue() == InputUser.getValue() && magicHand1.getSuits().equals(InputUser.getSuits())) {
                detected = true;
                break;
            }
        }

        if (detected) {
            System.out.print("Card is founded ");
        } else {
            System.out.print("Card is not founded, Sorry...... ");
        }
    }

}
