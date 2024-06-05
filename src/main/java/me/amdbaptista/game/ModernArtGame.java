package me.amdbaptista.game;

import java.util.ArrayList;
import java.util.List;

// TODO: Implement startGame() method  

/*
 * Represents a game of Modern Art
 */
public class ModernArtGame {
    private List<Player> players;
    private Deck deck;

    /*
     * Constructor for ModernArtGame
     * @param num_players Number of players in the game
     */
    public ModernArtGame(int num_players) {
        this.players = new ArrayList<>();
        for (int i = 0; i < num_players; i++) {
            this.players.add(new Player());
        }
        this.deck = new Deck();
    }

    /*
     * Constructor for ModernArtGame
     * @param players List of players in the game
     */
    public ModernArtGame(List<Player> players) {
        this.players = players;
        this.deck = new Deck();
    }

    public ModernArtGame(List<Player> players, Deck deck) {
        this.players = players;
        this.deck = deck;
    }

    public void startGame() {
        deck.shuffle();

        for (int round = 1; round<= 4; round++) {
            distributeCards(round);
        }
    }

    private void distributeCards(int round) {
        int cardsPerPlayer = calculateCardsPerPlayer(round);
        for (Player player : players) {
            player.addCardsToHand(deck.dealCards(cardsPerPlayer));
        }
    }

    private int calculateCardsPerPlayer(int round) {
        int[][] cardsPerRound = {
            {}, // Placeholder for index 0, as there is no case for 1 or 2 players
            {}, // Placeholder for index 1
            {}, // Placeholder for index 2
            {10, 6, 6, 0}, // Cards per round for 3 players
            {9, 4, 4, 0},  // Cards per round for 4 players
            {8, 3, 3, 0}   // Cards per round for 5 players
        };
    
        int numPlayers = this.players.size();
    
        if (numPlayers < 3 || numPlayers > 5) {
            throw new IllegalArgumentException("Unsupported number of players: " + numPlayers);
        }
    
        if (round < 1 || round > 4) {
            throw new IllegalArgumentException("Unsupported round: " + round);
        }
    
        return cardsPerRound[numPlayers][round - 1];
    }
    
}
