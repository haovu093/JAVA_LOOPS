import java.util.Scanner;

public class Chuoi {
    private static final char SPACE =' ' ;

    void timViTri() {
        String str = "You only live once, but if you do it right, once is enough";
        for (int i = 0; i <= str.length(); i++) {
            if (str.charAt(i) == 'o') {
                System.out.println(i);
            }
        }
    }

    void inBangCuuChuong() {
        for (int i =1; i<=10; i++)
        {
            for (int j=1;j<10;j++)
            {
                System.out.print(+i+ "*"+ j+"="+i*j +"\t");
            }
        }

    }
   void demSoTu(){
       Scanner sc=new Scanner(System.in);
       String  str1;
       System.out.println("Nhập vào chuỗi: ");
       str1=sc.nextLine();
       int dem=0;
       for (int i =0; i<=str1.length(); i++)
       {
           if (str1.charAt(i) != SPACE) {
               continue;
           }
           dem=dem+i;
       }
       System.out.println(dem);

   }

}

