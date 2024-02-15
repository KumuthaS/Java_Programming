package java8.basicProgram;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BasicPrograms {
    public static void main(String[] args) {
        //Java Program to Read The Number From Standard Input
        System.out.println("Enter the number");
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("a="+a);
    }
}
//Java Program to Multiply Two Floating-Point Numbers
class MultiplyFloatingNum{
    public static void main(String[] args) {
        float a=10.0f,b=20.1f;
        float c=a*b;
        System.out.println("Multiply of two floating numbers are "+a +"*"+b+"="+c);
    }
}

  //  Java Program to Swap Two Numbers
class SwaptwoNumb{
      public static void main(String[] args) {
          int a=10,b=20;
          int temp;
          System.out.println("Before swap a and b values are "+a +" " +b );
          temp=a;
          a=b;
          b=temp;

          System.out.println("After swap a and b values are "+a +" "+b );

      }
  }

      //Java Program to Add Two Binary Strings
class AddBinaryNum{

     String add_binary(String x,String y){
int num1=Integer.parseInt(x,2);
int num2=Integer.parseInt(y,2);

int sum=num1+num2;
        String result=Integer.toBinaryString(sum);
        return result;
    }

          public static void main(String[] args) {
              AddBinaryNum addBinaryNum=new AddBinaryNum();
              String s = addBinaryNum.add_binary("11", "01");
              System.out.println(s);

          }
      }

      class ComplexNumber{
    int real,image;

          public ComplexNumber(int real, int image) {
              this.real = real;
              this.image = image;
          }

          public void show(){
              System.out.println(this.real+"i"+this.image);
          }
        public  static ComplexNumber add(ComplexNumber num1,ComplexNumber num2){
              ComplexNumber res=new ComplexNumber(0,0);
              res.real= num1.real+num2.real;
              res.image=num1.image+num2.image;
              return res;
          }

          public static void main(String[] args) {
              ComplexNumber c1=new ComplexNumber(10,4);
              ComplexNumber c2=new ComplexNumber(20,8);
              c1.show();
              c2.show();
              ComplexNumber res=add(c1,c2);
              res.show();
          }
      }
      //Java Program to Check Even or Odd Integers
class EvenOdd{
          public static void main(String[] args) {
              int a=10;
              if(a%2==0){
                  System.out.println("a is even number");
              }
              else
                  System.out.println("a is not even number");
          }
      }
class EvenOdd1{
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,4,15,60,44,74,753,5,66,42,90);
        List<Integer> collect = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}

//Java Program to Find Largest Among 3 Numbers
class LargestAmongThressNumb{
    public static void main(String[] args) {
        int a=10,b=19,c=13;
        if(a>=b && a>=c)
            System.out.println("a is greater");
        if(b>=a && b>=c)
            System.out.println("b is greater");
            else
            System.out.println("c is greater");

           }
        }

class LargestMax{
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,4,15,60,44,74,753,5,66,42,90);
        Integer integer = list.stream().max(Integer::compare).get();
        System.out.println(integer);
    }
}

//GCD of two numers
class GcdNumber {

    static int GCD(int u, int v)
    {
        if (u == 0)
            return v;
        return GCD(v % u, u);
    }
    static int LCM(int c, int d) {
        return c / (GCD(c, d)) * d;
    }


    public static void main(String[] args) {

        {
            int u = 25, v = 15;
            System.out.println("LCM of " + u + " and " + v
                    + " is " + LCM(u, v));
        }
    }
}

//prime Number
class Prime{
    public static void main(String[] args) {
        primeNumberCheck(1);
        primeNumberCheck(3);
        primeNumberCheck(17);
        primeNumberCheck(20);
    }

    private static void primeNumberCheck(int n) {
        int i,m=0,flag = 0;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime");
        }else
        for(i=2;i<=m;i++){
            if(n%i==0){
                System.out.println(n+ " is not prime");
                flag=1;
                break;
            }}
        
            if(flag==0)
                System.out.println(n+ " is a Prime Number");


        }
    }
//Java Program to Check Leap Year
class LeapYear{
    public static void main(String[] args) {
        int year=2012;
        if((year%400==0) || ((year%4==0)&&(year%100!=0))){
            System.out.println(year+ " is a leap year");
        }
        else
            System.out.println(year+" is not a leap year");
    }
}
//Java Program to Check Armstrong Number between Two Integers
class ArmstrongNumb{
    public static void main(String[] args) {
        int num = 153, number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}
//Neon Number
class NeonNumber{
    public static void main(String[] args) {
        int n = 9,square = n*n, total = 0;
        while (square> 0)
        {
            int r = square % 10;
            total = total + r;
            square /= 10;
        }

        if(total == n)
            System.out.println(n + " is an Neon number");
        else
            System.out.println(n + " is not an Neon number");
    }
}
//Java Program to Check whether input character is vowel or consonant
class CheclVowels{
    public static void main(String[] args) {
        char input = 'i';
        if (input =='a' || input =='e' || input =='i' ||input == 'o' || input =='u')
        {
            System.out.println(input+ " is a vowel ");
        }
        else {
            System.out.println("its not a vowel");
        }
    }
}

//Factorial
class Factorial{

    public static void main(String[] args) {
        int n= 5,res=1;
        for(int i=2;i<=n;i++){
            res=res*i;
        }
        System.out.println(n+" factorial number is "+"= "+res);


    }
}

//Fibonacci series
class Fibonacci{
    public static void main(String[] args) {
        int n=10;
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);
        for(int i=2;i<n;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
//Java Program to Calculate Simple Interest
class SimpleInterest{
    public static void main(String[] args) {
        float p=1,t=1,r=1;
        float SI=(p*t*r)/100;
        System.out.println(SI);
    }
}

//Java Program for compound interest
class CompoundInterest{
    public static void main(String[] args) {
        double principal = 1200, rate = 5.4, time = 2;
        double CI=principal*(Math.pow((1+rate/100),2));
        System.out.println(CI);
    }
}

//Java Program to Find the Perimeter of a Rectangle
class RectanglePerimeter{
    public static void main(String[] args) {
        int length=10,breath=20;
        int perimeter=2*(length+breath);
        System.out.println(perimeter);
    }
}