package me.amdbaptista.game;

import java.util.List;

public class Auction {
    private List<Player> players;
    private Card firstCard;
    private Card secondCard;
    private Player highestBidder;
    private int highestBid;

    public Auction(List<Player> players, Card card) {
        this.players = players;
        this.firstCard = card;
        this.secondCard = null;
        this.highestBidder = null;
        this.highestBid = 0;
    }

    public Auction(List<Player> players, Card firstCard, Card secondCard) {
        this.players = players;
        this.firstCard = firstCard;
        this.secondCard = secondCard;
        this.highestBidder = null;
        this.highestBid = 0;
    }

    public void start() {

    }

    public Player getHighestBidder() {
        return highestBidder;
    }

    public int getHighestBid() {
        return highestBid;
    }
}
