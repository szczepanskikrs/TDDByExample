package org.tdd.FinancialCalculations;

public class Frank implements Money {
    private int amount;
    private Currency currency = Currency.CHF;
    //private int currencyID = 1;

    public Frank(int amount) {
        this.amount = amount;

    }
    @Override
    public Money times(int multiplier) {
        return new Frank(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frank frank = (Frank) o;
        return amount == frank.amount;
    }

    @Override
    public int amount() {
        return amount;
    }


    @Override
    public Money convert(Money money) {
        return null;
    }

    @Override
    public Currency currency() {
        return currency;
    }

    @Override
    public Money add(Money firstCurrency) {
        return new Frank(0);
    }

    @Override
    public String currencyType() {
        return currency.currencyMarking;
    }


}
