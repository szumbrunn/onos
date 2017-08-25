SDN-WISE & ONOS
====================================

### What is SDN-WISE?
[SDN-WISE](http://sdn-wise.dieei.unict.it) is a Software Defined Networking solution for WIreless SEnsor Networks.
SDN-WISE simplifies wireless sensor network management by specifying a software-defined networking protocol for wireless sensor nodes.
The key characteristics of SDN-WISE are the following:
* It has flexible flow tables, which allow the creation of rules that match any byte of the packet arriving at the node.
This feature is particularly useful in WSNs, since an SDN-WISE node can create rules for different kind of network protocols, such as 6LoWPAN, Zigbee, etc.
* It is energy-efficient, since it uses duty cycles.
* It is stateful and, therefore, Turing complete. This enables SDN-WISE nodes to be instructed to implement any routing protocol.

### What is ONOS?
[ONOS](http://www.onosproject.org) is a new SDN network operating system designed for high availability,
performance, and scale-out.

This repository contains a fork of ONOS, which we call ONOS-IoT, enriched with the software modules needed to interact with SDN-WISE networks and provide functionality for unified control of networks of sensors and switches. This is achieved by introducing new and by extending already existing ONOS components.
More specifically, apart from the original ONOS ones, ONOS-IoT includes the following subsystems:
* [SensorNode Subsystem.](https://github.com/sdnwiselab/onos/tree/onos-sdn-wise-1.10/core/api/src/main/java/org/onosproject/net/sensor)
This subsystem introduces extensible APIs that enable the management of sensor nodes, whereas it also provides information about the nodes of the network, such as their battery level, their neighborhood, etc.
* [SensorFlowRule Subsystem.](https://github.com/sdnwiselab/onos/tree/onos-sdn-wise-1.10/core/api/src/main/java/org/onosproject/net/sensorflow)
This subsystem builds on top of existing ONOS FlowRule subsystem, however it also provides APIs that enable more flexible creation of rules, without restricting to particular protocol (such as IP), so that it can be easily used for sensor nodes.
* [SensorPacket Subsystem.](https://github.com/sdnwiselab/onos/tree/onos-sdn-wise-1.10/core/api/src/main/java/org/onosproject/net/sensorpacket)
This subsystem also builds on top of existing ONOS components for its Packet Subsystem, however, it generalizes the notion of a packet, so that it is restricted to packets used only in infrastructured networks.

Apart from the aforementioned subsystems, ONOS-IoT also introduces an implementation of the [server part of the SDN-WISE protocol](https://github.com/sdnwiselab/onos/tree/onos-sdn-wise-1.10/protocols/sdnwise), which enables the communication with SDN-WISE nodes.
By leveraging this protocol, the SensorPacket and the SensorNode subsystems are able to build a unified view of OpenFlow and SDN-WISE networks, thereby providing a holistic view of an IoT infrastructure.
All individual components of this infrastructure are either managed by existing subsystems, in case they are hosts connected to OpenFlow switches, or by the SensorNode subsystem, in case they are sensor nodes.
Network-wide packet forwarding is achieved by the IntegratedForwarding network application.

To use ONOS-IoT, please also refer to the following sources:
* To emulate an heterogeneous networks using SDN-WISE, ONOS, and Mininet please check this [tutorial](http://sdn-wise.dieei.unict.it/docs/guides/GetStartedONOS.html).
* To try SDN-WISE on real devices download `sdn-wise-contiki` from [here](https://github.com/sdnwiselab/sdn-wise-contiki) and check the README for details on how to build SDN-WISE and Contiki.
