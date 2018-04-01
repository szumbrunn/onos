package org.onosproject.sdnwise.protocol;

import org.onosproject.net.SensorNodeNeighbor;

import java.util.List;

/**
 * Created by aca on 2/17/15.
 */
public interface SDNWiseNode {
    public void sendMsg(SDNWiseMessage msg);

    public void sendMsg(List<SDNWiseMessage> msgs);

    public void handleMessage(SDNWiseMessage fromNode);

    public String getID();

    public SDNWiseNodeId getId();

    public String manufacturerDescription();

    public String hardwareDescription();

    public String softwareDescription();

    public String serialNumber();

    public boolean isConnected();

    public void disconnectNode();

    public double batteryLevel();

    public double getTransmissionPowerLevel();

    public void setTransmissionPowerLevel(double level);

    public SensorNodeNeighbor getNeighbor(SDNWiseNodeId neighborId);

    public void setNeighbor(SDNWiseNodeId neighborId, SensorNodeNeighbor neighbor);

    public SDNWiseNodeState getNodeState();

    public SDNWiseVersion getVersion();
}
