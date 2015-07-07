import java.net.InetAddress;
import java.net.UnknownHostException;


public class test {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getByName("");
			System.out.println(inetAddress);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
