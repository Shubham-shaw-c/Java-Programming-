import java.util.Arrays;

public class Array{
        public static void main(String[] args) {
        int[] marks = new int[]{79, 26, 95};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2] + "\n");
        System.out.println("Length function");
        System.out.println(marks.length);
        System.out.println("\n");
        System.out.println("Sorting function");
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}