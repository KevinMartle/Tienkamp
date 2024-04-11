package be.vdab;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tienkamper> atleten = new ArrayList<>();
        atleten.add(new Tienkamper("Piet", 100));
        atleten.add(new Tienkamper("Jan", 10));
        atleten.add(new Tienkamper("Anna", 35));
        atleten.add(new Tienkamper("Lisa", 20));
        atleten.add(new Tienkamper("Tom", 55));

        for(Tienkamper atleet : atleten){
            System.out.println(atleet);
        }
        System.out.println();
        Set<Tienkamper>atleten2 = new TreeSet<Tienkamper>();
        atleten2.add(new Tienkamper("Piet", 100));
        atleten2.add(new Tienkamper("Jan", 10));
        atleten2.add(new Tienkamper("Anna", 35));
        atleten2.add(new Tienkamper("Lisa", 20));
        atleten2.add(new Tienkamper("Tom", 55));

        for(Tienkamper atleet : atleten2){
            System.out.println(atleet);
        }
    }
}
