package java8;

interface Test1 {
    void print();
}

public class LambdaProgram1 {
    //Java code to illustrate lambda expression without parameters
    //functional interface without parameters
    static void fun(Test1 t1) {
        t1.print();

    }


    public static void main(String[] args) {
        fun(() -> System.out.println("Hello"));

    }
}
