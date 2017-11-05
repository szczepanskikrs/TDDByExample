package org.tdd;

public class Frank extends Money {

    public Frank(int amount) {
        this.amount = amount;

    }

    public Frank times(int multiplier) {
        return new Frank(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount;
    }
}
