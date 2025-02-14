package Collections.List.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list.get(1));  // Output: Banana

        list.remove("Apple");  // Removes first occurrence
        System.out.println(list);  // Output: [Banana, Cherry]

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(30);
        list2.add(40);
        list2.add(90);
        System.out.println( "The Elemt at index 1 :"+ list2.get(1));
        System.out.println( "The Elemt at index 2 :"+ list2.get(2));

        list2.set(2,900);
        System.out.println("The Elemt at index 2 :"+list2.get(2));

        System.out.println("Using a for Loop");
        for (int i = 0; i <list2.size() ; i++) {
            System.out.print(list2.get(i)+" ");

        }
        System.out.println();

        System.out.println("Using an Enhanced for Loop");
        for (int n : list2){
            System.out.print(n+" ");
        }
        System.out.println();

        System.out.println("Using an Iterator");
        Iterator<Integer> iterator = list2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        list2.forEach(language -> System.out.println(language));

    }
}
