package java8.coreJava;// super keyword in java example

// Base class vehicle
class SuperKeywordWithVariables {
    int maxSpeed = 120;
}

// sub class Car extending vehicle
class Car extends SuperKeywordWithVariables {
    int maxSpeed = 180;

    void display()
    {
        // print maxSpeed of base class (vehicle)
        System.out.println("Maximum Speed: "
                + super.maxSpeed);
    }
}

// Driver Program
class Testt {
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
    }
}
