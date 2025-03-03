package recursion.Intermediate_Level;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubsets {
    static void generateSubsets(List<Integer> set, List<Integer> subset, int index) {
        if (index == set.size()) {
            System.out.println(subset);
            return;
        }
        subset.add(set.get(index)); // Include element
        generateSubsets(set, subset, index + 1);
        subset.remove(subset.size() - 1); // Exclude element
        generateSubsets(set, subset, index + 1);
    }

    public static void main(String[] args) {
        List<Integer> set = List.of(1, 2, 3);
        generateSubsets(set, new ArrayList<>(), 0);
    }
}
