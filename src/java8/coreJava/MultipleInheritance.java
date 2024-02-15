package java8.coreJava;// Java program to illustrate the
// concept of Multiple inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

interface Oneee {
    public void print_geek();
}

interface Twooo {
    public void print_for();
}

interface Threee extends Oneee, Twooo {
    public void print_geek();
}
class Child implements Threee {
    @Override public void print_geek()
    {
        System.out.println("Geeks");
    }

    public void print_for() { System.out.println("for"); }
}

// Drived class
public class MultipleInheritance {
    public static void main(String[] args)
    {
        Child c = new Child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }
}
