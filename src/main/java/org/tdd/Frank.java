package org.tdd;

public class Frank implements Money{
    private int amount;
    private Currency currency=Currency.CHF;
    //private int currencyID = 1;

    public Frank(int amount) {
        this.amount = amount;

    }

    public Frank times(int multiplier) {
        return new Frank(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frank frank = (Frank) o;
        return amount == frank.amount;
    }

    Currency checkCurrency(){
        return currency;
    }

    @Override
    public int ammount() {
        return amount;
    }

    @Override
    public Dollar convert(Money money) {
        return null;
    }

    @Override
    public Currency currency() {
        return currency;
    }

    @Override
    public Money add(Money firstCurrency) {
        return null;
    }


}
