package socketconnect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {

	private Socket socket;
	private BufferedReader bufferedReader;
	private PrintWriter printWriter;
	private String line;
	
	public SocketClient(){
		try {
			socket = new Socket("127.0.0.1",10000);
			printWriter = new PrintWriter(socket.getOutputStream(),true);
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			printWriter.println("hello");
			line = bufferedReader.readLine();
			System.out.println(line);
			bufferedReader.close();
			printWriter.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {

		new SocketClient();
	}

}
