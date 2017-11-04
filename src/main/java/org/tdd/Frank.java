package org.tdd;

public class Frank implements Money {
    private int amount;
    //private int currencyID = 1;

    public Frank(int amount) {
        this.amount = amount;

    }

    public Frank times(int multiplier) {
        return new Frank(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frank frank = (Frank) o;
        //if(currencyID!=frank.currencyID) return false;
        return amount == frank.amount;
    }

    @Override
    public int amount() {
        return amount;
    }

//    @Override
//    public int currencyID() {
//        return currencyID;
//    }
}
