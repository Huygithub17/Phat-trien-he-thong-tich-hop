import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


//ok
public class TCPEchoServer {
    public final static int serverPort = 7;
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(serverPort);// serverPort = 7 o tren;

            System.out.println("server da duoc tao. ");
            while(true)
            {
                try {
                    Socket s = ss.accept(); // chap nhan client
                    OutputStream os = s.getOutputStream();
                    InputStream is = s.getInputStream();
                    int ch = 0;
                    while(true)
                    {
                        ch = is.read();// doc thong diep tu client.
                        if(ch == -1)    break; // neu thong diep rong thi ket thuc;

                        System.out.println((char) ch);// nguoc lai thi in ra thong diep.
                        os.write(ch); // gui thong diep lai phia client
                    }
                } catch (Exception ie1) {
                    System.out.println("Connection Error:" +ie1);
                }
            }
        } catch (Exception ie) {
            System.out.println("Server creation Error" + ie);
        }
    }
    
}
