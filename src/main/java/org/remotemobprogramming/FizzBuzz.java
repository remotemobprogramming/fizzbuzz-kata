package org.remotemobprogramming;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

  public static void main(String[] args) {
    fizzBuzzStream(100).forEach(System.out::println);
  }

  static Stream<String> fizzBuzzStream(int maxNumber) {
    return IntStream.rangeClosed(1, maxNumber).mapToObj(FizzBuzz::fizzbuzz);
  }

  static String fizzbuzz(int number) {
    if (number % 15 == 0) {
      return "FizzBuzz";
    } else if (number % 3 == 0) {
      return "Fizz";
    } else if (number % 5 == 0) {
      return "Buzz";
    } else {
      return String.valueOf(number);
    }
  }
}
