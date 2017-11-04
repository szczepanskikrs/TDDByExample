package org.tdd;

public class Dollar implements Money  {
    private int amount;
    private Currency currency=Currency.USD;
    public Dollar(int amount) {
        this.amount = amount;

    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dollar dollar = (Dollar) o;
        return amount == dollar.amount;
    }


    @Override
    public int ammount() {
        return amount;
    }

    @Override
    public Dollar convert(Money money) {
        money.currency();
        return new Dollar(amount);
    }

    @Override
    public Currency currency() {
        return currency;
    }

    @Override
    public Money add(Money firstCurrency) {
        return new Dollar(this.amount+(firstCurrency.ammount()/firstCurrency.currency().getValueUSD()));
    }
}
