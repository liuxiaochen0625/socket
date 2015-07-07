package socketconnect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	private ServerSocket serverSocket;
	private Socket socket;
	private BufferedReader bufferedReader;
	private PrintWriter printWriter;
	public SocketServer(){
		try {
			serverSocket = new ServerSocket(10000);
			System.out.println("Server is starting.....");
			socket = serverSocket.accept();
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			printWriter = new PrintWriter(socket.getOutputStream(),true);
			String line = bufferedReader.readLine();
			printWriter.println("your word is:"+line);
			bufferedReader.close();
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SocketServer();

	}

}
