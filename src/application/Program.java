package application;

import util.ConversorDecRomano;
import util.ConversorRomanoDec;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║               Escolha uma opção:               ║");
        System.out.println("║            0 - Finalizar programa              ║");
        System.out.println("║1 - Converter numeros Indo-Arábicos para Romanos║");
        System.out.println("║2 - Converter Romanos para Indo-Arábicos (WIP)  ║");
        System.out.println("╚════════════════════════════════════════════════╝");

        int op2 = sc.nextInt();
        while (op2 != 0) {

            switch (op2) {
                case 1 -> {

                    System.out.print("Digite um numero para ser convertido (1 a 10000): ");
                    int n = sc.nextInt();
                    char op1 = 's';
                    while(op1 != 'n'){

                        ConversorDecRomano.setN(n);
                        System.out.print(ConversorDecRomano.milhar());
                        System.out.print(ConversorDecRomano.centena());
                        System.out.print(ConversorDecRomano.dezena());
                        System.out.printf("%s\n",ConversorDecRomano.unidade());


                        System.out.print("Deseja conveter outro numero Indo-Arábico para Romano? - (s/n): ");
                        op1 = sc.next().charAt(0);

                        if(op1 == 's') {
                            System.out.print("Digite um numero para ser convertido (1 a 10000): ");
                            n = sc.nextInt();
                        }

                    }
                }case 2 -> {

                    System.out.print("Digite um numero Romano - ");
                    System.out.print("Utilize: _MV_, _V_, _VI_, _VII_, _VIII_ , _IX_ para numeros acima de 4000: ");
                    sc.nextLine();
                    String num = sc.nextLine();
                    System.out.println();

                    ConversorRomanoDec.identificarNumero(num);

                }default -> {
                    System.out.println("Opção Inválida!");
                }
            }

            System.out.println("\n╔════════════════════════════════════════════════╗");
            System.out.println("║               Escolha uma opção:               ║");
            System.out.println("║            0 - Finalizar programa              ║");
            System.out.println("║1 - Converter numeros Indo-Arábicos para Romanos║");
            System.out.println("║2 - Converter Romanos para Indo-Arábicos (WIP)  ║");
            System.out.println("╚════════════════════════════════════════════════╝");

            op2 = sc.nextInt();
        }





        sc.close();
    }
}
