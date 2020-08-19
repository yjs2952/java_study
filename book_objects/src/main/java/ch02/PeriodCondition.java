package ch02;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class PeriodCondition implements DiscountCondition {

    private DayOfWeek dayOfWeek;
    private LocalDate startTime;
    private LocalDate endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalDate startTime, LocalDate endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
                startTime.compareTo(screening.getStartTime().toLocalDate()) <= 0 &&
                endTime.compareTo(screening.getStartTime().toLocalDate()) >= 0;
    }
}
