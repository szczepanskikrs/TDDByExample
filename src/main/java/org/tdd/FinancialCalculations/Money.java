package org.tdd.FinancialCalculations;

public interface Money {
    //We should use inheritance here by the book but wouldn't interface be better
    int amount();

    Money times(int multiplier);

    Money convert(Money money);

    Currency currency();

    Money add(Money currencyToAdd);

    String currencyType();
}
