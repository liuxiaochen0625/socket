package socketconnect; 
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket; 
 /**
 * Client
 * @author Icer
 *
 */
public class Client {

    private Socket s;
    private BufferedReader br;
    private PrintWriter pw;
    private String line = "";
    public Client() {
        try{
            s = new Socket("127.0.0.1",10000);
            pw = new PrintWriter(s.getOutputStream(),true);
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            pw.println("hello");
            line = br.readLine();
            System.out.println(line);

            br.close();
            pw.close();
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        new Client();
    }
}
 