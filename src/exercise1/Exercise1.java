package isp.lab6.exercise1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        SensorCluster sensorCluster = new SensorCluster();
        List<Sensor> sensors;
        sensorCluster.addSensor("0", SENSOR_TYPE.PRESSURE);
        sensorCluster.addSensor("1", SENSOR_TYPE.HUMIDITY);
        sensorCluster.addSensor("2", SENSOR_TYPE.TEMPERATURE);
        sensors = sensorCluster.addSensor("3", SENSOR_TYPE.PRESSURE);

        sensorCluster.writeSensorReading("1", 10, LocalDateTime.now());
        sensorCluster.writeSensorReading("2", 10, LocalDateTime.now());
        sensorCluster.writeSensorReading("3", 10, LocalDateTime.now());
        sensorCluster.writeSensorReading("2", 20, LocalDateTime.now());
        sensorCluster.writeSensorReading("1", 5, LocalDateTime.now());
        sensorCluster.writeSensorReading("2", 1, LocalDateTime.now());
        sensorCluster.writeSensorReading("3", -1, LocalDateTime.now());
        sensorCluster.writeSensorReading("1", 7, LocalDateTime.now());

        Scanner scanner = new Scanner(System.in);

        System.out.println("read the sensor index: ");
        int index = scanner.nextInt();

        List<SensorReading> sensorReading = sensors.get(index).getSensorReadings();

        System.out.println("values read: ");

        for (SensorReading sensorReadins:sensorReading) {
            System.out.println(sensorReadins.getValue());
        }
        System.out.println("values sorted:");

        sensorReading = sensors.get(index).getSensorReadingsSortedByValue();


        for (SensorReading sensorReadins:sensorReading) {
            System.out.println(sensorReadins.getValue());
        }


    }
}
