package org.onosproject.sdnwise.protocol;

import org.onlab.packet.IpAddress;
import org.onosproject.net.PortNumber;
import org.onosproject.net.SensorNodeNeighbor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aca on 2/25/15.
 */
public class SDNWiseReportMessage extends SDNWiseMessage {
    private int distance;
    private int batteryLevel;
    private int nofNeighbors;
    private IpAddress sinkIpAddress;
    private PortNumber sinkPortNumber;

    /**
     * Added by Jakob
     */
    private double temperature;
    private double humidity;
    private double light1;
    private double light2;
    private Map<SDNWiseNodeId, SensorNodeNeighbor> neighbors;

    public SDNWiseReportMessage() {
        super();
        this.neighbors = new HashMap<>();
    }

    public SDNWiseReportMessage(int distance, int batteryLevel, int nofNeighbors,
                                double temperature, double humidity, double light1, double light2,
                                IpAddress sinkIpAddress, PortNumber sinkPortNumber) {
        super();
        this.distance = distance;
        this.batteryLevel = batteryLevel;
        this.nofNeighbors = nofNeighbors;
        this.sinkIpAddress = sinkIpAddress;
        this.sinkPortNumber = sinkPortNumber;

        /**
         * Added by Jakob
         */
        this.neighbors = new HashMap<>();
        this.temperature = temperature;
        this.humidity = humidity;
        this.light1 = light1;
        this.light2 = light2;
    }

    public SDNWiseReportMessage(int distance, int batteryLevel, int nofNeighbors,
                                double temperature, double humidity, double light1, double light2,
                                Map<SDNWiseNodeId, SensorNodeNeighbor> neighbors) {
        super();
        this.distance = distance;
        this.batteryLevel = batteryLevel;
        this.nofNeighbors = nofNeighbors;

        /**
         * Added by Jakob
         */
        this.neighbors = neighbors;
        this.temperature = temperature;
        this.humidity = humidity;
        this.light1 = light1;
        this.light2 = light2;

    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getLight1() {
        return light1;
    }

    public void setLight1(double light1) {
        this.light1 = light1;
    }

    public double getLight2() {
        return light2;
    }

    public void setLight2(double light2) {
        this.light2 = light2;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int getNofNeighbors() {
        return nofNeighbors;
    }

    public void setNofNeighbors(int nofNeighbors) {
        this.nofNeighbors = nofNeighbors;
    }

    public Map<SDNWiseNodeId, SensorNodeNeighbor> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(SDNWiseNodeId neighborId, SensorNodeNeighbor neighbor) { this.neighbors.put(neighborId, neighbor); }

    public SensorNodeNeighbor getNeighbor(SDNWiseNodeId neighborId) { return this.neighbors.get(neighborId);}

    public IpAddress sinkIp() {
        return this.sinkIpAddress;
    }

    public PortNumber sinkPort() {
        return this.sinkPortNumber;
    }
}
