import java.util.Scanner;

public class testThread {


    public static void DoiCoSo(int n, int base){
        if (n>=base) DoiCoSo(n / base, base);
        if(n % base < 9) System.out.printf("%c",n%base+55);
        else
            System.out.println((n% base));
    }
    public static int nhap(){
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check){
            System.out.print(" ");
            try {
                n = input.nextInt();
                check = true;
            }catch (Exception e){
                System.out.println("hay nhap so vao day... ");
                input.nextLine();
            }
        }
        return (n);
    }

    public static void main(String[] args) {
        System.out.println("nhap n");
        int n = nhap();
        System.out.println("nhap vao co so can chuyen sang 2");
        int b = nhap();
        System.out.println("so " + n + " chuyen sang co so " + b + " thanh: ");
        DoiCoSo(n,b);
    }
}

