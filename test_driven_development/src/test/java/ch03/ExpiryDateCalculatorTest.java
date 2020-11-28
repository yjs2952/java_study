package ch03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpiryDateCalculatorTest {

    @Test
    void 만원_납부하면_한달_뒤가_납부일이_됨() {
        assertExpiryDate(
                LocalDate.of(2019, 3, 1),
                10_000,
                LocalDate.of(2019, 4, 1));

        assertExpiryDate(
                LocalDate.of(2019, 5, 5),
                10_000,
                LocalDate.of(2019, 6, 5)
        );
    }

    private void assertExpiryDate(LocalDate billingDate, int payAmount, LocalDate expectedExpiryDate) {
        ExpiryDateCalculator cal = new ExpiryDateCalculator();
        LocalDate expiryDate = cal.calculateExpiryDate(billingDate, payAmount);

        assertEquals(expectedExpiryDate, expiryDate);
    }
}
