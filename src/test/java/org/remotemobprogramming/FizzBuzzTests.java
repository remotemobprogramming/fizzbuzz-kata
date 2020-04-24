package org.remotemobprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FizzBuzzTests {

  @ParameterizedTest
  @MethodSource("fizzBuzzArguments")
  void assertFizzBuzz(int number, String expected) {
    assertEquals(expected, FizzBuzz.fizzbuzz(number));
  }

  static Stream<Arguments> fizzBuzzArguments() {
    return Stream.of(
        arguments(1, "1"),
        arguments(2, "2"),
        arguments(3, "Fizz"),
        arguments(4, "4"),
        arguments(5, "Buzz"),
        arguments(6, "Fizz"),
        arguments(7, "7"),
        arguments(8, "8"),
        arguments(9, "Fizz"),
        arguments(10, "Buzz"),
        arguments(11, "11"),
        arguments(12, "Fizz"),
        arguments(13, "13"),
        arguments(14, "14"),
        arguments(15, "FizzBuzz"),
        arguments(30, "FizzBuzz"));
  }

  @Test
  void testFizzBuzzStream() {
    assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"),
        FizzBuzz.fizzBuzzStream(5).collect(Collectors.toList()));
  }
}
