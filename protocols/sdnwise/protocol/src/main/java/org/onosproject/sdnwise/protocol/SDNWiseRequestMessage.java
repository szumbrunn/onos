package org.onosproject.sdnwise.protocol;

import com.github.sdnwiselab.sdnwise.packet.NetworkPacket;
import org.slf4j.Logger;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by aca on 3/12/15.
 */
public class SDNWiseRequestMessage extends SDNWiseMessage {
    private static final Logger log = getLogger(SDNWiseMessage.class);

    public byte[] serialize() {
        byte[] buf;

        log.info("11");
        if (getNetworkPackets() == null) {

            log.info("12");
            buf = getNetworkPacket().toByteArray();
        } else {

            log.info("13");
            buf = new byte[this.getLength()];
            List<NetworkPacket> networkPackets = getNetworkPackets();
            int offset = 0;
            for (NetworkPacket networkPacket : networkPackets) {

                log.info("111");
                byte[] arr = networkPacket.toByteArray();

                log.info("112");
                System.arraycopy(arr, 0, buf, offset, arr.length);

                log.info("113");
                offset = offset + arr.length;
            }
        }

        log.info("14");
        return buf;
    }
}
