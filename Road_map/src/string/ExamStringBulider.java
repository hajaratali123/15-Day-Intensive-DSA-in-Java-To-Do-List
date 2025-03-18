package string;

public class ExamStringBulider {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb); // Output: "Hello World"

        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Rocks!");
        System.out.println(sbf); // Output: "Java Rocks!"


    }
}
