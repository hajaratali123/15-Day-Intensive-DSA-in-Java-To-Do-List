package Collections.List.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class  {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println(list.get(1));  // Output: Banana

        list.remove("Apple");  // Removes first occurrence
        System.out.println(list);  // Output: [Banana, Cherry]
    }
}
