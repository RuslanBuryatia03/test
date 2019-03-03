package ru.inno;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // это с ветки мастер для мержа
        System.out.println("asdf");
        Collection c = new HashSet();
        print(c);
        
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
