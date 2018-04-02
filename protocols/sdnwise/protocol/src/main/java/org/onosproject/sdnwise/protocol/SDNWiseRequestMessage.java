package org.onosproject.sdnwise.protocol;

import com.github.sdnwiselab.sdnwise.packet.NetworkPacket;

import java.util.List;

/**
 * Created by aca on 3/12/15.
 */
public class SDNWiseRequestMessage extends SDNWiseMessage {

    @Override
    public byte[] serialize() {
        byte[] buf;

        if (getNetworkPackets() == null) {
            buf = getNetworkPacket().toByteArray();
        } else {
            buf = new byte[this.getLength()];
            List<NetworkPacket> networkPackets = getNetworkPackets();
            int offset = 0;
            for (NetworkPacket networkPacket : networkPackets) {
                byte[] arr = networkPacket.toByteArray();
                System.arraycopy(arr, 0, buf, offset, arr.length);
                offset = offset + arr.length;
            }
        }

        return buf;
    }
}
