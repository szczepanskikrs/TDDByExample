package org.tdd.FinancialCalculations;

public interface Expression {
    Money reduce(Bank bank, String reduceTo);

    Expression plus(Expression tenFrancs);

    Expression times(int multiplier);
}
