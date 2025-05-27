import java.net.URL;
import java.net.URLConnection;

public class URLExample {
public static void main(String[] args) { try {
URL url = new URL("http://www.msbte.org.in");

System.out.println("Protocol: " + url.getProtocol());
 System.out.println("Host: " + url.getHost());
 System.out.println("Port: " + url.getPort()); System.out.println("File: " + url.getFile());
}

catch (Exception e) {
 System.out.println("Error: " + e.getMessage());
}
}
}
