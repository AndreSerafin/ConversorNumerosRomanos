package util;

public class ConversorDecRomano {

    private static String[] unidade = new String[] {"I", "II", "III","IV","V", "VI", "VII", "VIII", "IX"};
    private static String[] dezena = new String[] {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static String[] centena = new String[] {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static String[] milhar = new String[] {"M", "MM", "MMM", "MṼ", "Ṽ", "ṼI" , "ṼII", "ṼIII", "IẌ"};
    private static int n;

    public static void setN(int n) {
        ConversorDecRomano.n = n;
    }

    public String unidade() {

        int[] numeroDecomposto = decomporNumero(n);

        int indexUnidade = numeroDecomposto[3];

        if (numeroDecomposto[3] > 0){
            return ConversorDecRomano.unidade[indexUnidade-1];
        }else {
            return "";
        }
    }

    public String dezena() {

        int[] numeroDecomposto = decomporNumero(n);

        int indexDezena = (numeroDecomposto[2]/10) - 1;

        if (numeroDecomposto[2] > 0){
            return ConversorDecRomano.dezena[indexDezena];
        }else {
            return "";
        }
    }
    public String centena() {

        int[] numeroDecomposto = decomporNumero(n);

        int indexCentena = (numeroDecomposto[1]/100) - 1;

        if (numeroDecomposto[1] > 0){
            return ConversorDecRomano.centena[indexCentena];
        }else {
            return "";
        }
    }
    public String milhar() {

        int[] numeroDecomposto = decomporNumero(n);

        int indexMilhar = (numeroDecomposto[0]/1000) - 1;

        if (numeroDecomposto[0] > 0){
            if (numeroDecomposto[0] == 10000) {
                return "Ẍ";
            }else {
            return ConversorDecRomano.milhar[indexMilhar];
            }
        } else {
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
