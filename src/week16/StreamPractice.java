package week16;

import java.util.*;
import java.util.stream.*;

public class StreamPractice {

    static List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 6, 8, 8, 8, 4, 4, 2, 2, 9, 0));

    public static void main(String[] args) {
//        one();
//        two();
//        three();
//        four();
        five();
    }


    public static void one() {
        System.out.println(nums.stream().distinct().collect(Collectors.toList()));
    }

    public static void two(){
        System.out.println(nums.stream().skip(5).collect(Collectors.toList()));
        System.out.println(nums.stream().limit(8).collect(Collectors.toList()));
        System.out.println(nums.stream().count());
    }

    public static void three(){
        nums.stream().forEach(n -> System.out.println(n));
        System.out.println(nums.stream().allMatch(n -> n >= 5));
        System.out.println(nums.stream().allMatch(n -> n >= 0));
    }

    public static void four(){
        System.out.println(nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));
    }

    public static void five(){
        System.out.println(nums);
        System.out.println(nums.stream().map(n -> n * n).collect(Collectors.toList()));
    }
}
