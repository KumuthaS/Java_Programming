package stringprogram;

public class PrintEvenLengthWords {
    public static String main(String[] args) {
       /* String str="Hi Hello World ji";

        for(String s: str.split(" "))

        if(s.length() %2==0){
            System.out.println(s);
        }

        */

        String str="Hello";
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();



    }

    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();
    }
}
