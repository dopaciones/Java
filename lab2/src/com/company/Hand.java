package com.company;

public class Hand {
    private int hand_size = 0;
    private boolean tats = false;
    private boolean main_hand = false;

    public int getHand_size() {
        return hand_size;
    }

    public void setHand_size(int hand_size) {
        this.hand_size = hand_size;
    }

    public boolean isTats() {
        return tats;
    }

    public void setTats(boolean tats) {
        this.tats = tats;
    }

    public boolean isMain_hand() {
        return main_hand;
    }

    public void setMain_hand(boolean main_hand) {
        this.main_hand = main_hand;
    }
}
