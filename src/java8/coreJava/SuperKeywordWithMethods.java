package java8.coreJava;

public class SuperKeywordWithMethods {

    void show(){
        System.out.println("Hi hello");
    }

}

class Person extends SuperKeywordWithMethods{
    void show(){
        System.out.println("How are you");

    }
    void display(){

        show();
        super.show(); //super first line la kudutha super statement first varum //second kudutha second la varum

    }

}

class Testie{
    public static void main(String[] args) {
        Person s=new Person();
        s.display();

    }
}
