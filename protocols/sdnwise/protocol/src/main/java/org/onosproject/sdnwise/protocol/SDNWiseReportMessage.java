package org.onosproject.sdnwise.protocol;

import org.onlab.packet.IpAddress;
import org.onosproject.net.PortNumber;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aca on 2/25/15.
 */
public class SDNWiseReportMessage extends SDNWiseMessage {
    private int distance;
    private int batteryLevel;
    private int nofNeighbors;
    private Map<SDNWiseNodeId, Integer> neighborRSSI;
    private IpAddress sinkIpAddress;
    private PortNumber sinkPortNumber;

    /**
     * Added by Jakob
     */
    private double temperature;
    private double humidity;
    private double light1;
    private double light2;
    private Map<SDNWiseNodeId, Integer> neighborRxCount;
    private Map<SDNWiseNodeId, Integer> neighborTxCount;

    public SDNWiseReportMessage() {
        super();
        this.neighborRSSI = new HashMap<>();
        this.neighborRxCount = new HashMap<>();
        this.neighborTxCount = new HashMap<>();
    }

    public SDNWiseReportMessage(int distance, int batteryLevel, int nofNeighbors,
                                double temperature, double humidity, double light1, double light2,
                                IpAddress sinkIpAddress, PortNumber sinkPortNumber) {
        super();
        this.distance = distance;
        this.batteryLevel = batteryLevel;
        this.nofNeighbors = nofNeighbors;
        this.neighborRSSI = new HashMap<>();
        this.sinkIpAddress = sinkIpAddress;
        this.sinkPortNumber = sinkPortNumber;

        /**
         * Added by Jakob
         */
        this.neighborRxCount = new HashMap<>();
        this.neighborTxCount = new HashMap<>();
        this.temperature = temperature;
        this.humidity = humidity;
        this.light1 = light1;
        this.light2 = light2;
    }

    public SDNWiseReportMessage(int distance, int batteryLevel, int nofNeighbors,
                                double temperature, double humidity, double light1, double light2,
                                Map<SDNWiseNodeId, Integer> neighborRSSI,
                                Map<SDNWiseNodeId, Integer> neighborRxCount, Map<SDNWiseNodeId, Integer> neighborTxCount) {
        super();
        this.distance = distance;
        this.batteryLevel = batteryLevel;
        this.nofNeighbors = nofNeighbors;
        this.neighborRSSI = neighborRSSI;

        /**
         * Added by Jakob
         */
        this.neighborRxCount = neighborRxCount;
        this.neighborTxCount = neighborTxCount;
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

    public Map<SDNWiseNodeId, Integer> getNeighborRxCount() {
        return neighborRxCount;
    }

    public void setNeighborRxCount(Map<SDNWiseNodeId, Integer> neighborRxCount) {
        this.neighborRxCount = neighborRxCount;
    }

    public Map<SDNWiseNodeId, Integer> getNeighborTxCount() {
        return neighborTxCount;
    }

    public void setNeighborTxCount(Map<SDNWiseNodeId, Integer> neighborTxCount) {
        this.neighborTxCount = neighborTxCount;
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

    public Map<SDNWiseNodeId, Integer> getNeighborRSSI() {
        return neighborRSSI;
    }

    public void setNeighborRSSI(Map<SDNWiseNodeId, Integer> neighborRSSI) {
        this.neighborRSSI = neighborRSSI;
    }

    public void addNeighborRSSI(SDNWiseNodeId neighbor, int rssi) {
        this.neighborRSSI.put(neighbor, rssi);
    }

    public void addNeighborRxCount(SDNWiseNodeId neighbor, int rxCount) { this.neighborTxCount.put(neighbor, rxCount); };

    public void addNeighborTxCount(SDNWiseNodeId neighbor, int txCount) { this.neighborTxCount.put(neighbor, txCount); };

    public Integer getNeighborRSSI(SDNWiseNodeId neighbor) {
        return this.neighborRSSI.get(neighbor);
    }

    public IpAddress sinkIp() {
        return this.sinkIpAddress;
    }

    public PortNumber sinkPort() {
        return this.sinkPortNumber;
    }
}
