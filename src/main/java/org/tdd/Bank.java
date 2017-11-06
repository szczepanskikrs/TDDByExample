package org.tdd;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map rates = new HashMap();
    public Money reduce(Expression source, String currencyTo) {
        return source.reduce(this, currencyTo);
    }

    public void addRate(String chf, String usd, int i) {
    }

    Integer rate(String convertFrom, String convertTo){
        if(convertFrom.equals(convertTo)) return 1;
        Integer rate = (Integer) rates.get(new Pair(convertFrom,convertTo));
    return rate.intValue();}

    void addRate(String currencyName, int rate){
        rates.put(currencyName,rate);
    }
}
