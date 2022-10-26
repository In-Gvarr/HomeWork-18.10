import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        if (n >= 2) {
            int x = 2;
            while (x < 9999) {
                if (n % x == 0) {
                    break;
                }
                else  {
                    x++;
                }
            }
            System.out.println(x);
        }
    }
}