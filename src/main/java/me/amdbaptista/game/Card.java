package me.amdbaptista.game;

public class Card {
    // Card attributes
    private Color color;
    private Type type;
    private boolean isBought; // Flag to indicate if the card has been bought
    private int boughtValue; // Value at which the card was bought

    // Constructor
    public Card(Color color, Type type) {
        this.color = color;
        this.type = type;
        this.isBought = false; // Card is not bought initially
        this.boughtValue = 0; // Initialize bought value to 0
    }

    // Getters and setters
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isBought() {
        return isBought;
    }

    public void setBought(boolean bought) {
        isBought = bought;
    }

    public int getBoughtValue() {
        return boughtValue;
    }

    public void setBoughtValue(int boughtValue) {
        this.boughtValue = boughtValue;
    }

    public String toString() {
        return color.name() + " " + type.name();
    }
}
