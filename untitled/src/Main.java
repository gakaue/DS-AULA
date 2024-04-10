import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#####0.00");

        int a,b,c,maiornumero;

        System.out.println("informe o primeiro numero");
        a = sc.nextInt();

        System.out.println("informe o segundo  numero");
        b = sc.nextInt();

        System.out.println("informe o terceiro numero");
        c = sc.nextInt();

        maiornumero = verificaMaiorNumero(a,b,c);
        showPrint(maiornumero);
        sc.close();

    }
    public static int verificaMaiorNumero(int a, int b,int c){
        int aux;
        if ((a >b) && (a>c)) {
            aux = a;
        }else if ((b >a) &&(b > c)) {
            aux = b;
        }else {
            aux =c;
        }
        return aux;
    }
  public static void showPrint(int num){
      System.out.println("o maioir numero é" + num);
  }
}
