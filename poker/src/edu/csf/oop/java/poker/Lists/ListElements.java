package edu.csf.oop.java.poker.Lists;

import edu.csf.oop.java.poker.GameElements.Card;

public class ListElements {
    public Card data;
    public ListElements next;
    public ListElements prev;

    public ListElements(Card data, ListElements next, ListElements prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public ListElements(Card data){
        this.data = data;
    }
}
