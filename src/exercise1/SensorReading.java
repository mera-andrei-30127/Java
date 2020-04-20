package isp.lab6.exercise1;

import java.time.LocalDateTime;

public class SensorReading implements java.lang.Comparable<SensorReading> {
    private LocalDateTime dateTime;
    private double value;

    public SensorReading(double value, LocalDateTime dateTime) {
        this.value = value;
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getValue() {
        return "" + value;
    }

    public double getValueDouble(){
        return value;
    }

    @Override
    public int compareTo(SensorReading o) {
        return Integer.compare(0, this.dateTime.compareTo(o.dateTime));
    }
}
