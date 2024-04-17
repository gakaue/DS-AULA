
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,delta;

        System.out.println("informe a");
        a =sc.nextInt();
        System.out.println("informe b");
        b =sc.nextInt();
        System.out.println("informe c");
        c =sc.nextInt();

        delta = calculedelta(a,b,c);

        verifiquedelta(delta,a,b);


        sc.close();

    }
    public static double calculedelta(double a,double b,double c) {
      return Math.pow(b,2)-(4*a*c);

    }
    public static void verifiquedelta(double delta,double a,double b){
        DecimalFormat dc =new DecimalFormat("#####0.00");
        double x1,x2;
        if (delta>=0) {
            x1 = calculeRaiz1(delta,a,b);
            x2 =calculeRaiz2(delta,a,b);
            imprimir("raiz x1 ["+  dc.format(x1) + "]");
            imprimir("raiz x2 ["+ dc.format(x2) + "]");
        }

        else {
            imprimir("nao existe raizes reais");
        }
    }
    public static double calculeRaiz1(double delta,double a, double b){
        return  (-b + Math.sqrt(delta))/(2 * a);
    }
    public static double calculeRaiz2(double delta, double a,double b){
        return (-b - Math.sqrt(delta))/(2 * a);
    }
    public static void imprimir (String msg){
        System.out.println(msg);
    }
}


