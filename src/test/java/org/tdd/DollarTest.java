package org.tdd;

import junitparams.JUnitParamsRunner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(JUnitParamsRunner.class)
class DollarTest {

    Money testedDollar1;
    Money testedDollar2;

    @BeforeEach
    public void setupTestEnvironment() {
        testedDollar1 = Money.dollar(5);
        testedDollar2 = Money.dollar(10);
    }

    @Test
    void shouldPassWhenCorrectValuesArePassedToMultiplication() {
        assertThat(testedDollar1.times(2)).isEqualTo(testedDollar2);
    }

    @Test
    void shouldPassWhenObjectsAreCreatedInCorrectMannerWithProvidedParameters() {
        Money testedDollar1 = Money.dollar(5);
        Money testedDollar2 = testedDollar1.times(2);
        assertThat(testedDollar2).isEqualTo(Money.dollar(10));
        testedDollar2 = testedDollar1.times(5);
        assertThat(testedDollar2).isEqualTo(Money.dollar(25));
    }

    @Test
    void shouldPassWhenDollarsAreEqual() {
        assertThat(testedDollar1).isEqualTo(Money.dollar(5));
        assertThat(testedDollar1).isNotEqualTo(Money.dollar(10));
    }

    @Test
    void shouldPassWhenDollarIsNotEqualToOtherTypeOfMoney() {
        assertThat(testedDollar1).isNotEqualTo(new Frank(5));
    }

    @Test
    void shouldPassWhenCurrencyCheckIsOk() {
        assertThat("USD").isEqualTo(Money.dollar(1).currency());
    }
}
