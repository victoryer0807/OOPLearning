
   import java.util.Scanner;
   public class abra {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int q = sc.nextInt();
            int a = sc.nextInt();
            int z = sc.nextInt();
            if ((q>a) && (q>z)) {
                System.out.println(q);
            }
        else if ((a>q) && (a>z)){
                    System.out.println(a);
                }
                else  if ((z>a) && (z>q)){
                    System.out.println(z);
                }
            }else {System.out.println("error");
                }

    }

}
