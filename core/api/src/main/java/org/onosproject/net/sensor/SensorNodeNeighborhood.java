package org.onosproject.net.sensor;

import com.google.common.collect.ImmutableMap;
import org.onosproject.net.SensorNodeId;
import org.onosproject.net.SensorNodeNeighbor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by aca on 3/15/15.
 */
public class SensorNodeNeighborhood {
    private Map<SensorNodeId, SensorNodeNeighbor> neighborhood = new ConcurrentHashMap<>();

    public SensorNodeNeighborhood(Map<SensorNodeId, SensorNodeNeighbor> neighborhood) {
        this.neighborhood = ImmutableMap.copyOf(neighborhood);
    }

    public Map<SensorNodeId, SensorNodeNeighbor> getNeighborhood() {
        return ImmutableMap.copyOf(neighborhood);
    }
}
