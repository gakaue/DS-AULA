import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#####0.00");

        int a,b,c;
        double delta,x1,x2,raiz;

        System.out.println("informe a");
        a =sc.nextInt();

        System.out.println("informe b");
        b =sc.nextInt();

        System.out.println("informe c");
        c =sc.nextInt();

        delta = (Math.pow(b,2)-4*a*c);

        if (delta<0) {
            System.out.println("a raiz não é real");
        }

        else {
            x1 = (-b + Math.sqrt(delta))/2 * a;
            x2 =(-b - Math.sqrt(delta))/2 * a;
            System.out.print("raiz x1 ["+  dc.format(x1) + "]");
            System.out.print("raiz x2 ["+ dc.format(x2) + "]");
        }





    }
}
