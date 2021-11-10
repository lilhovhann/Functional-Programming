package com.java.app.functional.programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 *
 * @author lilith
 */
public class Lambdas {

    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 4, 8, 9, 12, 0);

        BiggerThanFive bf = new BiggerThanFive();
        for (Integer num : nums) {

            //if number is bigger than five, test returns true and println method prints it
            System.out.println(bf.test(num) ? num : "");
        }

        List<String> armenianWords = Arrays.asList("shun", "door", "dog");

        Predicate<String> hasThreeLetters = word -> word.length() == 3;

        for (String w : armenianWords) {
            System.out.println(hasThreeLetters.test(w));
        }

    }

}
