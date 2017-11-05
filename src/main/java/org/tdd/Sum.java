package org.tdd;

public class Sum implements Expression {
    Money toAddTo;
    Money toAdd;

    public Sum(Money toAddTo, Money toAdd) {
        this.toAddTo = toAddTo;
        this.toAdd = toAdd;
    }
}
