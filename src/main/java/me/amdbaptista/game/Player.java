package me.amdbaptista.game;

import java.util.ArrayList;
import java.util.List;

public class Player {
    // Player attributes
    private int gold;
    private List<Card> hand; // Cards currently in the player's hand
    private List<Card> boughtCards; // Cards bought by the player

    // Constructor
    public Player() {
        this.gold = 100; // Start with 100 gold
        this.hand = new ArrayList<>();
        this.boughtCards = new ArrayList<>();
    }

    // Method to add cards to the player's hand
    public void addCardsToHand(List<Card> cards) {
        hand.addAll(cards);
    }

    // Getters and setters
    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public List<Card> getBoughtCards() {
        return boughtCards;
    }

    public void setBoughtCards(List<Card> boughtCards) {
        this.boughtCards = boughtCards;
    }

    public String toString() {
        return "Gold: " + gold + " ,Hand: " + hand.size() + " ,Bought Cards: " + boughtCards.size();
    }
}
