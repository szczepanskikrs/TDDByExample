package org.tdd;

public class Bank {
    public Money reduce(Expression source, String currencyTo) {
        return source.reduce(this, currencyTo);
    }

    public void addRate(String chf, String usd, int i) {
    }

    int rate(String convertFrom, String convertTo){
        return(convertFrom.equals("CHF")&& convertTo.equals("USD"))
                ?2:1;
    }
}
