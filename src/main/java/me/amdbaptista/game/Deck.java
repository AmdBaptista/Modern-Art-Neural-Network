package me.amdbaptista.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        cards.add(new Card(Color.RED, Type.OPEN));
        cards.add(new Card(Color.RED, Type.OPEN));
        cards.add(new Card(Color.RED, Type.OPEN));
        cards.add(new Card(Color.RED, Type.OPEN));
        cards.add(new Card(Color.RED, Type.FIXED));
        cards.add(new Card(Color.RED, Type.FIXED));
        cards.add(new Card(Color.RED, Type.FIXED));
        cards.add(new Card(Color.RED, Type.HIDDEN));
        cards.add(new Card(Color.RED, Type.HIDDEN));
        cards.add(new Card(Color.RED, Type.HIDDEN));
        cards.add(new Card(Color.RED, Type.SINGULAR));
        cards.add(new Card(Color.RED, Type.SINGULAR));
        cards.add(new Card(Color.RED, Type.SINGULAR));
        cards.add(new Card(Color.RED, Type.DOUBLE));
        cards.add(new Card(Color.RED, Type.DOUBLE));
        cards.add(new Card(Color.RED, Type.DOUBLE));
        cards.add(new Card(Color.BLUE, Type.OPEN));
        cards.add(new Card(Color.BLUE, Type.OPEN));
        cards.add(new Card(Color.BLUE, Type.OPEN));
        cards.add(new Card(Color.BLUE, Type.FIXED));
        cards.add(new Card(Color.BLUE, Type.FIXED));
        cards.add(new Card(Color.BLUE, Type.FIXED));
        cards.add(new Card(Color.BLUE, Type.HIDDEN));
        cards.add(new Card(Color.BLUE, Type.HIDDEN));
        cards.add(new Card(Color.BLUE, Type.HIDDEN));
        cards.add(new Card(Color.BLUE, Type.SINGULAR));
        cards.add(new Card(Color.BLUE, Type.SINGULAR));
        cards.add(new Card(Color.BLUE, Type.SINGULAR));
        cards.add(new Card(Color.BLUE, Type.DOUBLE));
        cards.add(new Card(Color.BLUE, Type.DOUBLE));
        cards.add(new Card(Color.BLUE, Type.DOUBLE));
        cards.add(new Card(Color.ORANGE, Type.OPEN));
        cards.add(new Card(Color.ORANGE, Type.OPEN));
        cards.add(new Card(Color.ORANGE, Type.OPEN));
        cards.add(new Card(Color.ORANGE, Type.OPEN));
        cards.add(new Card(Color.ORANGE, Type.FIXED));
        cards.add(new Card(Color.ORANGE, Type.FIXED));
        cards.add(new Card(Color.ORANGE, Type.FIXED));
        cards.add(new Card(Color.ORANGE, Type.HIDDEN));
        cards.add(new Card(Color.ORANGE, Type.HIDDEN));
        cards.add(new Card(Color.ORANGE, Type.HIDDEN));
        cards.add(new Card(Color.ORANGE, Type.SINGULAR));
        cards.add(new Card(Color.ORANGE, Type.SINGULAR));
        cards.add(new Card(Color.ORANGE, Type.SINGULAR));
        cards.add(new Card(Color.ORANGE, Type.DOUBLE));
        cards.add(new Card(Color.ORANGE, Type.DOUBLE));
        cards.add(new Card(Color.PURPLE, Type.OPEN));
        cards.add(new Card(Color.PURPLE, Type.OPEN));
        cards.add(new Card(Color.PURPLE, Type.OPEN));
        cards.add(new Card(Color.PURPLE, Type.OPEN));
        cards.add(new Card(Color.PURPLE, Type.FIXED));
        cards.add(new Card(Color.PURPLE, Type.FIXED));
        cards.add(new Card(Color.PURPLE, Type.FIXED));
        cards.add(new Card(Color.PURPLE, Type.HIDDEN));
        cards.add(new Card(Color.PURPLE, Type.HIDDEN));
        cards.add(new Card(Color.PURPLE, Type.HIDDEN));
        cards.add(new Card(Color.PURPLE, Type.SINGULAR));
        cards.add(new Card(Color.PURPLE, Type.SINGULAR));
        cards.add(new Card(Color.PURPLE, Type.DOUBLE));
        cards.add(new Card(Color.PURPLE, Type.DOUBLE));
        cards.add(new Card(Color.GREEN, Type.OPEN));
        cards.add(new Card(Color.GREEN, Type.OPEN));
        cards.add(new Card(Color.GREEN, Type.OPEN));
        cards.add(new Card(Color.GREEN, Type.OPEN));
        cards.add(new Card(Color.GREEN, Type.FIXED));
        cards.add(new Card(Color.GREEN, Type.FIXED));
        cards.add(new Card(Color.GREEN, Type.FIXED));
        cards.add(new Card(Color.GREEN, Type.HIDDEN));
        cards.add(new Card(Color.GREEN, Type.HIDDEN));
        cards.add(new Card(Color.GREEN, Type.SINGULAR));
        cards.add(new Card(Color.GREEN, Type.SINGULAR));
        cards.add(new Card(Color.GREEN, Type.DOUBLE));
        cards.add(new Card(Color.GREEN, Type.DOUBLE));
        shuffle();
    }

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public boolean removeCard(Card card) {
        return cards.remove(card);
    }

    public boolean addCard(Card card) {
        return cards.add(card);
    }

    public int size() {
        return cards.size();
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> dealCards(int numCards) {
        List<Card> dealtCards = new ArrayList<>();
        for (int i = 0; i < numCards && !cards.isEmpty(); i++) {
            dealtCards.add(cards.remove(0));
        }
        return dealtCards;
    }

    public void addCards(List<Card> newCards) {
        cards.addAll(newCards);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deck (Size: "+ size() +"): ");
        for (Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
