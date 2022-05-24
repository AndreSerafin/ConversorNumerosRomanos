package application;

import util.ConversorDecRomano;
import util.ConversorRomanoDec;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws InterruptedException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║               Escolha uma opção:               ║");
        System.out.println("║            0 - Finalizar programa              ║");
        System.out.println("║1 - Converter numeros Indo-Arábicos para Romanos║");
        System.out.println("║    2 - Converter Romanos para Indo-Arábicos    ║");
        System.out.println("╚════════════════════════════════════════════════╝");

        int op1 = sc.nextInt();
        while (op1 != 0) {

            switch (op1) {
                case 1 -> {

                    System.out.print("Digite um numero para ser convertido (1 a 10000): ");
                    int n = sc.nextInt();

                    ConversorDecRomano.setN(n);
                    for (int i = 0; i < 4; i++){
                        Thread.sleep(1000);
                        System.out.print(". ");
                    }
                    System.out.println();
                    System.out.printf("%d em Numeral Romano = %s", n, ConversorDecRomano.resultado());

                }case 2 -> {

                    System.out.print("Digite um numero Romano - ");
                    System.out.print("Utilize - M para 1000, Ṽ para 5000 e Ẍ para 10000: ");
                    sc.nextLine();
                    String num = sc.nextLine();

                    for (int i = 0; i < 4; i++){
                        Thread.sleep(1000);
                        System.out.print(". ");
                    }
                    System.out.println();

                    System.out.printf("%s em Indo-Arábico = %d",num, ConversorRomanoDec.identificarNumero(num));

                }default -> {
                    System.out.println("Opção Inválida!");
                }
            }

            Thread.sleep(1000);
            System.out.println("\n╔════════════════════════════════════════════════╗");
            System.out.println("║               Escolha uma opção:               ║");
            System.out.println("║            0 - Finalizar programa              ║");
            System.out.println("║1 - Converter numeros Indo-Arábicos para Romanos║");
            System.out.println("║    2 - Converter Romanos para Indo-Arábicos    ║");
            System.out.println("╚════════════════════════════════════════════════╝");

            op1 = sc.nextInt();
        }





        sc.close();
    }
}
