package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InputViewTest {
    // getCarNumber
    @Test
    void inputShouldBeOneToNine() {
        assertThat(InputView.isInputRange(8)).isTrue();
        assertThat(InputView.isInputRange(11)).isFalse();
    }
    // getTryNumber
}
