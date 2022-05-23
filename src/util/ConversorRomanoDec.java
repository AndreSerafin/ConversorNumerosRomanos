package util;

import java.util.HashMap;

public class ConversorRomanoDec {
    private static String num;

    public static void setNum(String num) {
        ConversorRomanoDec.num = num;
    }

    public static int identificarNumero(String num) {

        HashMap<Character, Integer> mapa = new HashMap<>();

        mapa.put('I', 1);
        mapa.put('V', 5);
        mapa.put('X', 10);
        mapa.put('L', 50);
        mapa.put('C', 100);
        mapa.put('D', 500);
        mapa.put('M', 1000);
        mapa.put('Ṽ', 5000);
        mapa.put('Ẍ', 10000);

        int numero = 0;

        for (int i = 0; i < num.length(); i++) {
            if(i > 0 && mapa.get(num.charAt(i)) > mapa.get(num.charAt(i - 1))) {
                numero += mapa.get(num.charAt(i)) - 2 * mapa.get(num.charAt(i - 1));
            }
            else {
                numero += mapa.get(num.charAt(i));
            }
        }

        return numero;

    }



}


