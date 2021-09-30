import java.net.ServerSocket;
import java.net.Socket;


// ok
public class TCPEchoServer1 {
    public final static int serverPort = 7;
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(serverPort);
            System.out.println("server da duoc tao");
            while(true){
                try {
                    Socket s = ss.accept();
                    RequestProcessing rp = new RequestProcessing(s);
                    rp.start();
                } catch (Exception ie1) {
                    System.out.println("connection error: " +ie1);
                }
            }
        } catch (Exception ie) {
            System.out.println("server creation error: " + ie);
        }
    }
}
