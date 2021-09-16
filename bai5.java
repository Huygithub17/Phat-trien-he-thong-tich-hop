import java.util.Scanner;
public class vidu5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// tạo 1 phần tử Scanner để nhập dl.
        System.out.println("Enter size of the array: ");
        int n = scan.nextInt();
        
        int numbers[] = new int[n];// tạo 1 mảng gồm n phần từ.

        System.out.println("Enter array elements: ");// nhập giá trị cho mảng.
        for(int i=0; i<n ; i++)
        {
            numbers[i] = scan.nextInt();
        }

        int sum = positiveSum(numbers); //dùng hàm để tính;

        System.out.println("Tổng các số nguyên dương trong mảng: "+ sum);
        scan.close();
    }
    public static int positiveSum(int[] numbers){
        int sum = 0;
        for(int i : numbers){
            if(i >= 0 ) sum += i; // kiểm tra là số dương hay không và tính tổng.
        }
        return sum;
    }
}

