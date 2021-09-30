import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// _ok
public class UDPEchoClient {
    public final static int serverPort =7;
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            InetAddress server = InetAddress.getByName("localhost");

            while(true){
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                String theString = br.readLine(); // đọc dữ liệu từ bàn phím
                byte[] data = theString.getBytes();// đổi chuỗi ra mảng byte.
                //tao goi tin gui
                DatagramPacket dp = new DatagramPacket(data, data.length, server, serverPort);
                ds.send(dp);

                byte[] buffer = new byte[6000]; //vùng đệm cho dữ liệu nhận.
                //goi tin nhan
                DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
                ds.receive(incoming);

                System.out.println(new String(incoming.getData(), 0, incoming.getLength()));
                //đổi dữ liệu nhân được từ mảng byte sang chuỗi và in ra màn hình.
            }
        } catch (Exception ie) {
            System.out.println(ie);
        }
    }
}
