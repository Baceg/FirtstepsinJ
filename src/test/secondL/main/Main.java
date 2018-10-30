package test.secondL.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.next();
            System.out.println(string);

            System.out.println(string.indexOf("la"));

//            metoda parse ze stringu na zmienna
            Integer integer = Integer.parseInt(string);
            System.out.println(integer.compareTo(4));
        }
    }
    public void tst() {
            int i = 2;
            Integer j = 5;

//            int[] arr = new int[10];
//            System.out.println(arr[2]);
//            Integer[] array = new Integer[10];
//            System.out.println(array);
        System.out.println(Math.abs( i - j));
        System.out.println(Math.ceil(2.4));
        System.out.println(Math.ulp(2.5555555555555555555));

        String str = new String("raz4DwaCzyBabaJagapaczy");

//        System.out.println(str.toUpperCase());
//        System.out.println(str);
//        str = str.toUpperCase();
//        System.out.println(str);


//        System.out.println(str.contains("aba"));
//        System.out.println(str.indexOf("4"));
        System.out.println("-----------------------------" + str.charAt(str.length()-1));

        StringBuilder stringBuilder = new StringBuilder();
//        System.out.println(stringBuilder);
        for (int k = 0; k < str.length(); k++) {
            if (str.charAt(k) == 'a') {
                stringBuilder.append('0');
            } else {
                stringBuilder.append(str.charAt(k));
            }
        }
        System.out.println(stringBuilder);



        }
    }
