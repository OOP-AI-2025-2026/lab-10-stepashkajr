package ua.opnu;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class EasyTasks {

    public static void main(String[] args) {
    }

    // Завдання 1
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .toList();
    }

    // Завдання 2
    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n)
                .toList();
    }

    // Завдання 3
    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y" + s + "y")
                .toList();
    }

    // Завдання 4
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .toList();
    }

    // Завдання 5
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 10 != 9)
                .toList();
    }

    // Завдання 6
    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .toList();
    }

    // Завдання 7
    public List<String> refinedStrings(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted(Comparator.comparing(String::length).reversed())
                .toList();
    }

    // Завдання 8
    public List<String> flatten(List<String> strings) {
        return strings.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .toList();
    }
}
