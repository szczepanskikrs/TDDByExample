package org.tdd;

import junitparams.JUnitParamsRunner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(JUnitParamsRunner.class)
class MoneyTest {

    Money testedDollar1;
    Money testedDollar2;
    Money testedFrank1;
    Money testedFrank2;


    @BeforeEach
    public void setupTestEnvironment() {
        testedDollar1 = Money.dollar(5, "USD");
        testedDollar2 = Money.dollar(10, "USD");
        testedFrank1 = Money.frank(5, "CHF");
        testedFrank2 = Money.frank(10, "CHF");
    }

    @Test
    void shouldPassWhenCorrectValuesArePassedToMultiplication() {
        assertThat(testedDollar1.times(2)).isEqualTo(testedDollar2);
    }

    @Test
    void shouldPassWhenObjectsAreCreatedInCorrectMannerWithProvidedParameters() {
        Money testedDollar1 = Money.dollar(5, "USD");
        Money testedDollar2 = testedDollar1.times(2);
        assertThat(testedDollar2).isEqualTo(Money.dollar(10, "USD"));
        testedDollar2 = testedDollar1.times(5);
        assertThat(testedDollar2).isEqualTo(Money.dollar(25, "USD"));
    }

    @Test
    void shouldPassWhenDollarsAreEqual() {
        assertThat(testedDollar1).isEqualTo(Money.dollar(5, "USD"));
        assertThat(testedFrank1).isEqualTo(Money.frank(5, "CHF"));
        assertThat(testedDollar1).isNotEqualTo(Money.dollar(10, "USD"));
    }

    @Test
    void shouldPassWhenCurrencyCheckIsOk() {
        assertThat(testedDollar1.currency).isEqualTo("USD");
        assertThat(testedDollar2.currency()).isNotEqualTo("CHF");
    }

    @Test
    void shouldPassWhenAddingResultIsEqualToExpectedResult() {
        Expression sum = new Sum(testedDollar1,testedDollar2);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertThat(testedDollar2).isEqualTo(reduced);
    }
}
