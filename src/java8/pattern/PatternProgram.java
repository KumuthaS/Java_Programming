package java8.pattern;

import java.util.stream.IntStream;

//Java Program to Print Right Triangle Star Pattern
public class PatternProgram {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

public class PatternProgramJava8 {
    public static void main(String[] args) {
    int rows=5;
        IntStream.rangeClosed(1,rows)
                .forEach(row->{IntStream.rangeClosed(1,row)
                        .forEach(i-> System.out.println("*"));
                    System.out.println();


        });

        }
    }
}

//Java Program to Print Left Triangle Star Pattern
class PatternProgram1 {
    public static void main(String[] args) {

        int rows = 5; // Number of rows in the pattern
        IntStream.rangeClosed(1,rows).forEach(row->{
            IntStream.rangeClosed(1,rows-row)
                    .forEach(i-> System.out.print(" "));

            IntStream.rangeClosed(1,row)
                    .forEach(i-> System.out.print("*"));
            System.out.println();
        });
    }
}

class NumberTriangle {
    public static void main(String[] args) {
        int numRows = 4; // Number of rows in the triangle

        // Loop through each row
        for (int i = 1; i <= numRows; i++) {
            // Print spaces to align the triangle to the right
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("  ");
            }

            // Print numbers increasing from the row number to the peak
            for (int j = i; j < i * 2; j++) {
                System.out.print(j + " ");
            }

            // Print numbers decreasing from the peak to the row number (excluding the peak)
            for (int j = i * 2 - 2; j >= i; j--) {
                System.out.print(j + " ");
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}
