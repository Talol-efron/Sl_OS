package Multicast;

import java.net.*;
import java.util.Arrays;

public class recvMulticast {
    public static void main(String[] args) {
        try {
            int port = 8888;
            InetAddress mcastaddr = InetAddress.getByName("228.5.6.7");
            InetSocketAddress group = new InetSocketAddress(mcastaddr, port);
            NetworkInterface netIf = NetworkInterface.getByName("bge0");
            MulticastSocket socket = new MulticastSocket(port);
            socket.joinGroup(group, netIf);
            byte[] data = new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            System.out.println(new String(Arrays.copyOf(packet.getData(), packet.getLength()), "UTF-8"));
            socket.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
