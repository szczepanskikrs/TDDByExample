package org.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FrankTest {

    Money testedFrank1;
    Money testedFrank2;

    @BeforeEach
    public void setupTestEnvironment() {
        testedFrank1 = Money.frank(5);
        testedFrank2 = Money.frank(10);
    }

    @Test
    void shouldPassWhenCorrectValuesArePassedToMultiplication() {
        assertThat(testedFrank1.times(2)).isEqualTo(Money.frank(10));
    }

    @Test
    void shouldPassWhenObjectsAreCreatedInCorrectMannerWithProvidedParameters() {
        assertThat(testedFrank2).isEqualTo(Money.frank(10));
        testedFrank2 = testedFrank1.times(5);
        assertThat(testedFrank2).isEqualTo(Money.frank(25));
    }

    @Test
    void shouldPassWhenFranksAreEqual() {
        assertThat(testedFrank1).isEqualTo(Money.frank(5));
        assertThat(testedFrank1).isNotEqualTo(Money.frank(10));
    }

    @Test
    void shouldPassWhenCurrencyCheckIsOk() {
        assertThat("CHF").isEqualTo(Money.frank(1).currency());
    }
}