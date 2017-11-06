package org.tdd;

public class Sum implements Expression {
    Money toAddTo;
    Money toAdd;

    public Money reduce(Bank bank, String reduceTo){
        int amount = toAddTo.amount+toAdd.amount;
        return new Money(amount,reduceTo);
    }

    public Sum(Money toAddTo, Money toAdd) {
        this.toAddTo = toAddTo;
        this.toAdd = toAdd;
    }
}
