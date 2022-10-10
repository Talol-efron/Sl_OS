package Broadcast;

import java.net.*;
import java.util.Arrays;

public class recvBroadcast {
    public static void main(String[] args) {
        try {
            int port = 8888;
            DatagramSocket socket = new DatagramSocket(port);
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
