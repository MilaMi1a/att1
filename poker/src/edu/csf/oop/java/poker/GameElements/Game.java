package edu.csf.oop.java.poker.GameElements;

import edu.csf.oop.java.poker.Lists.ListOfCards;

public class Game {
    GameStorage gameStorage = new GameStorage();
    ListOfCards[] inst = gameStorage.getInstances();
    public void start(){

       inst[0].print();
        ListOfCards Deck = shuffleMachine();
        System.out.println(" ////////////////////////////////////////////// ");
       Deck.print();



    }

    public ListOfCards shuffleMachine(){
        ListOfCards deck = new ListOfCards();
        final int deckSize = inst[0].getSize();
        for (int i = 0; i < deckSize; i ++){
            deck.headAdd(inst[0].deleteByIndex( (int) (Math.random() * inst[0].getSize())));
        }

        return deck;
    }




}
