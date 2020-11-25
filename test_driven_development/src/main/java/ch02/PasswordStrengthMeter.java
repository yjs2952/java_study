package ch02;

import static ch02.PasswordStrength.*;

public class PasswordStrengthMeter {

    public PasswordStrength meter(String s) {
        if (s == null || s.isEmpty()) return INVALID;

        int metCount = getMetCriteriaCounts(s);
        if (metCount <= 1) return WEAK;
        if (metCount == 2) return NORMAL;
        return STRONG;
    }

    private int getMetCriteriaCounts(String s) {
        int metCount = 0;
        if (s.length() >= 8) metCount++;
        if (isContainsNum(s)) metCount++;
        if (isContainsUpperCase(s)) metCount++;
        return metCount;
    }

    private boolean isContainsUpperCase(String s) {
        boolean containsUpperCase = false;
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                containsUpperCase = true;
                break;
            }
        }
        return containsUpperCase;
    }

    private boolean isContainsNum(String s) {
        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                return true;
            }
        }
        return false;
    }
}
