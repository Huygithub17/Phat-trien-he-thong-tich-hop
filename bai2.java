import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// để nhập số n.
        System.out.print("Nhap so: ");
        int n = s.nextInt();
        if(ktNT(n)){//nếu có >1 ước trong khoản từ [2, sqrt(n)) => thì nó không phải snt.
            System.out.println(n+ " la so nguyen to. ");
        }else
        {
            System.out.println(n+ " khong phai la so nguyen to. ");
        }
    }
    public static boolean ktNT(int n){// hàm kiểm tra só nguyên tố.
        if(n<=1){
            return false;
        }
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
