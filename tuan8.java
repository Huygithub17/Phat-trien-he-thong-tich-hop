import java.rmi.Remote;
import java.rmi.RemoteException;

public interface tuan8 extends Remote {

    public String daonguoc(String line) throws RemoteException;
    public int demsoluongtu(String line) throws RemoteException;
    
}