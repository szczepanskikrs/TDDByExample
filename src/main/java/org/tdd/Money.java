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
    abstract Money times(int times);
}
