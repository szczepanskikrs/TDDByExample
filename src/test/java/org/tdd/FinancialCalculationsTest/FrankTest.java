package org.tdd.FinancialCalculationsTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tdd.FinancialCalculations.Dollar;
import org.tdd.FinancialCalculations.Frank;
import org.tdd.FinancialCalculations.Money;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FrankTest {

    Frank testedFrank1;
    Frank testedFrank2;

    @BeforeEach
    public void setupTestEnvironment() {
        testedFrank1 = new Frank(5);
        testedFrank2 = new Frank(10);
    }

    @Test
    void shouldPassWhenCorrectValuesArePassedToMultiplication() {
        assertThat(testedFrank1.times(2)).isEqualTo(testedFrank2);
    }

    @Test
    void shouldPassWhenObjectsAreCreatedInCorrectMannerWithProvidedParameters() {
        Money testedFrank1 = new Frank(5);
        Money testedFrank2 = testedFrank1.times(2);
        assertThat(testedFrank2).isEqualTo(new Frank(10));
        testedFrank2 = testedFrank1.times(5);
        assertThat(testedFrank2).isEqualTo(new Frank(25));
    }

    @Test
    void shouldPassWhenFranksAreEqual() {
        assertThat(testedFrank1).isEqualTo(new Frank(5));
        assertThat(testedFrank1).isNotEqualTo(new Frank(10));
    }

    @Test
    void shouldPassWhenAddingCorrectParametersIsCorrect() {
        assertThat(testedFrank1.add(new Dollar(20))).isEqualTo(new Frank(45));
    }

    @Test
    void shouldPassIfAddingTwoDollarsWillBringExpectedResult() {
        assertThat(testedFrank1.add(testedFrank2)).isEqualTo(new Frank(15));
    }

    @Test
    void shouldPassIfCurrencyNameIsCorrect() {
        assertThat(testedFrank1.currencyType()).isEqualTo("CHF");
        assertThat(testedFrank1.currencyType()).isNotEqualTo("WOLOLO");
    }
}