import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
public class Client {

    public void menu(){
        System.out.println("----------******MENU*****--------\n");
        System.out.println("1. Dao nguoc\n");
        System.out.println("2. Dem so luong tu\n");
        System.out.println("exit. Thoat\n");
        System.out.println("Xin moi chon: ");
    }
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        try {
            Scanner sc = new Scanner(System.in);
            tuan8 m = (tuan8)Naming.lookup("abc");
            Client A = new Client();
            String chon;
            A.menu();
            chon = sc.nextLine();
            while(!chon.equals("exit")){
                switch (chon){
                    case "1":
                        System.out.println("Xin moi nhap chuoi: ");
                        String line = sc.nextLine();
                        System.out.println(line);
                        String kq = m.daonguoc(line);
                        System.out.println("Chuoi duoc dao nguoc la: \n" + kq );
                        break;
                    case "2":
                        System.out.println("Xin moi nhap chuoi: ");
                        String line2 = sc.nextLine();
                        System.out.println(line2);
                        int kq2 = m.demsoluongtu(line2);
                        System.out.println("So luong tu co trong chuoi vua nhap: \n" + kq2);
                        break;
                    default:
                    System.out.println("Nhap sai thao tac !");
                }
                System.out.println("*************************");
		        A.menu(); 
                chon = sc.nextLine();           
            }
            System.out.println("END.");
            
        } catch (RemoteException e) {
            System.out.println("khong tim thay doi tuong tu xa tren server!");
        }
    }
}
