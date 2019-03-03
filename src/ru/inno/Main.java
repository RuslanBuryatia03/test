package ru.inno;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {
    protected enum Season { WINTER, SPRING, SUMMER, AUTUMN, ASDF };

    public static void main(String[] args) {

        Season a = Season.WINTER;
        Season b = Season.ASDF;
        a.compareTo(b);

        Integer asd= 1;
        Class<Integer> type = Integer.TYPE;
        System.out.println(asd);
//        Integer sdвв = asd.doubleValue() ;
        System.out.println(asd.doubleValue());


        // это с ветки мастер для мержа

        System.out.println("asdf");
        Collection c = new HashSet();
        print(c);
        String[] asdf = new String[23];
        asdf[0]= null;
//        enum Season { WINTER, SPRING, SUMMER, AUTUMN, ASDF };

    }

    public static void print(Collection d){
        System.out.println("коллекция");
    }
    public static void print(Set d){
        System.out.println("сет");
    }
    public static void print(HashSet d){
        System.out.println("хэш сет");
    }
}
