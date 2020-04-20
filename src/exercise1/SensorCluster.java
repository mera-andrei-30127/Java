package isp.lab6.exercise1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SensorCluster {
    private List<Sensor> sensors = new ArrayList<>();

    public List<Sensor> addSensor(String sensorId, SENSOR_TYPE type) {
        Sensor sensor = new Sensor(type, sensorId);
        for (Sensor id : sensors) {
            if (id.getId().equals(sensorId)) {
                return null;
            }

        }
        sensors.add(Integer.parseInt(sensorId),sensor);
        return sensors;
    }

    public boolean writeSensorReading(String sensorId, double value, LocalDateTime dateTime) {
        SensorReading sensorReading = new SensorReading(value,dateTime);
        for (Sensor id : sensors) {
            if (id.getId().equals(sensorId)) {
                sensors.get(Integer.parseInt(sensorId)).addSensorReading(sensorReading);
                return true;
            }
        }
        System.out.println("sensor with id: " + sensorId + " not found");
        return false;
    }

    public Sensor getSensorById(String sensorId) {
        for (Sensor id : sensors) {
            if (id.getId().equals(sensorId))
                return sensors.get(Integer.parseInt(sensorId));
        }
        return null;
    }
}
