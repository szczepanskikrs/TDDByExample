package org.tdd.FinancialCalculations;

public class Dollar implements Money {
    private int amount;
    private Currency currency = Currency.USD;

    public Dollar(int amount) {
        this.amount = amount;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dollar dollar = (Dollar) o;
        return amount == dollar.amount;
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
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
        if (firstCurrency.currency() != this.currency) {
            return new Dollar(this.amount + (firstCurrency.amount() / firstCurrency.currency().getValueUSD()));
        } else
            return new Dollar(this.amount + firstCurrency.amount());
    }

    @Override
    public String currencyType() {
        return currency.currencyMarking;
    }


}
