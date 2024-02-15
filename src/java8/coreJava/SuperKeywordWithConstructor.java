package java8.coreJava;

public class SuperKeywordWithConstructor {
    public SuperKeywordWithConstructor() {

        System.out.println("SuperKeywordWithConstructor Constructor called");
    }

}
class Studenttt extends SuperKeywordWithConstructor{
    public Studenttt() {
        super();
        System.out.println("Studenttt Constructor Called");

    }
}

class Testtt {
    public static void main(String[] args)
    {
        Studenttt s = new Studenttt();
    }
}