package org.tdd;

public interface Expression {
    Money reduce(Bank bank, String reduceTo);
}
