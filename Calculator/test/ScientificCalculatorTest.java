import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {
    // 테스트에서 사용할 ScientificCalculator 객체
    ScientificCalculator sciCalc;

    // 각 테스트 실행 전 객체 생성
    @BeforeEach
    void setup() {
        sciCalc = new ScientificCalculator();
    }

    @Test
    void testPowNormal() {
        sciCalc.setNumbers(2, 4); // 2^4
        assertEquals(16, sciCalc.pow());
    }

    @Test
    void testPowZeroExponent() {
        sciCalc.setNumbers(5, 0); // 5^0
        assertEquals(1, sciCalc.pow());
    }

    @Test
    void testPowOneExponent() {
        sciCalc.setNumbers(9, 1); // 9^1
        assertEquals(9, sciCalc.pow());
    }

    @Test
    void testPowNegativeExponent() {
        sciCalc.setNumbers(2, -3); // 음수 지수
        assertEquals(Integer.MAX_VALUE, sciCalc.pow());
    }

    @Test
    void testPowLargeExponent() {
        sciCalc.setNumbers(3, 5); // 3^5
        assertEquals(243, sciCalc.pow());
    }
}
