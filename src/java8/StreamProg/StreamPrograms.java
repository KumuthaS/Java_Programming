package java8.StreamProg;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPrograms {
    public static void main(String[] args) {
        //even numbers that exist in the list using Stream functions

        //List<Integer> list=new ArrayList<>();
        List<Integer> list= Arrays.asList(1,4,20,13,16,12,18,19,55,89,47,50);
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
//all the numbers starting with 1
class StreamPrograms1{
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,20,13,16,12,18,19,55,89,47,50);
        //List<String> list1=Arrays.asList("1","13");
        list.stream().map(s->s+"")
                .filter(x->x.startsWith("1"))
                .forEach(System.out::println);
    }
}
//duplicate elements in a given integers list
class StreamPrograms2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 20, 4, 13, 16, 12, 12, 18, 19, 55, 89, 47, 50);
        HashSet<Integer> set=new HashSet<>();
        list.stream().filter(n->!set.add(n)).forEach(System.out::println);

    }
}

//find the first element of the list using Stream functions
class StreamPrograms3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 20, 4, 13, 16, 12, 12, 18, 19, 55, 89, 47, 50);
        Integer integer = list.stream().findFirst().get();
        System.out.println(integer);
    }
}

//find the total number of elements present in the list using Stream functions

class StreamPrograms4 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 20, 4, 13, 16, 12, 12, 18, 19, 55, 89, 47, 50);
        long count = list.stream().count();
        System.out.println(count);
    }
}


//find the maximum value element present in it using Stream functions
class StreamPrograms5 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 20, 4, 13, 16, 12, 12, 18, 19, 55, 89, 47, 50);
       // Integer integer = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        Integer integer = list.stream().max(Integer::compare).get();
        System.out.println(integer);
    }
}

class StreamPrograms6 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Kumu","Kani","Abc");
        List<String> collect = list.stream().filter(e -> e.startsWith("K"))
                .filter(e -> e.endsWith("u"))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}

//first non-repeated character in it using Stream functions
class FirstNonRepeated {
    public static void main(String args[]) {
        String input = "Java articles are Awesome";
        Character character = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(character);
    }
}

//find the first repeated character in it using Stream functions
class FirstRepeated1 {
    public static void main(String args[]) {
        String input = "Java articles are Awesome";
        Character character = input.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(character);

    }

    }

    //sort all the values present in it using Stream functions
     class SortValues {
        public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
            // myList.stream().sorted().forEach(System.out::println);
            List<Integer> collect = myList.stream().sorted().collect(Collectors.toList());
            System.out.println(collect);

        }
    }

    //sort all the values present in it in descending order using Stream functions
     class SortDescending {
        public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

            List<Integer> collect = myList.stream().sorted((i1, i2) -> i1 > i2 ? -1 : i1 < i2 ? 1 : 0).collect(Collectors.toList());
            System.out.println(collect);

        }
    }