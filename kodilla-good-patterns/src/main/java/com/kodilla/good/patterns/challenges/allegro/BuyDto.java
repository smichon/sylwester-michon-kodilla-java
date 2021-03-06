package com.kodilla.good.patterns.challenges.allegro;

public class BuyDto {

    private User user;
    private boolean isBought;

    public BuyDto(User user, boolean isBought) {
        this.user = user;
        this.isBought = isBought;
    }

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }
}
