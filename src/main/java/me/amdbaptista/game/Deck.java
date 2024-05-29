package me.amdbaptista.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        cards.add(new Card(Color.RED, Type.OPEN));
    }

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> dealCards(int numCards) {
        List<Card> dealtCards = new ArrayList<>();
        for (int i = 0; i < numCards && !cards.isEmpty(); i++) {
            dealtCards.add(cards.remove(0));
        }
        return dealtCards;
    }
}
