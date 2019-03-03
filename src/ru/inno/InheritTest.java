package ru.inno;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author KhankhasaevRV
 * @since 03.03.2019
 */
interface SomeInterface{
    boolean someMethod(int x);
}

public class InheritTest {
    public static int a = 0;
    public static int b = getSum() - a;
    public static int c = getSum() - a - b;
    public static int getSum()
    {
        return  b + c;
    }

    public static void main(String[] args) {
        System.out.println(a + " " + b +" " + c);
        }

}
class Animal {

    private void feed() {
    }

}
class Kitty extends Animal {
    void feed() {
    }
    void otherMethod() {
    }
}
class Dog extends Animal {
    void feed() {
    }
}