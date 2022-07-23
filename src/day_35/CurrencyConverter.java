package day_35;

import java.util.Scanner;

public class CurrencyConverter {

    public static String converter(String currencyType, double currencyAmount) {

        switch (currencyType.toLowerCase()) {
            case "euro":
                return currencyAmount* 0.91+ " Euro";
            case "yen":
                return currencyAmount * 121.03+" Yen";
            case "lira":
                return currencyAmount* 14.85+" Lira";

            case "won":
                return currencyAmount * 1_217.52+ "Won";

            case "rupee":
                return currencyAmount * 181.45+ " Rupee";

            default:
                return "invalid currency";

        }

    }

    public static void main(String[] args) {
        System.out.println(converter("yen",100));//convert(next(),nextDouble()
        System.out.println(converter("lira",75));
        System.out.println(converter("rupee",80));
    }
}

