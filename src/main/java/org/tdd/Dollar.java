package org.tdd;

public class Dollar implements Money {
    private int amount;
    //private int currencyID = 0;

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
        //if (currencyID != dollar.currencyID) return false;
        return amount == dollar.amount;
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
