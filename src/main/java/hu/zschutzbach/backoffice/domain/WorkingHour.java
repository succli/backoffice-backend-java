package hu.zschutzbach.backoffice.domain;

public enum WorkingHour {
    FullTime(8), PartTime(4);
    private Integer hours;
    private WorkingHour(Integer hours) {
        this.hours = hours;
    }
    private static WorkingHour findByHours(Integer byHours) {
        for (WorkingHour w: WorkingHour.values()) {
            if (w.hours.equals(byHours)) {
                return w;
            }
        }
        return null;
    }
}
