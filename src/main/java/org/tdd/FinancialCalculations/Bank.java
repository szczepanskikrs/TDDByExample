package org.tdd.FinancialCalculations;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Bank {
    private Map rates = new HashMap();

    public Money reduce(Expression source, String currencyTo) {
        return source.reduce(this, currencyTo);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }

    public Integer rate(String convertFrom, String convertTo) {
        if (convertFrom.equals(convertTo)) return 1;
        Integer rate = (Integer) rates.get(new Pair(convertFrom, convertTo));
        return rate.intValue();
    }

}