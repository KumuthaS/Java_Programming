package java8.coreJava;

public class RunTimePolymorphism {
    void Print()
    {

        // Print statement
        System.out.println("parent class");
    }
}
class Subclass1 extends RunTimePolymorphism {

    // Method
    void Print() { System.out.println("subclass1"); }
}
class Subclass2 extends RunTimePolymorphism {

    // Method
    void Print()
    {

        // Print statement
        System.out.println("subclass2");
    }
}

class GFGG {

    // Main driver method
    public static void main(String[] args) {
        RunTimePolymorphism runTimePolymorphism=new Subclass1();
        runTimePolymorphism.Print();
    }
}
