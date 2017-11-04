package org.tdd;

public interface Money {
    //We should use inheritance here by the book but wouldn't interface be better?
    int amount();
    //int currencyID(); dead idea book does is better than i did and also equals method already took care of it
}
