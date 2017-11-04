package org.tdd;

public interface Money {
    //We should use inheritance here by the book but wouldn't interface be better
    Dollar convert(Money money);
    Currency currency();
}
