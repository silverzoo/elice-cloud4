package chapter04.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        String hostName = "www.elice.io";

        //getAllByName()은 해당 도메인의 모든 정보를 담은 배열을 반환
        try {
            InetAddress inetAdr[] = null;
            inetAdr = InetAddress.getAllByName(hostName);
            for (InetAddress adr : inetAdr) {
                System.out.println(STR."호스트명: \{adr.getHostName()}");
                System.out.println(STR."호스트 IP 주소: \{adr.getHostAddress()}");

            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        // getByName()은 InetAddress 객체를 반환
        try {
            InetAddress adr = InetAddress.getByName(hostName);
            System.out.println(STR."호스트명: \{adr.getHostName()}");
            System.out.println(STR."호스트 IP주소: \{adr.getHostAddress()}");
        } catch(UnknownHostException e) {
            e.printStackTrace();
        }
    }
}