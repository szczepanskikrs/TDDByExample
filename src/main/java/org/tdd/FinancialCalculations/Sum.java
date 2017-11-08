package org.tdd.FinancialCalculations;

public class Sum implements Expression {
    Expression toAddTo;
    Expression toAdd;
    private Bank bank = new Bank();

    public Sum(Expression toAddTo, Expression toAdd) {
        this.toAddTo = toAddTo;
        this.toAdd = toAdd;
    }

    public Money reduce(Bank bank, String reduceTo) {
        int amount = toAddTo.reduce(bank, reduceTo).amount +
                toAdd.reduce(bank, reduceTo).amount;
        return new Money(amount, reduceTo);
    }

    @Override
    public Expression plus(Expression adder) {
        return new Sum(this, adder);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(toAddTo.times(multiplier), toAdd.times(multiplier));
    }

    public Sum(Money toAddTo, Money toAdd) {
        this.toAddTo = toAddTo;
        this.toAdd = toAdd;
    }

}