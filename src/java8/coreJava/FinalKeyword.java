package java8.coreJava;

public class FinalKeyword {
    // a final variable
    // direct initialize
    final int THRESHOLD = 5;
    // a blank final variable
    final int CAPACITY;

    // another blank final variable
    final int  MINIMUM;

    // a final static variable PI
    // direct initialize
    static final double PI = 3.141592653589793;

    // a  blank final static  variable
    static final double EULERCONSTANT;
    // instance initializer block for
    // initializing CAPACITY
    {
        CAPACITY = 25;
    }
    static{
        EULERCONSTANT = 2.3;
    }
    public FinalKeyword()
    {
        MINIMUM = -1;
    }
}
