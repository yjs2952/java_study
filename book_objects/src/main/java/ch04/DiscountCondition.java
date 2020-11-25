package ch04;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DiscountCondition {
    private DiscountConditionType discountConditionType;

    private int sequence;

    private DayOfWeek dayOfWeek;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public DiscountConditionType getDiscountConditionType() {
        return discountConditionType;
    }

    public void setDiscountConditionType(DiscountConditionType discountConditionType) {
        this.discountConditionType = discountConditionType;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
