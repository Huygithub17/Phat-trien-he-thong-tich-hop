import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException{
        try {
            //tao doi tuong remote tu phuong thuc xinchaoImpl()
            tuan8 h = (tuan8)new tuan8Impl(); // ep kieu
            // dang ky rmi cho doi tuong va rang buoc vao server
            Naming.rebind("abc", h);
            System.out.println("Doi tuong dang ky tu xa da duoc dang ky.");
            System.out.println("Server dang doi client...");
        } catch (RemoteException e) {
            System.out.println("khong the tao duoc remote.");
        }
    }
}
