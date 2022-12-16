import java.net.InetAddress;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    String website;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter url: ");
    website = input.nextLine();
    InetAddress address = InetAddress.getByName(website);
    String ip = address.getHostAddress();
    System.out.println(website + " has IP address: " + ip);
  }
}
