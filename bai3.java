import java.util.Scanner;
import java.io.*;
public class bai3 
{
    private double a;
    private double b;
    private double c;
    //Phương thức tạo lập một phương trình.
    public phuongtrinhbac2(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double nhapso(){
        double so;
        Scanner scan = new Scanner(System.in);
        try{
            so = Double.parseDouble(scan.nextLine());//chuyển sang kiểu double.
        }
        catch (Exception e){ // nếu nhập vào lỗi
            System.out.println("Nhap lai: ");
            so = nhapso(); //đệ quy hàm nhập
        }
        return so;
    }

    void nhapPT(){
        System.out.println("Moi ban nhap phuong trinh can giai: ");
        System.out.print("a: ");a = nhapso();//ghi dữ liệu vào số a bằng hàm ở trên.
        System.out.print("b: ");b = nhapso();
        System.out.print("c: ");c = nhapso();
    }

    void giaiPT()
    {
        if(a==0){
            if(b!=0){
                double x;
                x= -c/b;
                x=Math.round(x*100.0)/100.0;// làm tròn số thập phân;
                System.out.println("Nghiem phuong trinh: " + x);
            }
            else{
                System.out.println("Phuong trinh khong hop le!");
            }
        }
        else{
            double delta= b*b - 4*a*c;
            if(delta < 0){
                System.out.println("Phuong trinh " +a+ "X^2 + " +b+ "X + " +c+ " -> vo nghiem !");
            }
            else if(delta == 0){
                double x;
                x =(-b)/(2*a);
                System.out.println("Phuong trinh co nghiem kep: ");
                System.out.println("X=" +Math.round(x*100.0)/100.0);
            }
            else{
                double x1;
                double x2;
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co 2 nghiep phan biet: ");
                System.out.println("x1=" +Math.round(x1*100.0)/100.0);
                System.out.println("x2=" +Math.round(x2*100.0)/100.0);
            }
        }
    }
    public static void main(String[] args) {
        bai3 ptb2 = new bai3();
        ptb2.nhapPT();
        ptb2.giaiPT();
    }
    
}
