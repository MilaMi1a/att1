package edu.csf.oop.java.poker.GameElements;

import edu.csf.oop.java.poker.Enums.CardColor;
import edu.csf.oop.java.poker.Enums.CardValue;

public class Card {
    private final CardColor color;
    private final CardValue value;


    public Card(CardColor color, CardValue value) {
        this.color = color;
        this.value = value;
    }


    public CardColor getColor() {
        return color;
    }

    public CardValue getValue() {
        return value;
    }

}
