import java.util.Scanner;

public class Fibonacci {

    //Tính số fibonnacci
    int timFibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        }
        return timFibonacci(n - 1) + timFibonacci(n - 2);
    }

    // liệt kê các số Fibonacci nhỏ hơn 100
    void indayFibonacci() {
        for (int i = 0; i < 100; i++) {
            if (timFibonacci(i) <= 100) {
                System.out.println(timFibonacci(i));
            }
        }
    }

    // liệt kê n số fibonacci đầu tiên
    void listFibonacci() {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhập vào số nguyên n: ");
        a=sc.nextInt();
        for (int i = 0; i <= a; i++) {
            if(timFibonacci(i)<a) {
                System.out.println(timFibonacci(i));
            }
        }
    }

    }









