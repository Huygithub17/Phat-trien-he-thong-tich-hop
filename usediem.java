public class usediem{
    public static void main(String[] args) {
        Diem A = new Diem(3,4); // khởi tạo điểm A (3,4)
        System.out.print("A"); // in điểm A
        A.hienthi(); //hàm

        

        Diem C = new Diem(- A.getX(), - A.getY());// điểm C đối xứng với A.
        System.out.print("C"); 
        C.hienthi();

        Diem B = new Diem(); // tạo 1 điểm trống
        System.out.print("Nhap B: "); //nhập điểm B
        B.nhapdiem(); // hàm nhập
        System.out.print("B"); // in ra B
        B.hienthi();
        // tính khoảng cách từ B tới tâm O:
        System.out.println("Khoảng cách từ B đến O là: " + B.khoangcach());

        // tính khoảng cách từ A đến B:
        System.out.println("Khoảng cách từ A đến B là: " + A.khoangcach(B));
    }
}
