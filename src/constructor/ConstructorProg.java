package constructor;

public class ConstructorProg {
    //Parametrized constructor
    private String name;

    public ConstructorProg(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorProg constructorProg = new ConstructorProg("kumu");
        System.out.println(constructorProg.name);
    }
}
    class DefaultConstructorProg {
        //Default Constructor
        private String name;

        public static void main(String[] args) {
            DefaultConstructorProg constructorProg = new DefaultConstructorProg();
            System.out.println(constructorProg.name);

        }
    }
    //No Arg Constrctor

        class NoArgsConstructorProg{
    private String name;

    public NoArgsConstructorProg() {
        name="kumu";
    }

    public static void main(String[] args) {
        NoArgsConstructorProg noArgsConstructorProg = new NoArgsConstructorProg();
        System.out.println(noArgsConstructorProg.name);

    }
}

class Another{
    public static void main(String[] args) {
        System.out.println("11111111");
    }
}
