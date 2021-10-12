package edu.csf.oop.java.poker.GameElements;


import edu.csf.oop.java.poker.Enums.CardColor;
import edu.csf.oop.java.poker.Enums.CardValue;
import edu.csf.oop.java.poker.Lists.ListOfCards;

public class GameStorage {
    ListOfCards myArm = new ListOfCards();
    ListOfCards bot1Arm = new ListOfCards();
    ListOfCards cardsOnTheDesk = new ListOfCards();
    ListOfCards[] arrOfInstances = new ListOfCards[]{deckCreator(), myArm, bot1Arm, cardsOnTheDesk};

    public ListOfCards deckCreator(){
        int i, j;
        CardColor[] cardColorArr = new CardColor[]{CardColor.CLUB, CardColor.DIAMONDS, CardColor.HEART, CardColor.SPADE};
        CardValue[] cardValueArr = new CardValue[]{
                CardValue.TWO,
                CardValue.THREE,
                CardValue.FOUR,
                CardValue.FIVE,
                CardValue.SIX,
                CardValue.SEVEN,
                CardValue.EIGHT,
                CardValue.NINE,
                CardValue.TEN,
                CardValue.JACK,
                CardValue.QUEEN,
                CardValue.KING,
                CardValue.ACE };
        ListOfCards deck = new ListOfCards();
        for (i = 0; i < 4; i++){
            for (j = 0; j < 13; j++){
                deck.headAdd(new Card(cardColorArr[i], cardValueArr[j]));
            }
        }
        return deck;
    }

    public ListOfCards[] getInstances(){
        return arrOfInstances;
    }

}
