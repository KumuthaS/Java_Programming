package java8.coreJava;

 class Students {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}


class MainProg{
    public static void main(String[] args) {
        Students students=new Students();
        students.setName("Kumu");
        students.setAge(10);

        System.out.println("Name is : "+students.getName()+"\n"+"Age is: "+students.getAge());
    }
}
