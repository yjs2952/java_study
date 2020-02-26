package ch03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpiryDateCalculatorTest {

    @Test
    void 만원_납부시_한달뒤_만료일이_된다(){
        LocalDate billingDate = LocalDate.of(2019, 3, 1);
        int payAmount = 10_000;
        assertExpiryDate(billingDate, payAmount, LocalDate.of(2019, 4, 1));

        LocalDate billingDate2 = LocalDate.of(2019, 5, 5);
        int payAmount2 = 10_000;
        assertExpiryDate(billingDate2, payAmount2, LocalDate.of(2019,6,5));
    }

    @Test
    void 납부일과_한달_뒤_일자가_다르다(){
        assertExpiryDate(LocalDate.of(2019, 1, 31), 10_000, LocalDate.of(2019, 2, 28));
    }

    private void assertExpiryDate(LocalDate billingDate, int payAmount, LocalDate expectedExpiryDate) {
        ExpiryDateCalculator cal = new ExpiryDateCalculator();
        LocalDate expiryDate = cal.calculateExpiryDate(billingDate, payAmount);
        assertEquals(expectedExpiryDate, expiryDate);
    }
}
