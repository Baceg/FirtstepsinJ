package test.thirdL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] titles = {"Natural", "Czarny Dywan", "Papieskie Tango", "Godzina Potworów", "Wiatr na wodę"};
        for (String title: titles) {
            System.out.println(title);
        }

        String lancuch = "daskl;adsl;adsfk;ads;lkda";
        String[] alllah = lancuch.split(";");

        System.out.println(Arrays.asList(alllah));

//        List<String> words = new ArrayList<String>(Arrays.asList(titles));
//        List<String> words2 = new LinkedList<>();
//        words.add("noobie rookie cookie");
//        System.out.println(words);
//        System.out.println(titles);

    }
}
