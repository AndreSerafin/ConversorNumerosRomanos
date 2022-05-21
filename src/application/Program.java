package application;

import util.ConversorDecRomano;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ConversorDecRomano conversor1 = new ConversorDecRomano();

        System.out.print("Digite um numero para ser convertido (1 a 10000): ");
        int n = sc.nextInt();
        char op = 's';
        while(op != n){

            ConversorDecRomano.setN(n);
            System.out.print(ConversorDecRomano.milhar());
            System.out.print(ConversorDecRomano.centena());
            System.out.print(ConversorDecRomano.dezena());
            System.out.printf("%s\n",ConversorDecRomano.unidade());


            System.out.print("Deseja conveter outro numero? - (s/n): ");
            op = sc.next().charAt(0);
            System.out.print("Digite um numero para ser convertido (1 a 10000): ");
            n = sc.nextInt();
        }



        sc.close();
    }
}
