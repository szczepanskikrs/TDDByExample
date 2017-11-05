package org.tdd;

public abstract class Money {
    protected int amount;

    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    public static Money dollar(int i) {
        return new Dollar(i);
    }

    public static Money frank(int i) {
        return new Frank(i);
    }

    abstract Money times(int times);

    public abstract String currency();
}
