import java.util.Scanner;
public class phanso {
    private int tuso;
    private int mauso;

    phanso(){
        this.tuso = 0;
        this.mauso = 1;
    }

    /* phanso(int a; int b){
        tuso = a;
        mauso = b;
    } */

    phanso(int tuso, int mauso){
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public void nhapphanso(){
        Scanner s = new Scanner(System.in);
        do{
            System.out.print("Nhap tu so: ");
            tuso = s.nextInt();
            System.out.print("Nhap mau so: ");
            mauso = s.nextInt();
            if(mauso == 0)
                System.out.print("Mau so phai khac 0 !");
        }while (mauso == 0);
    }

    public void hienthiphanso(){
        if(tuso == 0)
            System.out.print("0");
        if(mauso == 1)
            System.out.print(tuso);
        else if (mauso < 0)
            System.out.print("-" +tuso+ "/" +(-mauso));
        else 
            System.out.print(tuso + " / " + mauso);
    }
    public ngichdao(){
        int tmp;
        tmp = tuso;
        tuso = mauso;
        mauso =tmp;
    }
    public phanso giatringhichdao(){
        phanso p = new phanso();
        p.tuso = mauso;
        p.mauso = tuso;
        return p;
    }
    public gitrithuc(){
        return (double)tuso/mauso;
    }

    public boolean lonhon(phanso a){
        return this.giatrithuc() > a.giatrithuc();// tra ve True - False
    }

    // Cong - tru - nhan - chia
    public phanso cong(phanso a) {
        phanso kq = new phanso();
        kq.tuso = this.tuso*a.mauso + this.mauso*a.tuso;
        kq.mauso = this.mauso * a.mauso;
        return kq;
    }

    public phanso tru(phanso a) {
        phanso kq = new phanso();
        kq.tuso = this.tuso*a.mauso - this.mauso*a.tuso;
        kq.mauso = this.mauso * a.mauso;
        return kq;
    }

    public phanso nhan(phanso a) {
        phanso kq = new phanso();
        kq.tuso = this.tuso*a.tuso;
        kq.mauso = this.mauso * a.mauso;
        return kq;
    }

    public phanso chia(phanso a) {
        phanso kq = new phanso();
        return this.nhan(a.giatringhichdao());
    }
}
