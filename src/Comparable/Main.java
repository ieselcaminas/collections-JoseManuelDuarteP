package Comparable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tanque> list = new ArrayList<>();

        Tanque t = new Tanque("Leopard", 120);
        list.add(t);
        t = new Tanque("T90", 134);
        list.add(t);
        t = new Tanque("LeClerc", 155);
        list.add(t);
        t = new Tanque("Abrams", 156);
        list.add(t);
        t = new Tanque("ZT-5530", 160);
        list.add(t);


    }
}
