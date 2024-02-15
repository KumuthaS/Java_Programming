// Java program to illustrate the
// concept of Multilevel inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

class Onee {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}

class Twoo extends Onee {
    public void print_for() { System.out.println("for"); }
}

class Three extends Twoo {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}

// Drived class
public class MultiilevelInheritance {
    public static void main(String[] args)
    {
        Three g = new Three();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
