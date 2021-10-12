package edu.csf.oop.java.poker.Lists;

import edu.csf.oop.java.poker.GameElements.Card;

public class ListOfCards {
    private ListElements head;
    private ListElements tail;
    private int size = 0;



    public ListOfCards(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){ return head == null; }

    public int getSize(){ return size; }

    public void headAdd(Card data){
        ListElements temp = new ListElements(data);

        if (isEmpty()){
            head = temp;
            tail = temp;
        }else{
            head.prev = temp;
            temp.next = head;
            temp.prev = null;
            head = temp;
        }
        size++;
    }

    public void tailAdd(Card data){
        ListElements temp = new ListElements(data);

        if (isEmpty()){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            temp.prev = tail;
            temp.next = null;
            tail = temp;
        }
        size++;
    }

    public Card headPoll(){
        if (head.data == null){
            return null;
        }
        return head.data;
    }

    public Card tailPoll(){
        if (tail.data == null){
            return null;
        }
        return tail.data;
    }

    public void print(){
        ListElements temp = head;
        int i = 1;
        while (temp != null){
            System.out.print(i + " ");
            System.out.print(temp.data.getValue());
            System.out.print(" ");
            System.out.println(temp.data.getColor());
            temp = temp.next;
            i++;
        }
    }

    public Card deleteByIndex(int index){
        if(index == -1){
            return null;
        }

        if (index == 0){
            ListElements curr = head;
            head = head.next;
            size--;
            return curr.data;
        }

        if (head == null){ return null; }

        if (head == tail){
            size--;
            head = null;
            tail = null;
        }
        ListElements t = head;
        ListElements curr;
        int c = 0;
        while (t.next != null){
            if (c + 1 == index){
                curr = t.next;
                t.next = t.next.next;
                size--;
                return curr.data;
            }else{
                t = t.next;
                c++;
            }
        }
        return null;
    }




}
