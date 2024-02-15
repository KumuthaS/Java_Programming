public class NumberToWordExample1 {
    static void numberToWords(char num[]) {
//determines the number of digits in the given number
        int len = num.length;
        if (len == 0)
        {
//if the given number is empty prints the following statement
            System.out.println("The string is empty.");
            return;
        }
        if (len > 4)
        {
//if the given number is more than four-digit number, it prints the following statement
            System.out.println("\n The given number has more than 4 digits.");
            return;
        }
        String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] poweroftens = new String[] {"Hundred", "Thousand"};
        System.out.print(String.valueOf(num) + ": ");
        if (len == 1)
        {
//if the above condition returns true, it accesses the corresponding index and prints the value of that index
//[num[0]-'0']: getting the number equal the decimal value of the character (assuming the char is the digit)
            System.out.println(onedigit[num[0]-'0']);
            return;
        }
    }
        public static void main(String[] args) {
        numberToWords("1".toCharArray());

    }
}
