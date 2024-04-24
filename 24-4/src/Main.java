import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int soma, soma2;

    CalcularSoma calc,calc1;
            calc = new CalcularSoma();// instanciação da classe calcular soma

        System.out.print("informe o valor de a :");
        calc.a= sc.nextInt();
        System.out.println("informe o valor de b:");
        calc.b = sc.nextInt();
        System.out.println("informe o valor de c");
        calc.c = sc.nextInt();

        soma = calc.somaValores();

        System.out.println(" a soma é;" + soma);


        calc1 = new CalcularSoma();

        System.out.print("informe o valor de d :");
        calc1.a = sc.nextInt();
        System.out.println("informe o valor de e:");
        calc1.b = sc.nextInt();
        System.out.println("informe o valor de f");
        calc1.c = sc.nextInt();

        soma2 = calc.somaValores();

        System.out.println(" a soma é  " + soma2);


        sc.close();
    }

}