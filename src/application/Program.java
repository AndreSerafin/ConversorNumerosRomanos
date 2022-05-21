package application;

import util.Conversor;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conversor conversor = new Conversor();

        System.out.printf("Digite um numero para ser convertido: ");
        int n = sc.nextInt();
        char op = 's';
        while(op != n){

            Conversor.setN(n);
            System.out.print(conversor.dezena());
            System.out.printf("%s\n",conversor.unidade());


            System.out.print("Deseja conveter outro numero? - (s/n): ");
            op = sc.next().charAt(0);
            n = sc.nextInt();
        }



        sc.close();
    }
}
