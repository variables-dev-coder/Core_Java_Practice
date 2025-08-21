package day38_Collection_interface;

// Shuffle a Collection
//Show how to shuffle a list of elements randomly.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        List<String> cards = new ArrayList<>();
        cards.add("King");
        cards.add("Queen");
        cards.add("Jack");
        cards.add("Ace");

        Collections.shuffle(cards);
        System.out.println("Shuffled Cards: " + cards);
    }
}

//Shuffled Cards: [Jack, King, Queen, Ace] 