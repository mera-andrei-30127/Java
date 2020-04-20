package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sensor {
    private SENSOR_TYPE type;
    private String id;

    List<SensorReading> sensorReadings = new ArrayList<>();

    public String getId() {
        return id;
    }

    public List<SensorReading> getSensorReadings() {
        return sensorReadings;
    }

    public Sensor(SENSOR_TYPE type, String id) {
        this.type = type;
        this.id = id;
    }

    public List<SensorReading> getSensorReadingsSortedByDateAndTime() {

        Collections.sort(sensorReadings);
        return sensorReadings;
    }


    public List<SensorReading> getSensorReadingsSortedByValue() {

        ///sensorReadings.sort(Comparator.comparing(SensorReading::getValue));
        sensorReadings.sort((o1, o2) -> {
            if (o1.getValueDouble() > o2.getValueDouble())
                return 1;
            if (o1.getValueDouble() < o2.getValueDouble())
                return -1;
            else
                return 0;
        });
        return sensorReadings;
    }

    public boolean addSensorReading(SensorReading sensorReading) {
        sensorReadings.add(sensorReading);
        return true;
    }

}
