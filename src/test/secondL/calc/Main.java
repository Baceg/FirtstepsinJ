package test.secondL.calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //System.out.println(calculate());
         calculate();
    }



    private static void calculate() {
        Scanner scanner = new Scanner(System.in);

        Double pierw;
        Double dwoj;
        String string;


        while (true) {
            string = scanner.next();
            if (string.equals("exit"))
                break;
            pierw =scanner.nextDouble();
            dwoj =scanner.nextDouble();


            switch (string) {
                case "sum":
                    System.out.println( sum(pierw,dwoj));
                    break;
                case "sub":
                    System.out.println( sub(pierw,dwoj));
                    break;
                case "mul":
                    System.out.println( mul(pierw,dwoj));
                    break;
                case "div":
                    System.out.println( div(pierw,dwoj));
                    break;
            }

        }



    }

    private static Double div(Double pierw, Double dwoj) {
        return pierw/dwoj;
    }

    private static Double mul(Double pierw, Double dwoj) {
        return pierw*dwoj;
    }

    private static Double sub(Double pierw, Double dwoj) {
        return pierw-dwoj;
    }

    private static Double sum(Double pierw, Double dwoj) {
        return pierw+dwoj;
    }


}