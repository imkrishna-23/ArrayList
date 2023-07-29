import java.util.*;

public class arrayList {

    private static Collections collections;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello krishna");
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add operation
        list1.add(2);
        list1.add(5);
        list1.add(9);
        list1.add(6);
        list1.add(8);

        System.out.println(list1);

        // get operation

        int element = list1.get(2);
        System.out.println(element);

        // remove elememt

        list1.remove(2);
        System.out.println(list1);

        // set operation

        list1.set(2, 10);
        System.out.println(list1);

        // contains

        System.out.println(list1.contains(2));

        // size of element

        System.out.println(list1.size());

        // print the arraylist

        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        // reverse the array

        for (int i = list1.size() - 1; i >= 0; i--) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        // find maximum in arraylist

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list1.size(); i++) {
            // if (max < list1.get(i)) {
            // max = list1.get(i);
            // }
            max = Math.max(max, list1.get(i));
        }
        System.out.println("max element = " + max);

        // swap two number

        // sorting an arraylist

        // ascending order
        Collections.sort(list1);
        System.out.println(list1);
        
        // descending order
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);

    }
}
