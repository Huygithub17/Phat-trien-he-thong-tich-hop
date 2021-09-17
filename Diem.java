import java.util.Scanner;
public class Diem {
    public int x;
    private int y;
    /* Diem(){ // Khổi tạo với toạ độ (0;0) //_ok
        this.x = 0;
        this.y = 0;
    } */
    //hoặc (comment : shift + alt + A)
    Diem(){
        x = y = 0;
    }

    /* public Diem(int x; int y){
        this.x = x;    // Sao cái này không hoạt động.
        this.y = y;
    } */
    //hoặc
    Diem(int a, int b){// kiểu constructor;
        x = a;
        y = b;
    }

    // Lấy giá trị x và y: Tại vì biến x, y là biến private;
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    // chưa biết
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
    
    public void nhapdiem(){ // Nhập điểm từ bạn phím _ ok
        Scanner s= new Scanner(System.in);
        System.out.print("Nhập vào hoành độ x = ");
        x=s.nextInt();
        System.out.print("Nhập vào tung độ y = ");
        y=s.nextInt();
    }
    
    public void hienthi(){ // _ok
        System.out.println("(" +x+ " ; " +y+ ")");
    }

    public void doidiem(int dx, int dy){ // tức là cộng vô thôi // thay đổi x và y; _ok
        x+=dx;
        y+=dy;
    }

    // tính khoảng cách tới gốc toạ độ:_ok
    public float khoangcach(){
        return (float)Math.sqrt(x*x + y*y); 
    }

    // tính khoảng cách đến 1 điểm:_ok
    public float khoangcach(Diem d){
        return (float)Math.sqrt((x-d.x)*(x-d.x) + (y-d.y)*(y-d.y));
    }
}
