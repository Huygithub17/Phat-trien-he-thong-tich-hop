public class usephanso {
    public static void main(String[] args) {
        System.out.println("Nhap phan so A: ");
        phanso a = new phanso();
        a.nhapphanso();
        a.hienthiphanso();
        System.out.println("\n");

        phanso b = new phanso(3,2);
        phanso c = new phanso(5,2);
        System.out.print("Phan so B: ");
        b.hienthiphanso();
        System.out.print("\nPhan so C: ");
        c.hienthiphanso();

        System.out.print("\nTổng 2 phân số B + C là:\n");
        b.hienthiphanso();
        System.out.print(" + ");
        c.hienthiphanso();
        System.out.print(" = ");
        b.cong(c).hienthiphanso();
        
        System.out.print("\nHieu 2 phân số B - C là:\n");
        b.hienthiphanso();
        System.out.print(" - ");
        c.hienthiphanso();
        System.out.print(" = ");
        b.tru(c).hienthiphanso();

        System.out.print("\nNhan 2 phân số: B x C là:\n");
        b.hienthiphanso();
        System.out.print(" x ");
        c.hienthiphanso();
        System.out.print(" = ");
        b.nhan(c).hienthiphanso();

        System.out.print("\nChia 2 phân số: B / C là:\n");
        b.hienthiphanso();
        System.out.print(" / ");
        c.hienthiphanso();
        System.out.print(" = ");
        b.chia(c).hienthiphanso();
        
    }
}
