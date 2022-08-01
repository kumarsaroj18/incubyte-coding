package kumar.saroj;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BiggestNumberSpec {

    @Test
    @DisplayName("The output should be the largest possible number constructed from the given list of numbers")
    void formTheBiggestNumberWithTheSetOfInputs() {
        BiggestNumberCreator bnc = new BiggestNumberCreator();
        String output1 = bnc.buildTheLargestNumber(Arrays.asList(1, 2, 3, 4));
        String output2 = bnc.buildTheLargestNumber(Arrays.asList(2, 33, 1, 292));
        Assertions.assertAll(
                () -> Assertions.assertEquals("4321", output1),
                () -> Assertions.assertEquals("3329221", output2)
        );
    }
}
