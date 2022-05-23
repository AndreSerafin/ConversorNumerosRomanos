package util;

public class ConversorRomanoDec {

    private static String[] unidade = new String[] {"I", "II", "III","IV","V", "VI", "VII", "VIII", "IX"};
    private static String[] dezena = new String[] {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static String[] centena = new String[] {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static String[] milhar = new String[] {"M", "MM", "MMM", "_MV_", "_V_", "_VI_" , "_VII_", "_VIII_", "_IX_"};
    private static String num;

    public static void setNum(String num) {
        ConversorRomanoDec.num = num;
    }

    public static void identificarNumero(String num) {

        int milharDec;
        for(int i = 0; i < milhar.length; i++) {
            if (num.equals(milhar[i])) {
                milharDec = 1000 * (i + 1);
                System.out.println(milharDec);
            }
        }
        int centenaDec;
        for(int i = 0; i < centena.length; i++) {
            if (num.equals(centena[i])) {
                centenaDec = 100 * (i + 1);
                System.out.println(centena);
            }
        }
    }



}


