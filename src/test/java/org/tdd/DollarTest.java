package org.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DollarTest {

    @Test
    void shouldPassWhenCorrectValuesArePassedToMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertThat(five.amount).isEqualTo(10);
    }

    @Test
    void shouldPassWhenObjectsAreCreatedInCorrectMannerWithProvidedParameters() {
        Dollar testedDollar1 = new Dollar(5);
        Dollar testedDollar2 = testedDollar1.times(2);
        assertThat(testedDollar1.amount).isEqualTo(testedDollar2.amount);
        testedDollar2 = testedDollar1.times(5);
        assertThat(testedDollar2.amount).isEqualTo(25);
    }
}
