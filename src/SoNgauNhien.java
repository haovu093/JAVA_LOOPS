import java.util.Random;

public class SoNgauNhien {
    void taoSNN() {
        Random n = new Random();
        int number = (int) (n.nextInt(10));
        //In ra số ngẫu nhiên
        System.out.println("số ngẫu nhiên: " + number);
        System.out.println(checkSNT(number));
        tinhGiaiThua(number);
    }

    //Kiêm tra số nguyên tố
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
   static void tinhGiaiThua(int a) {
        int Giaithua=1;
        for (int i =1; i<a;i++)
        {
            Giaithua=Giaithua*(i+1);
        }
        System.out.println(+a+"!="+Giaithua);
    }

}




