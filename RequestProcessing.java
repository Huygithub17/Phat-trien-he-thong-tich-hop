import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


//lam theo kieu phan luong _ok
public class RequestProcessing extends Thread {
    Socket channel; // socket cua kenh ao;
    public RequestProcessing(Socket s){
        channel = s; //socket cua kenh ao noi voi client

    }

    public void run(){
        try {
            OutputStream os = channel.getOutputStream();
            InputStream is = channel.getInputStream();
            while(true){
                int n = is.read(); // doc du lieu gui tu client toi server
                if (n ==-1)     break;

                System.out.println((char) n); // in ra tung ky tu nhan duoc
                os.write(n); // gui du lieu lai cho client
            }
        } catch (Exception ie) {
            System.out.println("Request Processing errror:" +ie);
        }
    }
}
