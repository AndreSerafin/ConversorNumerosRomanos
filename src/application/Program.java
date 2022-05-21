package application;

import util.ConversorDecRomano;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ConversorDecRomano conversor1 = new ConversorDecRomano();

        System.out.print("Digite um numero para ser convertido: ");
        int n = sc.nextInt();
        char op = 's';
        while(op != n){

            ConversorDecRomano.setN(n);
            System.out.print(conversor1.milhar());
            System.out.print(conversor1.centena());
            System.out.print(conversor1.dezena());
            System.out.printf("%s\n",conversor1.unidade());


            System.out.print("Deseja conveter outro numero? - (s/n): ");
            op = sc.next().charAt(0);
            n = sc.nextInt();
        }



        sc.close();
    }
}
