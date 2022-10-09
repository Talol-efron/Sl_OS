import java.util.Enumeration;
import java.net.NetworkInterface;
import java.net.InetAddress;

public class Getaddrinfo{
    public static void main(String[] args) {
        try {
            Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface intf = (NetworkInterface)interfaces.nextElement();
                System.out.println(intf.getName() + ":");
                //System.out.println("   Status: active");
                //System.out.println("  Address: ");
                Enumeration addresses = intf.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress address = (InetAddress)addresses.nextElement();
                    System.out.println("   Address: " + address.getHostAddress());
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}