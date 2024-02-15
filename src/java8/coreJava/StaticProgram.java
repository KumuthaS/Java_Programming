package java8.coreJava;

public class StaticProgram{
     private String name;
   private int roll_no;

    static String clgname;
    static int counter=0;

    public StaticProgram(String name) {
        this.name = name;
        this.roll_no=getRoll_no();
    }

     static void setClgname(String clgname) {
        StaticProgram.clgname = clgname;
    }

    static int getRoll_no() {
        counter++;
        return counter;
    }

    void display_studentDetails(){
        System.out.println("Name= "+this.name);
        System.out.println("College_name= "+clgname);
        System.out.println("Roll_No= "+this.getRoll_no());
    }

}

class Student_details{
    public static void main(String[] args) {
        StaticProgram.setClgname("SBU");
        StaticProgram student1=new StaticProgram("Kumutha");
        StaticProgram student2=new StaticProgram("Vignesh");

        student1.display_studentDetails();
        student2.display_studentDetails();

    }
}