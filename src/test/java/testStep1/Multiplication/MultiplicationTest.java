package testStep1.Multiplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Step1.Multiplication.Multiplication;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {
    Multiplication multipleication;
    @BeforeEach
    void setMain() {
        multipleication = new Multiplication();};

    @Test
    void multiply() {
        // given
        int toMultiple = 123;
        int byMultiple = 456;

        // when
        int result = multipleication.multiply(toMultiple, byMultiple);

        // then
        assertEquals(56088, result);
    }
}
