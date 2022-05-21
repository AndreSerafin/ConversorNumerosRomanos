package util;

public class Conversor {

    private static String[] unidade = new String[] {"I", "II", "III","IV","V", "VI", "VII", "VIII", "IX"};
    private static String[] dezena = new String[] {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static String[] centena = new String[] {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static String[] milhar = new String[] {"M", "MM", "MMM"};
    private static int n;

    public static void setN(int n) {
        Conversor.n = n;
    }

    public String unidade() {

        int[] numeroDecomposto = decomporNumero(n);

        int unidade = numeroDecomposto[3];

        if (numeroDecomposto[3] > 0){
            return Conversor.unidade[unidade-1];
        }else {
            return "";
        }
    }

    public String dezena() {

        int[] numeroDecomposto = decomporNumero(n);

        int dezena = (numeroDecomposto[2]/10) - 1;

        if (numeroDecomposto[2] > 0){
            return Conversor.dezena[dezena];
        }else {
            return "";
        }
    }
    public static int[] decomporNumero(int n){

        int[] numeroDecomposto = new int[4];
        int aux1, aux2,aux3;

        //milhar
        aux1 = n % 1000;
        numeroDecomposto[0] = n - aux1;
        //System.out.println(numeroDecomposto[0]);
        //centena
        aux2 = n % 100;
        numeroDecomposto[1] = aux1 - aux2;
        //System.out.println(numeroDecomposto[1]);
        //dezena
        aux3 = n % 10;
        numeroDecomposto[2] = aux2 - aux3;
        //System.out.println(numeroDecomposto[2]);
        //unidade
        numeroDecomposto[3] = n - numeroDecomposto[0] - numeroDecomposto[1] -numeroDecomposto[2];
        //System.out.println(numeroDecomposto[3]);

        return numeroDecomposto;
    }

}
