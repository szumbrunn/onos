package org.onosproject.net;

public class SensorNodeNeighbor {
    private int rssi;
    private int rxCount;
    private int txCount;

    public SensorNodeNeighbor() {
        
    }

    public SensorNodeNeighbor(int rssi, int rxCount, int txCount) {
        this.rssi = rssi;
        this.rxCount = rxCount;
        this.txCount = txCount;
    }

    public int getRssi() {
        return rssi;
    }

    public void setRssi(int rssi) {
        this.rssi = rssi;
    }

    public int getRxCount() {
        return rxCount;
    }

    public void setRxCount(int rxCount) {
        this.rxCount = rxCount;
    }

    public int getTxCount() {
        return txCount;
    }

    public void setTxCount(int txCount) {
        this.txCount = txCount;
    }
}
