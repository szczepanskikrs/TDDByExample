package org.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MoneyTest {

    Money testedDollar1;
    Money testedDollar2;
    Money testedFrank1;
    Money testedFrank2;


    @BeforeEach
    public void setupTestEnvironment() {
        testedDollar1 = Money.dollar(5);
        testedDollar2 = Money.dollar(10);
        testedFrank1 = Money.frank(5);
        testedFrank2 = Money.frank(10);
    }

    @Test
    void shouldPassWhenCorrectValuesArePassedToMultiplication() {
        assertThat(testedDollar1.times(2)).isEqualTo(testedDollar2);
    }

    @Test
    void shouldPassWhenObjectsAreCreatedInCorrectMannerWithProvidedParameters() {
        Money testedDollar1 = Money.dollar(5);
        Expression testedDollar2 = testedDollar1.times(2);
        assertThat(testedDollar2).isEqualTo(Money.dollar(10));
        testedDollar2 = testedDollar1.times(5);
        assertThat(testedDollar2).isEqualTo(Money.dollar(25));
    }

    @Test
    void shouldPassWhenDollarsAreEqual() {
        assertThat(testedDollar1).isEqualTo(Money.dollar(5));
        assertThat(testedFrank1).isEqualTo(Money.frank(5));
        assertThat(testedDollar1).isNotEqualTo(Money.dollar(10));
    }

    @Test
    void shouldPassWhenCurrencyCheckIsOk() {
        assertThat(testedDollar1.currency).isEqualTo("USD");
        assertThat(testedDollar2.currency()).isNotEqualTo("CHF");
    }

    @Test
    void shouldPassWhenAddingResultIsEqualToExpectedResult() {
        Expression sum = new Sum(testedDollar1, testedDollar2);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertThat(Money.dollar(15)).isEqualTo(reduced);
    }

    @Test
    void shouldPassWhenReduceIsSuccessful() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.frank(2), "USD");
        assertThat(Money.dollar(1)).isEqualTo(result);
    }

// Redundant
// @Test
//    void shouldPassWhenTestArraysAreEqual() {
//        assertThat(new Object[]{"abc"}).isEqualTo(new Object[]{"abc"});

    @Test
    void shouldPassWhenRatesAreEqual() {
        assertThat(new Bank().rate("USD", "USD"));
    }

    @Test
    void shouldPassWhenAdditionOfTwoDifferentMoneyTypesIsSuccessful() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(testedDollar1.add(testedFrank2), "USD");
        assertThat(Money.dollar(10)).isEqualTo(result);
    }

    @Test
    void shouldPassWhenAdditionIsSuccessful() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.frank(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(fiveBucks.plus(tenFrancs), "USD");
        assertThat(Money.dollar(10)).isEqualTo(result);
    }

    @Test
    void shouldPassWhenPlusExpressionIsSuccessful() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFranks = Money.frank(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum = new Sum(fiveBucks, tenFranks).plus(fiveBucks);
        Money result = bank.reduce(sum, "USD");
        assertThat(Money.dollar(15)).isEqualTo(result);
    }

    @Test
    void shouldPassWhenTimesMethodOnSumIsSuccessful() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFranks = Money.frank(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum = new Sum(fiveBucks, tenFranks).times(2);
    }
}