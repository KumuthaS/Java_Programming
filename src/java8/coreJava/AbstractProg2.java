package java8.coreJava;

// Abstract class
abstract class Student {
    public Student() {
        System.out.println("Hi Hello"); //always Constructor will execute first if we are adding below also hi hello will come first
    }

    abstract void printInfo();
     void display(){
         System.out.println("Hi How are you");
     }
}

// Abstraction performed using extends
class Employee1 extends Student {
    void printInfo()
    {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

// Base class
class Base1 {
    public static void main(String args[])
    {
        Student s1=new Employee1();
        s1.printInfo();
        s1.display();

    }
}
