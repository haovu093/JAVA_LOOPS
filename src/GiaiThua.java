import java.util.Scanner;

public class GiaiThua {
    void tinhGT(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số n :");
        int n=1;
        int tichGT=1;
        n=sc.nextInt();
        for (int i=1; i<n; i++)
        {
          tichGT=tichGT*(i+1);
        }
        System.out.println(tichGT);
    }

}
