package ch02;

import org.junit.jupiter.api.Test;

import static ch02.PasswordStrength.*;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordStrengthMeterTest {

    PasswordStrengthMeter meter = new PasswordStrengthMeter();

    @Test
    public void meetsAllCriteria_then_strong() throws Exception {
        assertStrength("ab12!@AB", STRONG);
        assertStrength("abc1!Add", STRONG);
    }

    @Test
    public void meetsAllCriteria_except_for_length_then_normal() throws Exception {
        assertStrength("ab12!@A", NORMAL);
        assertStrength("AB12!c", NORMAL);
    }

    @Test
    public void meetsAllCriteria_except_for_number_then_normal() throws Exception {
        assertStrength("abABqwer", NORMAL);
    }

    @Test
    public void nullInput_then_invalid() throws Exception {
        assertStrength("", INVALID);
    }

    @Test
    public void meets_other_criteria_except_for_uppercase_then_normal() throws Exception {
        assertStrength("ab12!@df", NORMAL);
    }

    @Test
    public void meets_only_length_criteria__then_weak() throws Exception {
        assertStrength("abdefghi", WEAK);
    }

    @Test
    public void meets_only_num_criteria__then_weak() throws Exception {
        assertStrength("12345", WEAK);
    }

    @Test
    public void meets_only_upper_criteria_then_weak() throws Exception {
        assertStrength("ABZEF", WEAK);
    }

    @Test
    public void meets_no_criteria_then_weak() throws Exception {
        assertStrength("abc", WEAK);
    }

    private void assertStrength(String password, PasswordStrength expStr) {
        // when
        PasswordStrength result = meter.meter(password);

        // then
        assertEquals(expStr, result);
    }
}
