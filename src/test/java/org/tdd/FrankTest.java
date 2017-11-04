package org.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        Frank testedFrank1 = new Frank(5);
        Frank testedFrank2 = testedFrank1.times(2);
        assertThat(testedFrank2).isEqualTo(new Frank(10));
        testedFrank2 = testedFrank1.times(5);
        assertThat(testedFrank2).isEqualTo(new Frank(25));
    }

    @Test
    void shouldPassWhenFranksAreEqual() {
        assertThat(testedFrank1).isEqualTo(new Frank(5));
        assertThat(testedFrank1).isNotEqualTo(new Frank(10));
    }
}