import java.net.DatagramPacket;
import java.net.DatagramSocket;


//_ok
public class UDPEchoServer {
    public final static int serverPort = 7;
    
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(serverPort);
            System.out.println("server created _ ok");

            byte[] buffer = new byte[6000]; // tạo mảng nhớ đệm để nhận gói tin.

            while(true){
                DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);

                ds.receive(incoming);// nhan goi tin gui den tu client

                String theString = new String(incoming.getData(),  0 , incoming.getLength());
                System.out.println(theString);// in ra chuoi nhan duoc
                // doi tu mang byte ra chuoi
                DatagramPacket outsending = new DatagramPacket(theString.getBytes(), incoming.getLength(),incoming.getAddress(), incoming.getPort());

                ds.send(outsending);// gui goi tin di client
            }

        } catch (Exception ie) {
            System.out.println(ie);
        }
    }
}
