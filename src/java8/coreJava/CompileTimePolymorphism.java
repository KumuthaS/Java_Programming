package java8.coreJava;

public class CompileTimePolymorphism {
    static int Multiply(int a, int b)
    {
        // Returns product of integer numbers
        return a * b;
    }
    static double Multiply(double a, double b)
    {
        // Returns product of double numbers
        return a * b;
    }

}
class GFG {
    // Main driver method
    public static void main(String[] args)
    {
        // Calling method by passing
        // input as in arguments
        System.out.println(CompileTimePolymorphism.Multiply(2, 4));
        System.out.println(CompileTimePolymorphism.Multiply(5.5, 6.3));
    }
}
