import java.net.*;
public class Inet_Address
{
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address1=InetAddress.getLocalHost();
        System.out.println("InetAddress of Local Host : "+ address1);
        System.out.println(" Host name is : "+ address1.getHostName());
        System.out.println(" IP Address is : "+ address1.getHostAddress());

    }
}
