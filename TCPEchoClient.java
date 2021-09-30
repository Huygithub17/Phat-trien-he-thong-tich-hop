import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


//ok
public class TCPEchoClient{
    public final static String serverIP = "127.0.0.1";
    public final static int serverPort = 7;
    public static void main(String[] args) throws InterruptedException, IOException
    {
        Socket s= null;
        try {
            s = new Socket(serverIP, serverPort); //ham ket noi voi server
            System.out.println("client da duoc tao");
            InputStream is = s.getInputStream(); // gan is = ham doc dòng trong socket;
            OutputStream os = s.getOutputStream();
            for(int i='0'; i<'9'; i++)
            {
                os.write(i); // gui goi tin di
                int ch = is.read(); // nhan lai tu server
                System.out.println((char) ch); // in ra man hinh
                Thread.sleep(1000);// 1 ky tu in trong 1s
            }

        }catch (IOException ie)
        {
            System.out.println("Error: Can not create socket !");
        }
        finally{
            if(s != null){
                s.close(); // neu socket trong thi dong lai;
            }
        }
    }

}