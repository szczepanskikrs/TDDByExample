package org.tdd;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DollarTest {

    @Test
    void shouldPassWhenCorrectValuesArePassedToMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertThat(five).isEqualTo(10);
    }
}