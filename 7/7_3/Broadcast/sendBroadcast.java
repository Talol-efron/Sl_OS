package Broadcast;

import java.net.*;
import java.util.Scanner;

public class sendBroadcast {
    public static void main(String[] args) {
        try {
            int port = 8888;
            Scanner scanner = new Scanner(System.in);
            System.out.print("msg > ");
            String input = scanner.nextLine();
            byte[] data = input.getBytes("UTF-8");
            InetAddress address = InetAddress.getByName("255.255.255.255");
            DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
            DatagramSocket socket = new DatagramSocket();
            socket.send(packet);
            scanner.close();
            socket.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
