import java.net.*;
public class Try {
    public static void main(String[] args) throws Exception {
        // ローカルのInetAddress（IPアドレス）を取得
        InetAddress inet = InetAddress.getLocalHost();

        System.out.println("IPアドレス:" + inet.getHostAddress());
        String hostName = inet.getHostName();
        System.out.println("ホスト名:" + hostName);

        // IPアドレスのバイト列取得
        byte[] ip = inet.getAddress();
        for (int i = 0; i < ip.length; i++) {
            System.out.printf("%02X  ", (0x0ff & ip[i]));
        }
        System.out.println("以上がIPアドレスの16進表示\n");

        // ホスト名から全てのIPアドレスを表示
        InetAddress[] adrs = InetAddress.getAllByName(hostName);
        for (int i = 0; i < adrs.length; i++) {
            System.out.println(adrs[i].getHostAddress());
        }

        // 指定のIPアドレスからInetAddressを取得して表示
        inet = InetAddress.getByAddress(new byte[] { 74, 125, 91, 104 });
        // inet = InetAddress.getByName("74.125.91.104");//これも可能
        System.out.println("ホスト名:" + inet.getHostName());
    }
}
