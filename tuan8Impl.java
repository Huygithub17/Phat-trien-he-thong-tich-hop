import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class tuan8Impl extends UnicastRemoteObject implements tuan8 {
    // khoi tao
    public tuan8Impl() throws RemoteException{
        super();
    }

    public String daonguoc(String line) throws RemoteException{

        StringBuilder str = new StringBuilder(line);
        String kq = str.reverse().toString();
        return kq;
    }

    public int demsoluongtu(String line) throws RemoteException{
        String s2[];
        s2 = new String[100];
        // cac phan tu trong mang cach nhau boi dau cach
        s2 = line.split(" ");
        int soluongtu = s2.length;
        return soluongtu;
    }
}
