import java.util.Scanner;

public class SNT {
// kiểm tra n có phải snt ?
boolean checkSNT(int n) {
    // n < 2 kp là số nguyên tố
    if (n < 2) {
        return false;
    }
    // kiểm tra 1 số có là SNT?
    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

    // Liệt kê các số nguyên tố nhỏ hơn 100
    void demSNT() {
        int dem = 0;
        //c1 : dùng for
//        for (int i = 2; i < 100; i++) {
//            if (checkSNT(i)) {
//                System.out.print(i + "\t");
//                dem++;
//            }
//        }
//        System.out.println("\n Có " + dem + " số nguyên tố trong 100 số đầu tiên");

        //cách 2 dùng do..white
//        int i =0;
//        do {
//            i++;
//            if(checkSNT(i)){
//                System.out.print(i + "\t");
//                dem++;
//            }
//        }while (i<100);
//        System.out.println("\n Có " + dem + " số nguyên tố trong 100 số đầu tiên");
//    }
        //cách 3 : dùng white
        int i = 0;
        while (i < 100) {
            i++;
            if (checkSNT(i)) {
                System.out.print(i + "\t");
                dem++;

            }
        }
        System.out.println("\n Có " + dem + " số nguyên tố trong 100 số đầu tiên");
    }

    // Liệt kê n số nguyên tố đầu tiên
    void timNSNT() {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhập vào số nguyên a: ");
        a = sc.nextInt();
        System.out.println("Các số nguyên tố từ 0->a: ");
        for (int i = 2; i <= a; i++) {
            if (checkSNT(i)) {
                System.out.println(i);
            }
        }

    }

}


