package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

            ArrayList <Byggnad> list = new ArrayList<>();
            HashMap<String, Byggnad> byggnadHashmap = new HashMap<>();

            Lägenhet lgh = new Lägenhet();

        System.out.println("Vilken färg har lägenheten?: ");
            lgh.setFärg(input.nextLine());
        System.out.println("Vilket nummer har lägenheten?: ");
            lgh.setLägenhetsnummer(input.nextLine());

        list.add(lgh);

        byggnadHashmap.put("lgh1", lgh);

        
        Byggnad by = byggnadHashmap.get("lgh1");
        System.out.println(by.getConsoleRow());



    }
}
