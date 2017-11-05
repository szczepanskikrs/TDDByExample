package org.tdd;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;

    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount;
    }
}
