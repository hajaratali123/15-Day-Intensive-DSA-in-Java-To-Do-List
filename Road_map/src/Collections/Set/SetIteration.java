package Collections.Set;

import java.util.*;

public class SetIteration {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(10, 5, 20, 15));

        // 1️⃣ Using For-Each Loop
        System.out.println("For-Each Loop:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // 2️⃣ Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 3️⃣ Using Java 8 forEach() + Lambda
        System.out.println("\nUsing forEach() + Lambda:");
        numbers.forEach(num -> System.out.println(num));
    }
}
